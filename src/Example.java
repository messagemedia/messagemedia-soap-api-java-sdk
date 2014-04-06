import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.xml.datatype.XMLGregorianCalendar;

import com.messagemedia.client.MessageMediaSoapClient;
import com.messagemedia.service.BlockNumbersResultType;
import com.messagemedia.service.CheckRepliesResultType;
import com.messagemedia.service.CheckReportsResultType;
import com.messagemedia.service.CheckUserResultType;
import com.messagemedia.service.ConfirmRepliesResultType;
import com.messagemedia.service.ConfirmReportsResultType;
import com.messagemedia.service.DeleteScheduledMessagesResultType;
import com.messagemedia.service.DeliveryStatusType;
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

public class Example {
	
    // Replace the values in the App.config with your userId and password.
    private static String userId 			= 	"<your userId here>";
    private static String password 			= 	"<your password here>";

    // For this example we will use a default from and to number - enter the values in the App.config
    private static String sentFromNumber 	= 	"+61412345678";
    private static String sentToNumber 		= 	"+61412345678";

	public static void main(String[] args)
	{	
        CheckUserInfo();
        SendMessage();
        SendMultipleMessages();
        CheckReplies();
        CheckReports();
    }

	/**
	 * Example demonstrates how to quickly send a single message with the default settings.
	 */
    public static void SendMessage()
    {
        System.out.println("EXECUTING SEND MESSAGE...");
        
        try
        {
            long messageId = 1234567890;

            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            SendMessagesResultType result = client.SendMessage(sentFromNumber, sentToNumber, "Test Message", messageId);
            DisplaySendMessageResult(result);
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }

    /**
     * Example shows how to send a batch of messages. It's possible to send multiple individual messages in a single batch.
     */
    public static void SendMultipleMessages()
    {
    	System.out.println("EXECUTING SEND MULTIPLE MESSAGES...");
    	
        try
        {
            // Setup the various objects required to send a message.
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);

            // Construct the message
            MessageType message1 = new MessageType();
            message1.setContent("Content of Message 1 to Recipient 1");
            message1.setDeliveryReport(false);
            message1.setFormat(MessageFormatType.SMS);
            message1.setValidityPeriod((short)1);
            // (Optional) This attribute specifies a sequence number that is assigned to the message and is used to identify the message if an error occurs. Each message error in the response will specify the sequence number of the message that caused the error. Sequence numbers should be unique within the request. 1 to 2147483647.
            message1.setSequenceNumber(1L);
            // (Optional) This element specifies the message source address. The specified address will be used wherever possible, however due to limitations with various carriers, legislation etc, the final message is not guaranteed to come from the specified address.
            message1.setOrigin("Origin_1");

            // It is possible to add Tags to an individual message; this might be useful if wanting to identify a particular campaign or cost centre.
            // Add the tags - if supported by your account type
//            MessageTagType[] tags = new MessageTagType[1];
//            tags[0] = new MessageTagType("My Tag Name", "My Tag Value");
//            message1.setTags(tags); 

            // (Optional) This attribute specifies a user-defined unique ID that is assigned to a message-recipient pair. The uid is an unsigned integer that uniquely identifies a message sent to a particular recipient.
            // uid values are used for three things: to identify a message-recipient in the case of an error; to match a reply message to the sent message it is in response to; and to match a delivery report to the sent message it is in response to.
            // If no uid value is specified a default value of zero is assigned.
            long message1Id = 1234567890;

            // Add the recipients
            // TODO: Confirm the limits imposed upon recipient quantity
    		RecipientType recipient = new RecipientType(message1Id, sentToNumber);
    		RecipientsType recipients = new RecipientsType();
    		recipients.getRecipient().add(recipient);
    		message1.setRecipients(recipients);

            // Construct the message
            MessageType message2 = new MessageType();
            message2.setContent("Content of Message 2 to Recipient 2");
            message2.setDeliveryReport(false);
            message2.setFormat(MessageFormatType.SMS);
            message2.setValidityPeriod((short)1);
            // (Optional) This attribute specifies a sequence number that is assigned to the message and is used to identify the message if an error occurs. Each message error in the response will specify the sequence number of the message that caused the error. Sequence numbers should be unique within the request. 1 to 2147483647.
            message2.setSequenceNumber(1L);
            // (Optional) This element specifies the message source address. The specified address will be used wherever possible, however due to limitations with various carriers, legislation etc, the final message is not guaranteed to come from the specified address.
            message2.setOrigin("Origin_2");

            // It is possible to add Tags to an individual message; this might be useful if wanting to identify a particular campaign or cost centre.
            // Add the tags - if supported by your account type
//            MessageTagType[] tags = new MessageTagType[1];
//            tags[0] = new MessageTagType("My Tag Name", "My Tag Value");
//            message1.setTags(tags); 

            // (Optional) This attribute specifies a user-defined unique ID that is assigned to a message-recipient pair. The uid is an unsigned integer that uniquely identifies a message sent to a particular recipient.
            // uid values are used for three things: to identify a message-recipient in the case of an error; to match a reply message to the sent message it is in response to; and to match a delivery report to the sent message it is in response to.
            // If no uid value is specified a default value of zero is assigned.
            long message2Id = 234567890;

            // Add the recipients
            // TODO: Confirm the limits imposed upon recipient quantity
    		RecipientType recipient2 = new RecipientType(message2Id, sentToNumber);
    		RecipientsType recipients2 = new RecipientsType();
    		recipients2.getRecipient().add(recipient2);
    		message2.setRecipients(recipients2);


    		MessageListType messageList = new MessageListType();
    		messageList.setSendMode(MessageSendModeType.NORMAL);
    		messageList.getMessage().add(message1);
    		messageList.getMessage().add(message2);

            // The batch of messages are sent using a SendMessagesBodyType object.
            SendMessagesBodyType sendMessageBody = new SendMessagesBodyType();
            sendMessageBody.setMessages(messageList);

            System.out.printf("Sending %d message(s)", messageList.getMessage().size());
            System.out.println();

            SendMessagesResultType result = client.SendMessage(sendMessageBody);

            DisplaySendMessageResult(result);

        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }

    /**
     * Private method used for rendering the results to the console screen.
     * @param result
     */
    private static void DisplaySendMessageResult(SendMessagesResultType result)
    {
        System.out.println("Messages sent: " + result.getSent());
        System.out.println("Messages failed: " + result.getFailed());
        System.out.println("Messages scheduled: " + result.getScheduled());

        if (result.getErrors() == null) return;

        System.out.println("Errors total: " + result.getErrors().getError().size());

        for (MessageErrorType error : result.getErrors().getError())
        {
        	System.out.println("Error code: " + error.getCode());
        	System.out.println("Error content: " + error.getContent());
        	System.out.println("Error sequence number: " + error.getSequenceNumber());

            if (error.getRecipients() != null)
            {
                for (RecipientType recipient : error.getRecipients().getRecipient())
                {
                	System.out.print("Error recipient: Uid: " + recipient.getUid());
                	System.out.println(" Value: " + recipient.getValue());
                }
            }
        }
    } 

    /**
     * Example demonstrates how to get account and credit remaining information.
     */
    public static void CheckUserInfo()
    {
    	System.out.println("EXECUTING CHECK USER INFO...");
        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            CheckUserResultType result = client.GetUserInfo();

            System.out.println("Credit limit: " + result.getAccountDetails().getCreditLimit());
            System.out.println("Remaining credit: " + result.getAccountDetails().getCreditRemaining());
            System.out.println("Account type: " + result.getAccountDetails().getType());
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    } 

    /**
     * Example demonstrates how to fetch replies.
     * <em>You must then confirm receipt of each reply using the ConfirmReplies method.</em>
     */
    public static void CheckReplies()
    {
    	System.out.println("EXECUTING CHECK REPLIES...");
    	
        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            CheckRepliesResultType reply = client.CheckReplies();

            System.out.println("Remaining replies: " + reply.getRemaining());
            System.out.println("Replies returned: " + reply.getReturned());

            if (reply.getReplies() == null) return;

            // Create a list to hold the receipts of the replies you want to confirm you have received.
            List<Long> listOfReceiptIds = new ArrayList<Long>();

            for (ReplyType item : reply.getReplies().getReply())
            {
            	System.out.println("Reply receipt id: " + item.getReceiptId());
            	System.out.println("Reply uid: " + item.getUid());
            	System.out.println("Reply received date time: " + getPresentableDate(item.getReceived()));
            	System.out.println("Reply origin: " + item.getOrigin());
            	System.out.println("Reply content: " + item.getContent());
            	System.out.println("Reply format: " + item.getFormat());

                listOfReceiptIds.add(item.getReceiptId());
            }

            // Confirm the receipt of each reply
            if (listOfReceiptIds.size() > 0) ConfirmReplies(listOfReceiptIds);
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }

    /**
     * Example demonstrates how to confirm receipt of a list of replies.
     * @param listOfReceiptIds List of receiptId's
     */
    private static void ConfirmReplies(List<Long> listOfReceiptIds)
    {
    	System.out.println("EXECUTING CONFIRM REPLIES....");
        if (listOfReceiptIds.size() == 0) return;
        
        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            ConfirmRepliesResultType reply = client.ConfirmReplies(listOfReceiptIds);

            System.out.println("Replies confirmed: " + reply.getConfirmed());
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    } 

    /**
     * Example demonstrates how to fetch reports on delivery status.
     * <em>You must then confirm receipt of each report using the ConfirmReports method.</em>
     */
    public static void CheckReports()
    {
    	System.out.println("EXECUTING CHECK REPORTS...");
        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            CheckReportsResultType reply = client.CheckReports();

            System.out.println("Remaining replies: " + reply.getRemaining());
            System.out.println("Replies returned: " + reply.getReturned());

            if (reply.getReports() == null) return;

            // Create a list to hold the receipts of the reports you want to confirm you have received.
            List<Long> listOfReceiptIds = new ArrayList<Long>();

            for (ReportType item : reply.getReports().getReport())
            {
            	System.out.println("Reply receipt id: " + item.getReceiptId());
            	System.out.println("Reply uid: " + item.getUid());
            	System.out.println("Reply received date time: " + getPresentableDate(item.getTimestamp()));
            	System.out.println("Reply status: " + item.getStatus());
            	System.out.println("Reply recipient: " + item.getRecipient());

                // Add the receipt of the report for each delivered message (or for every status if you choose)
                if (item.getStatus().equals(DeliveryStatusType.DELIVERED))
                {
                    listOfReceiptIds.add(item.getReceiptId());
                }
            }

            // Confirm the receipt of each report
            if (listOfReceiptIds.size() > 0) ConfirmReports(listOfReceiptIds);
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }

    /**
     * Example demonstrates how to confirm receipt of a list of reports.
     * @param listOfReceiptIds List of receiptId's
     */
    private static void ConfirmReports(List<Long> listOfReceiptIds)
    {
    	System.out.println("EXECUTING CONFIRM REPORTS....");
        if (listOfReceiptIds.size() == 0) return;
        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            ConfirmReportsResultType reply = client.ConfirmReports(listOfReceiptIds);

            System.out.println("Reports confirmed: " + reply.getConfirmed());
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    } 
    
    /**
     * Delete a selection of scheduled messages. You will need to store which messageId's have been scheduled when you originally submit them.
     * @param listOfMessageIds
     */
    public static void DeleteScheduledMessages(List<Long> listOfMessageIds)
    {
    	System.out.println("EXECUTING DELETE SCHEDULED MESSAGES....");

        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);
            DeleteScheduledMessagesResultType reply = client.DeleteScheduledMessages(listOfMessageIds);

            System.out.println("Messages unscheduled: " + reply.getUnscheduled());
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    } 

