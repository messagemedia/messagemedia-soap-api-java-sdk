/**
* Copyright 2014 MessageMedia
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and limitations under the License. 
*/

package com.messagemedia.clientgui;

import com.messagemedia.client.MessageMediaSoapClient;
import com.messagemedia.service.BlockNumbersResultType;
import com.messagemedia.service.CheckRepliesResultType;
import com.messagemedia.service.CheckReportsResultType;
import com.messagemedia.service.CheckUserResultType;
import com.messagemedia.service.ConfirmRepliesResultType;
import com.messagemedia.service.ConfirmReportsResultType;
import com.messagemedia.service.DeleteScheduledMessagesResultType;
import com.messagemedia.service.GetBlockedNumbersResultType;
import com.messagemedia.service.MessageErrorType;
import com.messagemedia.service.MessageFormatType;
import com.messagemedia.service.MessageListType;
import com.messagemedia.service.MessageSendModeType;
import com.messagemedia.service.MessageType;
import com.messagemedia.service.RecipientType;
import com.messagemedia.service.RecipientsType;
import com.messagemedia.service.ReplyType;
import com.messagemedia.service.ReportType;
import com.messagemedia.service.SendMessagesBodyType;
import com.messagemedia.service.SendMessagesResultType;
import com.messagemedia.service.UnblockNumbersResultType;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Vector;

public class Manager {
	
	private static String userId;
	private static String password;

	private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
	
    /**
     * This example demonstrates how to authenticate a user and fetch their details.
     */
	public static String logIn(Window mWindow) {
		HeaderPanel panel = mWindow.getHeaderPanel();
		
		String inputUserId = panel.getUserIdField().getText();
		String inputPassword = new String(panel.getPasswordField().getPassword());
	    
		// Check credentials
    	try{
    		// Build client and make SOAP request
	        MessageMediaSoapClient client = new MessageMediaSoapClient(inputUserId,inputPassword);
	        CheckUserResultType result = client.GetUserInfo();
	        
	        // No exception was thrown, therefore the authorisation was successful.
	        
			// Extract account details
			String userType = String.valueOf(result.getAccountDetails().getType());
			String creditLimit = String.valueOf(result.getAccountDetails().getCreditLimit());
			String creditremaining = String.valueOf(result.getAccountDetails().getCreditRemaining());
			
			// Update GUI
			panel.getUserLabel().setText(inputUserId);
			panel.getTypeLabel().setText(userType);
			panel.getMessagesLabel().setText(creditremaining + "/" + creditLimit);
			mWindow.getHeaderPanel().getLoginPanel().setVisible(false);
			mWindow.getHeaderPanel().getLogoutPanel().setVisible(true);
			mWindow.buildInterface();
			
			// Update session userid and password
			userId = inputUserId;
			password = inputPassword;
			
			return "Login successful";			
    	}catch(Exception e){    
    		// Authorisation was unsuccessful
    		return "Error: " + e.getMessage();    		
    	}		
	}
	
    /**
     * This example demonstrates how to log out.
     */
	public static void logOut(Window mWindow) {
		// Update GUI
		HeaderPanel panel = mWindow.getHeaderPanel();
		panel.getLoginPanel().setVisible(true);
		panel.getLogoutPanel().setVisible(false);		
		panel.getUserIdField().setText("");
		panel.getPasswordField().setText("");
		
		mWindow.destroyInterface();
		
		// Remove session userid and password
		userId = "";
		password = "";
	}
    
    /**
     * This example demonstrates how to send a single message.
     * TODO: Add support for sending multiple messages in a single batch.
     */
    public static String sendMessage(SendPanel panel){
    	// Extract message attributes from GUI
    	String content   = panel.getContentField().getText();
    	String to        = panel.getToField().getText();
    	String origin    = panel.getOriginField().getText();
    	boolean delivery = panel.getDeliveryReportBox().isSelected();
		XMLGregorianCalendar scheduled = null;
    	
    	short validity   = 1;
    	long uid         = 0;
    	
    	// Confirm fields are non-empty before attempting to cast
		if (!"".equals(panel.getUidField().getText())){
			try{
				uid = Long.parseLong(panel.getUidField().getText());
			}catch(NumberFormatException e){
                System.err.println(e.getMessage());
            }
		}

		if (!"".equals(panel.getValidityPeriodField().getText())){
			try{
				validity = Short.parseShort(panel.getValidityPeriodField().getText());
			}catch(NumberFormatException e){
                System.err.println(e.getMessage());
            }
		}

		if (!"".equals(panel.getScheduledField().getText())) {
			try {
				Date date = DATE_FORMAT.parse(panel.getScheduledField().getText());
				GregorianCalendar gregorianCalendar = (GregorianCalendar) GregorianCalendar.getInstance();
				gregorianCalendar.setTime(date);
				scheduled = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregorianCalendar);
			} catch (Exception e) {
                System.err.println(e.getMessage());
            }
		}

