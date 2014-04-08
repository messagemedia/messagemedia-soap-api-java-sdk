/**
* Copyright 2014 MessageMedia
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
*  
* Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and limitations under the License. 
*/

package com.messagemedia.client;

import com.messagemedia.service.*;

import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

import com.messagemedia.service.BlockNumbersBodyType;
import com.messagemedia.service.BlockNumbersResultType;
import com.messagemedia.service.CheckRepliesBodyType;
import com.messagemedia.service.CheckRepliesResultType;
import com.messagemedia.service.CheckReportsBodyType;
import com.messagemedia.service.CheckReportsResultType;
import com.messagemedia.service.CheckUserResultType;
import com.messagemedia.service.ConfirmItemType;
import com.messagemedia.service.ConfirmRepliesBodyType;
import com.messagemedia.service.ConfirmRepliesResultType;
import com.messagemedia.service.ConfirmReportsBodyType;
import com.messagemedia.service.ConfirmReportsResultType;
import com.messagemedia.service.DeleteScheduledMessagesBodyType;
import com.messagemedia.service.DeleteScheduledMessagesResultType;
import com.messagemedia.service.FaultResponse;
import com.messagemedia.service.GetBlockedNumbersBodyType;
import com.messagemedia.service.GetBlockedNumbersResultType;
import com.messagemedia.service.MessageFormatType;
import com.messagemedia.service.MessageIdType;
import com.messagemedia.service.MessageMediaService;
import com.messagemedia.service.MessageMediaServiceInterface;
import com.messagemedia.service.AuthenticationType;
import com.messagemedia.service.MessageType;
import com.messagemedia.service.RecipientType;
import com.messagemedia.service.SendMessagesBodyType;
import com.messagemedia.service.SendMessagesResultType;
import com.messagemedia.service.UnblockNumbersBodyType;
import com.messagemedia.service.UnblockNumbersResultType;

/**
 * The MessageMediaSoapClient provides a wrapper to the SOAP API to facilitate
 * simpler interaction.
 * 
 * @author Chris Hawkins
 */
public class MessageMediaSoapClient {

	private MessageMediaServiceInterface serviceEndPoint;
	private AuthenticationType authentication;

	/**
	 * Instantiates a new MessageMedia service client for performing operations
	 * against the MessageMedia service.
	 * 
	 * @param userId	The username to use to authenticate to the MessageMedia service.
	 * @param password 	The password to use to authenticate to the MessageMedia service.
	 */
	public MessageMediaSoapClient(String userId, String password) throws ServiceException {
		authentication = new AuthenticationType(userId, password);
		serviceEndPoint = new MessageMediaService().getMessageMediaServiceEndPoint();
	}

	/**
	 * Returns information about the current user.
	 */
	public CheckUserResultType GetUserInfo() throws FaultResponse, RemoteException {
		return serviceEndPoint.checkUser(authentication);
	}

	/**
	 * This example demonstrates how to wrap the complexity associated with
	 * packaging up a message into a single method call for sending a single
	 * message.
	 * @param from 		From phone number - also known as Origin
	 * @param to		To phone number
	 * @param message   The content of the message
	 * @param messageId Your message identifier
	 * @return SendMessagesResultType object.
	 */
	public SendMessagesResultType SendMessage(String from, String to, String messageContent, long messageId)
			throws FaultResponse, RemoteException {
		
		// Construct the message
		MessageType message = new MessageType();
		message.setContent(messageContent);
		message.setDeliveryReport(true);
		message.setFormat(MessageFormatType.SMS);
		message.setValidityPeriod((short) 1);
		message.setSequenceNumber((long) 1);
		// messageType.scheduled = DateTime.Now;
		message.setOrigin(from);

		// Add the tags - if supported by your account type
		// MessageTagType[] tags = new MessageTagType[1];
		// tags[0] = new MessageTagType("My Tag Name", "My Tag Value");
		// messageType.setTags(tags);

		// Add the recipients
		RecipientType recipient = new RecipientType(messageId, to);
		RecipientsType recipients = new RecipientsType();
		recipients.getRecipient().add(recipient);
		message.setRecipients(recipients);
		
		MessageListType messageList = new MessageListType();
		messageList.setSendMode(MessageSendModeType.NORMAL);
		messageList.getMessage().add(message);

		// Setup the send message body
		SendMessagesBodyType sendMessageBody = new SendMessagesBodyType();
		sendMessageBody.setMessages(messageList);

		return serviceEndPoint.sendMessages(authentication, sendMessageBody);
	}

