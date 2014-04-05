
package com.messagemedia.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.messagemedia.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckReportsResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "checkReportsResponse");
    private final static QName _DeleteScheduledMessages_QNAME = new QName("http://xml.m4u.com.au/2009", "deleteScheduledMessages");
    private final static QName _GetBlockedNumbersResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "getBlockedNumbersResponse");
    private final static QName _DeleteScheduledMessagesResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "deleteScheduledMessagesResponse");
    private final static QName _ConfirmReports_QNAME = new QName("http://xml.m4u.com.au/2009", "confirmReports");
    private final static QName _CheckRepliesResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "checkRepliesResponse");
    private final static QName _BlockNumbersResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "blockNumbersResponse");
    private final static QName _UnblockNumbersResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "unblockNumbersResponse");
    private final static QName _CheckUserResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "checkUserResponse");
    private final static QName _ConfirmReportsResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "confirmReportsResponse");
    private final static QName _CheckReplies_QNAME = new QName("http://xml.m4u.com.au/2009", "checkReplies");
    private final static QName _ConfirmReplies_QNAME = new QName("http://xml.m4u.com.au/2009", "confirmReplies");
    private final static QName _BlockNumbers_QNAME = new QName("http://xml.m4u.com.au/2009", "blockNumbers");
    private final static QName _ConfirmRepliesResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "confirmRepliesResponse");
    private final static QName _UnblockNumbers_QNAME = new QName("http://xml.m4u.com.au/2009", "unblockNumbers");
    private final static QName _FaultResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "faultResponse");
    private final static QName _SendMessages_QNAME = new QName("http://xml.m4u.com.au/2009", "sendMessages");
    private final static QName _SendMessagesResponse_QNAME = new QName("http://xml.m4u.com.au/2009", "sendMessagesResponse");
    private final static QName _GetBlockedNumbers_QNAME = new QName("http://xml.m4u.com.au/2009", "getBlockedNumbers");
    private final static QName _CheckReports_QNAME = new QName("http://xml.m4u.com.au/2009", "checkReports");
    private final static QName _CheckUser_QNAME = new QName("http://xml.m4u.com.au/2009", "checkUser");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.messagemedia.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UnblockNumbersResponseType }
     * 
     */
    public UnblockNumbersResponseType createUnblockNumbersResponseType() {
        return new UnblockNumbersResponseType();
    }

    /**
     * Create an instance of {@link BlockNumbersResponseType }
     * 
     */
    public BlockNumbersResponseType createBlockNumbersResponseType() {
        return new BlockNumbersResponseType();
    }

    /**
     * Create an instance of {@link DeleteScheduledMessagesResponseType }
     * 
     */
    public DeleteScheduledMessagesResponseType createDeleteScheduledMessagesResponseType() {
        return new DeleteScheduledMessagesResponseType();
    }

    /**
     * Create an instance of {@link GetBlockedNumbersResponseType }
     * 
     */
    public GetBlockedNumbersResponseType createGetBlockedNumbersResponseType() {
        return new GetBlockedNumbersResponseType();
    }

    /**
     * Create an instance of {@link CheckRepliesResponseType }
     * 
     */
    public CheckRepliesResponseType createCheckRepliesResponseType() {
        return new CheckRepliesResponseType();
    }

    /**
     * Create an instance of {@link ConfirmReportsRequestType }
     * 
     */
    public ConfirmReportsRequestType createConfirmReportsRequestType() {
        return new ConfirmReportsRequestType();
    }

    /**
     * Create an instance of {@link DeleteScheduledMessagesRequestType }
     * 
     */
    public DeleteScheduledMessagesRequestType createDeleteScheduledMessagesRequestType() {
        return new DeleteScheduledMessagesRequestType();
    }

    /**
     * Create an instance of {@link CheckReportsResponseType }
     * 
     */
    public CheckReportsResponseType createCheckReportsResponseType() {
        return new CheckReportsResponseType();
    }

    /**
     * Create an instance of {@link CheckUserRequestType }
     * 
     */
    public CheckUserRequestType createCheckUserRequestType() {
        return new CheckUserRequestType();
    }

    /**
     * Create an instance of {@link GetBlockedNumbersRequestType }
     * 
     */
    public GetBlockedNumbersRequestType createGetBlockedNumbersRequestType() {
        return new GetBlockedNumbersRequestType();
    }

    /**
     * Create an instance of {@link SendMessagesRequestType }
     * 
     */
    public SendMessagesRequestType createSendMessagesRequestType() {
        return new SendMessagesRequestType();
    }

    /**
     * Create an instance of {@link SendMessagesResponseType }
     * 
     */
    public SendMessagesResponseType createSendMessagesResponseType() {
        return new SendMessagesResponseType();
    }

    /**
     * Create an instance of {@link CheckReportsRequestType }
     * 
     */
    public CheckReportsRequestType createCheckReportsRequestType() {
        return new CheckReportsRequestType();
    }

    /**
     * Create an instance of {@link UnblockNumbersRequestType }
     * 
     */
    public UnblockNumbersRequestType createUnblockNumbersRequestType() {
        return new UnblockNumbersRequestType();
    }

    /**
     * Create an instance of {@link BlockNumbersRequestType }
     * 
     */
    public BlockNumbersRequestType createBlockNumbersRequestType() {
        return new BlockNumbersRequestType();
    }

    /**
     * Create an instance of {@link ConfirmRepliesResponseType }
     * 
     */
    public ConfirmRepliesResponseType createConfirmRepliesResponseType() {
        return new ConfirmRepliesResponseType();
    }

    /**
     * Create an instance of {@link FaultResponseType }
     * 
     */
    public FaultResponseType createFaultResponseType() {
        return new FaultResponseType();
    }

    /**
     * Create an instance of {@link CheckUserResponseType }
     * 
     */
    public CheckUserResponseType createCheckUserResponseType() {
        return new CheckUserResponseType();
    }

    /**
     * Create an instance of {@link ConfirmReportsResponseType }
     * 
     */
    public ConfirmReportsResponseType createConfirmReportsResponseType() {
        return new ConfirmReportsResponseType();
    }

    /**
     * Create an instance of {@link CheckRepliesRequestType }
     * 
     */
    public CheckRepliesRequestType createCheckRepliesRequestType() {
        return new CheckRepliesRequestType();
    }

    /**
     * Create an instance of {@link ConfirmRepliesRequestType }
     * 
     */
    public ConfirmRepliesRequestType createConfirmRepliesRequestType() {
        return new ConfirmRepliesRequestType();
    }

    /**
     * Create an instance of {@link MessageTagListType }
     * 
     */
    public MessageTagListType createMessageTagListType() {
        return new MessageTagListType();
    }

    /**
     * Create an instance of {@link CheckUserResultType }
     * 
     */
    public CheckUserResultType createCheckUserResultType() {
        return new CheckUserResultType();
    }

    /**
     * Create an instance of {@link MessageTagType }
     * 
     */
    public MessageTagType createMessageTagType() {
        return new MessageTagType();
    }

    /**
     * Create an instance of {@link DeleteScheduledMessagesResultType }
     * 
     */
    public DeleteScheduledMessagesResultType createDeleteScheduledMessagesResultType() {
        return new DeleteScheduledMessagesResultType();
    }

    /**
     * Create an instance of {@link ReportListType }
     * 
     */
    public ReportListType createReportListType() {
        return new ReportListType();
    }

    /**
     * Create an instance of {@link MessageListType }
     * 
     */
    public MessageListType createMessageListType() {
        return new MessageListType();
    }

    /**
     * Create an instance of {@link MessageIdListType }
     * 
     */
    public MessageIdListType createMessageIdListType() {
        return new MessageIdListType();
    }

    /**
     * Create an instance of {@link MessageErrorListType }
     * 
     */
    public MessageErrorListType createMessageErrorListType() {
        return new MessageErrorListType();
    }

    /**
     * Create an instance of {@link MessageType }
     * 
     */
    public MessageType createMessageType() {
        return new MessageType();
    }

    /**
     * Create an instance of {@link AuthenticationType }
     * 
     */
    public AuthenticationType createAuthenticationType() {
        return new AuthenticationType();
    }

    /**
     * Create an instance of {@link FaultResultType }
     * 
     */
    public FaultResultType createFaultResultType() {
        return new FaultResultType();
    }

    /**
     * Create an instance of {@link RecipientType }
     * 
     */
    public RecipientType createRecipientType() {
        return new RecipientType();
    }

    /**
     * Create an instance of {@link CheckRepliesBodyType }
     * 
     */
    public CheckRepliesBodyType createCheckRepliesBodyType() {
        return new CheckRepliesBodyType();
    }

    /**
     * Create an instance of {@link ConfirmReportsBodyType }
     * 
     */
    public ConfirmReportsBodyType createConfirmReportsBodyType() {
        return new ConfirmReportsBodyType();
    }

    /**
     * Create an instance of {@link SendMessagesResultType }
     * 
     */
    public SendMessagesResultType createSendMessagesResultType() {
        return new SendMessagesResultType();
    }

    /**
     * Create an instance of {@link BlockNumbersBodyType }
     * 
     */
    public BlockNumbersBodyType createBlockNumbersBodyType() {
        return new BlockNumbersBodyType();
    }

    /**
     * Create an instance of {@link CheckReportListType }
     * 
     */
    public CheckReportListType createCheckReportListType() {
        return new CheckReportListType();
    }

    /**
     * Create an instance of {@link UnblockNumbersBodyType }
     * 
     */
    public UnblockNumbersBodyType createUnblockNumbersBodyType() {
        return new UnblockNumbersBodyType();
    }

    /**
     * Create an instance of {@link SendMessagesBodyType }
     * 
     */
    public SendMessagesBodyType createSendMessagesBodyType() {
        return new SendMessagesBodyType();
    }

    /**
     * Create an instance of {@link CheckRepliesResultType }
     * 
     */
    public CheckRepliesResultType createCheckRepliesResultType() {
        return new CheckRepliesResultType();
    }

    /**
     * Create an instance of {@link GetBlockedNumbersBodyType }
     * 
     */
    public GetBlockedNumbersBodyType createGetBlockedNumbersBodyType() {
        return new GetBlockedNumbersBodyType();
    }

    /**
     * Create an instance of {@link ReplyType }
     * 
     */
    public ReplyType createReplyType() {
        return new ReplyType();
    }

    /**
     * Create an instance of {@link DeleteScheduledMessagesBodyType }
     * 
     */
    public DeleteScheduledMessagesBodyType createDeleteScheduledMessagesBodyType() {
        return new DeleteScheduledMessagesBodyType();
    }

    /**
     * Create an instance of {@link CheckReportsResultType }
     * 
     */
    public CheckReportsResultType createCheckReportsResultType() {
        return new CheckReportsResultType();
    }

    /**
     * Create an instance of {@link ConfirmReportsResultType }
     * 
     */
    public ConfirmReportsResultType createConfirmReportsResultType() {
        return new ConfirmReportsResultType();
    }

    /**
     * Create an instance of {@link CheckReportsBodyType }
     * 
     */
    public CheckReportsBodyType createCheckReportsBodyType() {
        return new CheckReportsBodyType();
    }

    /**
     * Create an instance of {@link ConfirmReplyListType }
     * 
     */
    public ConfirmReplyListType createConfirmReplyListType() {
        return new ConfirmReplyListType();
    }

    /**
     * Create an instance of {@link RecipientsType }
     * 
     */
    public RecipientsType createRecipientsType() {
        return new RecipientsType();
    }

    /**
     * Create an instance of {@link UnblockNumbersResultType }
     * 
     */
    public UnblockNumbersResultType createUnblockNumbersResultType() {
        return new UnblockNumbersResultType();
    }

    /**
     * Create an instance of {@link ConfirmRepliesBodyType }
     * 
     */
    public ConfirmRepliesBodyType createConfirmRepliesBodyType() {
        return new ConfirmRepliesBodyType();
    }

    /**
     * Create an instance of {@link GetBlockedNumbersResultType }
     * 
     */
    public GetBlockedNumbersResultType createGetBlockedNumbersResultType() {
        return new GetBlockedNumbersResultType();
    }

    /**
     * Create an instance of {@link ConfirmRepliesResultType }
     * 
     */
    public ConfirmRepliesResultType createConfirmRepliesResultType() {
        return new ConfirmRepliesResultType();
    }

    /**
     * Create an instance of {@link ReportType }
     * 
     */
    public ReportType createReportType() {
        return new ReportType();
    }

    /**
     * Create an instance of {@link ReplyListType }
     * 
     */
    public ReplyListType createReplyListType() {
        return new ReplyListType();
    }

    /**
     * Create an instance of {@link BlockNumbersResultType }
     * 
     */
    public BlockNumbersResultType createBlockNumbersResultType() {
        return new BlockNumbersResultType();
    }

    /**
     * Create an instance of {@link MessageErrorType }
     * 
     */
    public MessageErrorType createMessageErrorType() {
        return new MessageErrorType();
    }

    /**
     * Create an instance of {@link MessageIdType }
     * 
     */
    public MessageIdType createMessageIdType() {
        return new MessageIdType();
    }

    /**
     * Create an instance of {@link CheckRepliesType }
     * 
     */
    public CheckRepliesType createCheckRepliesType() {
        return new CheckRepliesType();
    }

    /**
     * Create an instance of {@link ConfirmReportListType }
     * 
     */
    public ConfirmReportListType createConfirmReportListType() {
        return new ConfirmReportListType();
    }

    /**
     * Create an instance of {@link ConfirmItemType }
     * 
     */
    public ConfirmItemType createConfirmItemType() {
        return new ConfirmItemType();
    }

    /**
     * Create an instance of {@link AccountDetailsType }
     * 
     */
    public AccountDetailsType createAccountDetailsType() {
        return new AccountDetailsType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckReportsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkReportsResponse")
    public JAXBElement<CheckReportsResponseType> createCheckReportsResponse(CheckReportsResponseType value) {
        return new JAXBElement<CheckReportsResponseType>(_CheckReportsResponse_QNAME, CheckReportsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScheduledMessagesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "deleteScheduledMessages")
    public JAXBElement<DeleteScheduledMessagesRequestType> createDeleteScheduledMessages(DeleteScheduledMessagesRequestType value) {
        return new JAXBElement<DeleteScheduledMessagesRequestType>(_DeleteScheduledMessages_QNAME, DeleteScheduledMessagesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlockedNumbersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "getBlockedNumbersResponse")
    public JAXBElement<GetBlockedNumbersResponseType> createGetBlockedNumbersResponse(GetBlockedNumbersResponseType value) {
        return new JAXBElement<GetBlockedNumbersResponseType>(_GetBlockedNumbersResponse_QNAME, GetBlockedNumbersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteScheduledMessagesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "deleteScheduledMessagesResponse")
    public JAXBElement<DeleteScheduledMessagesResponseType> createDeleteScheduledMessagesResponse(DeleteScheduledMessagesResponseType value) {
        return new JAXBElement<DeleteScheduledMessagesResponseType>(_DeleteScheduledMessagesResponse_QNAME, DeleteScheduledMessagesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmReportsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "confirmReports")
    public JAXBElement<ConfirmReportsRequestType> createConfirmReports(ConfirmReportsRequestType value) {
        return new JAXBElement<ConfirmReportsRequestType>(_ConfirmReports_QNAME, ConfirmReportsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepliesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkRepliesResponse")
    public JAXBElement<CheckRepliesResponseType> createCheckRepliesResponse(CheckRepliesResponseType value) {
        return new JAXBElement<CheckRepliesResponseType>(_CheckRepliesResponse_QNAME, CheckRepliesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNumbersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "blockNumbersResponse")
    public JAXBElement<BlockNumbersResponseType> createBlockNumbersResponse(BlockNumbersResponseType value) {
        return new JAXBElement<BlockNumbersResponseType>(_BlockNumbersResponse_QNAME, BlockNumbersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnblockNumbersResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "unblockNumbersResponse")
    public JAXBElement<UnblockNumbersResponseType> createUnblockNumbersResponse(UnblockNumbersResponseType value) {
        return new JAXBElement<UnblockNumbersResponseType>(_UnblockNumbersResponse_QNAME, UnblockNumbersResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkUserResponse")
    public JAXBElement<CheckUserResponseType> createCheckUserResponse(CheckUserResponseType value) {
        return new JAXBElement<CheckUserResponseType>(_CheckUserResponse_QNAME, CheckUserResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmReportsResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "confirmReportsResponse")
    public JAXBElement<ConfirmReportsResponseType> createConfirmReportsResponse(ConfirmReportsResponseType value) {
        return new JAXBElement<ConfirmReportsResponseType>(_ConfirmReportsResponse_QNAME, ConfirmReportsResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckRepliesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkReplies")
    public JAXBElement<CheckRepliesRequestType> createCheckReplies(CheckRepliesRequestType value) {
        return new JAXBElement<CheckRepliesRequestType>(_CheckReplies_QNAME, CheckRepliesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmRepliesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "confirmReplies")
    public JAXBElement<ConfirmRepliesRequestType> createConfirmReplies(ConfirmRepliesRequestType value) {
        return new JAXBElement<ConfirmRepliesRequestType>(_ConfirmReplies_QNAME, ConfirmRepliesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BlockNumbersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "blockNumbers")
    public JAXBElement<BlockNumbersRequestType> createBlockNumbers(BlockNumbersRequestType value) {
        return new JAXBElement<BlockNumbersRequestType>(_BlockNumbers_QNAME, BlockNumbersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmRepliesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "confirmRepliesResponse")
    public JAXBElement<ConfirmRepliesResponseType> createConfirmRepliesResponse(ConfirmRepliesResponseType value) {
        return new JAXBElement<ConfirmRepliesResponseType>(_ConfirmRepliesResponse_QNAME, ConfirmRepliesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UnblockNumbersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "unblockNumbers")
    public JAXBElement<UnblockNumbersRequestType> createUnblockNumbers(UnblockNumbersRequestType value) {
        return new JAXBElement<UnblockNumbersRequestType>(_UnblockNumbers_QNAME, UnblockNumbersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FaultResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "faultResponse")
    public JAXBElement<FaultResponseType> createFaultResponse(FaultResponseType value) {
        return new JAXBElement<FaultResponseType>(_FaultResponse_QNAME, FaultResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "sendMessages")
    public JAXBElement<SendMessagesRequestType> createSendMessages(SendMessagesRequestType value) {
        return new JAXBElement<SendMessagesRequestType>(_SendMessages_QNAME, SendMessagesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SendMessagesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "sendMessagesResponse")
    public JAXBElement<SendMessagesResponseType> createSendMessagesResponse(SendMessagesResponseType value) {
        return new JAXBElement<SendMessagesResponseType>(_SendMessagesResponse_QNAME, SendMessagesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBlockedNumbersRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "getBlockedNumbers")
    public JAXBElement<GetBlockedNumbersRequestType> createGetBlockedNumbers(GetBlockedNumbersRequestType value) {
        return new JAXBElement<GetBlockedNumbersRequestType>(_GetBlockedNumbers_QNAME, GetBlockedNumbersRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckReportsRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkReports")
    public JAXBElement<CheckReportsRequestType> createCheckReports(CheckReportsRequestType value) {
        return new JAXBElement<CheckReportsRequestType>(_CheckReports_QNAME, CheckReportsRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUserRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://xml.m4u.com.au/2009", name = "checkUser")
    public JAXBElement<CheckUserRequestType> createCheckUser(CheckUserRequestType value) {
        return new JAXBElement<CheckUserRequestType>(_CheckUser_QNAME, CheckUserRequestType.class, null, value);
    }

}