    	// Build message
		MessageType message = new MessageType();
        message.setFormat(MessageFormatType.SMS);
        
		message.setContent(content);
        message.setDeliveryReport(delivery);
        message.setValidityPeriod(validity);

		if (!"".equals(origin)) {
			message.setOrigin(origin);
		}

		message.setScheduled(scheduled);
		
        // Add recipients
		RecipientType recipient = new RecipientType(uid, to);
		RecipientsType recipients = new RecipientsType();
		recipients.getRecipient().add(recipient);
		message.setRecipients(recipients);
		
		MessageListType messageList = new MessageListType();
		messageList.setSendMode(MessageSendModeType.NORMAL);
		messageList.getMessage().add(message);
		
		// The batch of messages are sent using a SendMessagesBodyType object.
        SendMessagesBodyType sendMessageBody = new SendMessagesBodyType();
        sendMessageBody.setMessages(messageList);
	
        try{           
        	// Build client and make SOAP request
	        MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            SendMessagesResultType result = client.SendMessage(sendMessageBody);
            
            return DisplaySendMessageResult(result);            
    	}catch(Exception e){
    		return "Error: " + e.getMessage();
    	}
    }

	public static String deleteScheduledMessage(SendPanel panel) {
		try {
			long uid = 0;

			if (!"".equals(panel.getUidField().getText())) {
				try {
					uid = Long.parseLong(panel.getUidField().getText());
				} catch(NumberFormatException e){}
			}
			// Build client and make SOAP request
			MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
			DeleteScheduledMessagesResultType result = client.DeleteScheduledMessages(Collections.singletonList(uid));

			return "Messages unscheduled: " + result.getUnscheduled();
		} catch(Exception e){
			return "Error: " + e.getMessage();
		}
	}

    /**
     * This example demonstrates how to fetch replies.
     * <em>You must then confirm receipt of each reply using the ConfirmReplies method.</em>
     */
    public static String getReplies(ReplyPanel panel){
    	String output = "";
    	
		// Clear replies table
    	panel.getDataModel().setRowCount(0);
    	
        try{
        	// Build client and make SOAP request
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            CheckRepliesResultType reply = client.CheckReplies();
            
            output = "Replies returned: " + reply.getReturned() +
            		 "\nRemaining replies: " + reply.getRemaining();
            
            if (reply.getReplies() != null){            	
            	DefaultTableModel model = panel.getDataModel();            	

            	// Update GUI
                for (ReplyType item : reply.getReplies().getReply()){                	
                	model.addRow(new Object[]{
                			item.getReceiptId(), 
                			item.getOrigin(), 
                			item.getContent(), 
                			item.getUid(), 
                			getPresentableDate(item.getReceived())});
                }
            }
            return output;
        }
        catch(Exception ex){
        	output = "Error: " + ex.getMessage();
        	return output;
        }        
    }
    
    /**
     * This example demonstrates how to confirm receipt of a list of replies.
     */
    public static String confirmReplies(ReplyPanel panel){
    	String output = "";
    	
    	DefaultTableModel model = panel.getDataModel();    	
    	List<Long> listOfReceiptIds = new ArrayList<Long>();
    	
    	if(model.getRowCount() != 0){
    		for(int i=0 ; i < model.getRowCount() ; i++){
    			listOfReceiptIds.add((Long) model.getValueAt(i,0));
    		}

            try{
            	// Build client and make SOAP request
                MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
                ConfirmRepliesResultType reply = client.ConfirmReplies(listOfReceiptIds);

                output = "Replies confirmed: " + reply.getConfirmed();
                
        		// Clear replies table
                model.setRowCount(0);
                
            }catch (Exception ex){
            	output = "Error: " + ex.getMessage();
            	return output;
            }	
    	}else{
    		output = "Error: No replies to confirm.";
    	}
        
        return output;
    } 
    
    /**
     * This example demonstrates how to fetch reports.
     * <em>You must then confirm receipt of each report using the ConfirmReports method.</em>
     */
    public static String getReports(ReportPanel panel){
    	String output = "";
    	
		// Clear reports table
    	panel.getDataModel().setRowCount(0);
    	
        try{
        	// Build client and make SOAP request
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            CheckReportsResultType report = client.CheckReports();
            
            output = "Reports returned: " + report.getReturned() +
            		 "\nRemaining reports: " + report.getRemaining();
            
            // Update GUI
            if (report.getReports() != null){            	
            	DefaultTableModel model = panel.getDataModel();            	

                for (ReportType item : report.getReports().getReport()){                	
                	model.addRow(new Object[]{
                			item.getReceiptId(), 
                			item.getRecipient(), 
                			item.getStatus(), 
                			item.getUid(), 
                			getPresentableDate(item.getTimestamp())});
                }
            }
            return output;
        }
        catch(Exception ex){
        	output = "Error: " + ex.getMessage();
        	return output;
        }        
    }
    
    /**
     * This example demonstrates how to confirm receipt of a list of reports.
     */
    public static String confirmReports(ReportPanel panel){
    	String output = "";
    	
    	DefaultTableModel model = panel.getDataModel();    	
    	List<Long> listOfReceiptIds = new ArrayList<Long>();
    	
    	if(model.getRowCount() != 0){
    		for(int i=0 ; i < model.getRowCount() ; i++){
    			listOfReceiptIds.add((Long) model.getValueAt(i,0));
    		}

            try{
            	// Build client and make SOAP request
                MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
                ConfirmReportsResultType report = client.ConfirmReports(listOfReceiptIds);

                output = "Reports confirmed: " + report.getConfirmed();
                
        		// Clear reports table
                model.setRowCount(0);
                
            }catch (Exception ex){
            	output = "Error: " + ex.getMessage();
            	return output;
            }	
    	}else{
    		output = "Error: No reports to confirm.";
    	}
        
        return output;
    } 
    
    /**
     * This example demonstrates how to fetch a list of blocked numbers.
     */
	public static String getBlockedNumbers(BlockPanel panel) {
		String output = "";
		
		// Clear blocked numbers table
		panel.getDataModel().setSize(0);
		
        try{
        	// Build client and make SOAP request
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            GetBlockedNumbersResultType blocked = client.GetBlockedNumbers();
            
            output = "Blocked numbers found: " + blocked.getFound() +
            		 "\nBlocked numbers returned: " + blocked.getReturned();
            
            if (blocked.getRecipients() != null){            	
            	DefaultListModel<String> model = panel.getDataModel();            	

                for (RecipientType item : blocked.getRecipients().getRecipient()){  
                	model.addElement(item.getValue());
                }
            }
            return output;
        }
        catch(Exception ex){
        	output = "Error: " + ex.getMessage();
        	return output;
        }        
	} 
	
    /**
     * This example demonstrates how to block a single number.
     */
	public static String blockNumber(BlockPanel panel) {
		String number = panel.getBlockedNumberField().getText();
		
		if(number.isEmpty()){
			return "Error: No number to block";
		}
		
        // Add the recipients
		RecipientType recipient = new RecipientType(0, number);
		RecipientType[] recipients = new RecipientType[1];
		recipients[0] = recipient;
		
        try{   
        	// Build client and make SOAP request
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            BlockNumbersResultType result = client.BlockNumbers(recipients);

            // Update table of blocked numbers
            getBlockedNumbers(panel);
            
            return DisplayBlockNumberResult(result);
        }
        catch(Exception ex){
        	return "Error: " + ex.getMessage();
        }        
	}
	
    /**
     * This example demonstrates how to unblock a single number.
     */
	public static String unblockNumbers(BlockPanel panel,boolean selectedOnly) {		
		Vector<RecipientType> recipients = new Vector<RecipientType>();

		// Get list data
		DefaultListModel<String> model = panel.getDataModel();
		JList<String> list = panel.getlist();
		
		// Get recipients
		for(int i = 0 ; i < model.size() ; i ++){
			if(selectedOnly && list.isSelectedIndex(i) || !selectedOnly){
				// Add recipient
				recipients.add(new RecipientType(0, model.get(i).toString()));
			}
		}
		
		// Convert to array
		RecipientType[] recipientsArr = recipients.toArray(new RecipientType[0]);
		
		if(recipientsArr.length == 0){
			return "Error: No numbers to unblock";
		}
		
        try{  
        	// Build client and make SOAP request
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            UnblockNumbersResultType result = client.UnblockNumbers(recipientsArr);

            // Update table of blocked numbers
            getBlockedNumbers(panel);
            
            return DisplayUnblockNumberResult(result);
        }
        catch(Exception ex){
        	return "Error: " + ex.getMessage();
        }  		
	}

    /**
     * Private helper method used to render the results of sending a message.
     */
    private static String DisplaySendMessageResult(SendMessagesResultType result){
    	String output = "";
    	
        // Build confirmation message
        output = "Messages sent: " + result.getSent() + 
        		  "\nMessages failed: " + result.getFailed() + 
        		  "\nMessages scheduled: " + result.getScheduled();
        
        // Build error message
        if(result.getErrors() != null){	        	
        	output += "\nErrors total: " + result.getErrors().getError().size();

            for (MessageErrorType error : result.getErrors().getError())
            {
            	output += "\nError code: " + error.getCode();
            	output += "\nError content: " + error.getContent();
            	output += "\nError sequence number: " + error.getSequenceNumber();

                if (error.getRecipients() != null)
                {
                    for (RecipientType currentRecipient : error.getRecipients().getRecipient())
                    {
                    	output += "\nError recipient: Uid: " + currentRecipient.getUid();
                    	output += "\nValue: " + currentRecipient.getValue();
                    }
                }
            }
        }        
        return output;
    }


    /**
     * Private helper method used to render the results of blocking a number.
     */
    private static String DisplayBlockNumberResult(BlockNumbersResultType result){
    	String output = "";
    	
        // Build confirmation message
        output = "Numbers blocked: " + result.getBlocked() + 
        		  "\nBlocks failed: " + result.getFailed();
        
        // Build error message
        if(result.getErrors() != null){	        	
        	output += "\nErrors total: " + result.getErrors().getError().size();

            for (MessageErrorType error : result.getErrors().getError())
            {
            	output += "\nError code: " + error.getCode();
            	output += "\nError content: " + error.getContent();
            	output += "\nError sequence number: " + error.getSequenceNumber();

                if (error.getRecipients() != null)
                {
                    for (RecipientType currentRecipient : error.getRecipients().getRecipient())
                    {
                    	output += "\nError recipient: Uid: " + currentRecipient.getUid();
                    	output += "\nValue: " + currentRecipient.getValue();
                    }
                }
            }
        }        
        return output;
    } 

    /**
     * Private helper method used to render the results of unblocking a number.
     */
    private static String DisplayUnblockNumberResult(UnblockNumbersResultType result){
    	String output = "";
    	
        // Build confirmation message
        output = "Numbers unblocked: " + result.getUnblocked() + 
        		  "\nUnlocks failed: " + result.getFailed();
        
        // Build error message
        if(result.getErrors() != null){	        	
        	output += "\nErrors total: " + result.getErrors().getError().size();

            for (MessageErrorType error : result.getErrors().getError())
            {
            	output += "\nError code: " + error.getCode();
            	output += "\nError content: " + error.getContent();
            	output += "\nError sequence number: " + error.getSequenceNumber();

                if (error.getRecipients() != null)
                {
                    for (RecipientType currentRecipient : error.getRecipients().getRecipient())
                    {
                    	output += "\nError recipient: Uid: " + currentRecipient.getUid();
                    	output += "\nValue: " + currentRecipient.getValue();
                    }
                }
            }
        }        
        return output;
    }    
    
    /**
     * Private helper method used to produce a presentable date from an XMLGregorianCalendar object.
     */
    private static String getPresentableDate(XMLGregorianCalendar calendar)
    {
    	return DATE_FORMAT.format(calendar.toGregorianCalendar().getTime());
    }
}