	/**
	 * This method takes a batch of messages which have been constructed and
	 * sends them.
	 * 
	 * @param sendMessageBody
	 *            The object which contains the batch of messages.
	 * @return SendMessagesResultType
	 */
	public SendMessagesResultType SendMessage(SendMessagesBodyType sendMessageBody) throws FaultResponse, RemoteException {
		return serviceEndPoint.sendMessages(authentication, sendMessageBody);
	}

	public CheckRepliesResultType CheckReplies() throws FaultResponse, RemoteException {
		return CheckReplies(100);
	}

	public CheckRepliesResultType CheckReplies(long maximumReplies) throws FaultResponse, RemoteException {
		Long maximumRepliesObject = maximumReplies > 0 ? new Long(maximumReplies) : null;
		return serviceEndPoint.checkReplies(authentication, new CheckRepliesBodyType(maximumRepliesObject));
	}

	/**
	 * Confirms receipt of a list or reply receipts.
	 * @param listOfReceiptIds
	 * @return
	 */
	public ConfirmRepliesResultType ConfirmReplies(List<Long> listOfReceiptIds)
			throws FaultResponse, RemoteException {
		
		// Take the list of receiptId's and prepare them for submission to the
		// SOAP API in the expected format.
		ConfirmItemType[] confirmItemType = new ConfirmItemType[listOfReceiptIds.size()];
		
		int i = 0;
		for (Long item : listOfReceiptIds) {
			confirmItemType[i] = new ConfirmItemType(item);
			i++;
		}

		return serviceEndPoint.confirmReplies(authentication, new ConfirmRepliesBodyType(confirmItemType));
	}

	public CheckReportsResultType CheckReports() throws FaultResponse, RemoteException {
		return CheckReports(100);
	}

	public CheckReportsResultType CheckReports(long maximumReports) throws FaultResponse, RemoteException {
		Long maximumReportsObject = maximumReports > 0 ? new Long(maximumReports) : null;
		return serviceEndPoint.checkReports(authentication,	new CheckReportsBodyType(maximumReportsObject));
	}

	public ConfirmReportsResultType ConfirmReports(List<Long> listOfReceiptIds) throws FaultResponse, RemoteException {
		
		// Take the list of receiptId's and prepare them for submission to the
		// SOAP API in the expected format.
		ConfirmItemType[] confirmItemType = new ConfirmItemType[listOfReceiptIds.size()];
		int i = 0;
		for (Long item : listOfReceiptIds) {
			confirmItemType[i] = new ConfirmItemType(new Long(item.longValue()));
			i++;
		}

		return serviceEndPoint.confirmReports(authentication, new ConfirmReportsBodyType(confirmItemType));
	}

	public DeleteScheduledMessagesResultType DeleteScheduledMessages(List<Long> listOfMessageIds) throws FaultResponse, RemoteException {
		
		// Take the list of receiptId's and prepare them for submission to the
		// SOAP API in the expected format.
		MessageIdType[] messageIdType = new MessageIdType[listOfMessageIds.size()];
		int i = 0;
		for (Long item : listOfMessageIds) {
			messageIdType[i] = new MessageIdType(item);
			i++;
		}

		return serviceEndPoint.deleteScheduledMessages(authentication, new DeleteScheduledMessagesBodyType(messageIdType));
	}

	public GetBlockedNumbersResultType GetBlockedNumbers()
			throws FaultResponse, RemoteException {
		return GetBlockedNumbers(100);
	}

	public GetBlockedNumbersResultType GetBlockedNumbers(long maximumRecipients) throws FaultResponse, RemoteException {
		Long maximumRecipientsObject = maximumRecipients > 0 ? new Long(maximumRecipients) : null;
		return serviceEndPoint.getBlockedNumbers(authentication, new GetBlockedNumbersBodyType(maximumRecipientsObject));
	}

	public BlockNumbersResultType BlockNumbers(RecipientType[] recipientType) throws FaultResponse, RemoteException {
		return serviceEndPoint.blockNumbers(authentication, new BlockNumbersBodyType(recipientType));
	}

	public UnblockNumbersResultType UnblockNumbers(RecipientType[] recipientType) throws FaultResponse, RemoteException {
		return serviceEndPoint.unblockNumbers(authentication, new UnblockNumbersBodyType(recipientType));
	}
}