    /**
     * Example shows how to block numbers.
     */
    public static void BlockNumbers()
    {
    	System.out.println("EXECUTING BLOCK NUMBERS....");

        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);

            RecipientType[] recipientType = new RecipientType[2];
            recipientType[0] = new RecipientType(1, "+614123456789");
            recipientType[1] = new RecipientType(2, "+614987654321");

            BlockNumbersResultType reply = client.BlockNumbers(recipientType);

            System.out.println("Numbers blocked: " + reply.getBlocked());

            if (reply.getErrors() == null) return;

            System.out.println("Errors total: " + reply.getErrors().getError().size());

            for (MessageErrorType error : reply.getErrors().getError())
            {
            	System.out.println("Error code: " + error.getCode());
            	System.out.println("Error content: " + error.getContent());
            	System.out.println("Error sequence number: " + error.getSequenceNumber());

                if (error.getRecipients() != null)
                {
                    for (RecipientType recipient : error.getRecipients().getRecipient())
                    {
                    	System.out.printf("Error recipient: Uid: %l Value: %s", recipient.getUid(), recipient.getValue());
                    	System.out.println();
                    }
                }
            }
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }

    public static void UnblockNumbers()
    {
    	System.out.println("EXECUTING UNBLOCK NUMBERS....");

        try
        {
            MessageMediaSoapClient client = new MessageMediaSoapClient(userId, password);

            RecipientType[] recipientType = new RecipientType[2];
            recipientType[0] = new RecipientType(1, "+614123456789");
            recipientType[1] = new RecipientType(2, "+614987654321");

            UnblockNumbersResultType reply = client.UnblockNumbers(recipientType);

            System.out.println("Numbers unblocked: " + reply.getUnblocked());

            if (reply.getErrors() == null) return;

            System.out.println("Errors total: " + reply.getErrors().getError().size());

            for (MessageErrorType error : reply.getErrors().getError())
            {
            	System.out.println("Error code: " + error.getCode());
            	System.out.println("Error content: " + error.getContent());
            	System.out.println("Error sequence number: " + error.getSequenceNumber());

                if (error.getRecipients() != null)
                {
                    for (RecipientType recipient : error.getRecipients().getRecipient())
                    {
                    	System.out.printf("Error recipient: Uid: %l Value: %s", recipient.getUid(), recipient.getValue());
                    	System.out.println();
                    }
                }
            }
        }
        catch (Exception ex)
        {
        	System.out.println("Error: " + ex.getMessage());
        	ex.printStackTrace();
        }
    }
    
    private static String getPresentableDate(XMLGregorianCalendar calendar)
    {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    	return sdf.format(calendar.toGregorianCalendar().getTime());
    }
}
