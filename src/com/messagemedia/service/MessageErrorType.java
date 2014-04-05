
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageErrorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageErrorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipients" type="{http://xml.m4u.com.au/2009}RecipientsType"/>
 *         &lt;element name="content" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://xml.m4u.com.au/2009}MessageErrorCodeType" />
 *       &lt;attribute name="sequenceNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageErrorType", propOrder = {
    "recipients",
    "content"
})
public class MessageErrorType {

    @XmlElement(required = true)
    protected RecipientsType recipients;
    protected String content;
    @XmlAttribute(name = "code", required = true)
    protected MessageErrorCodeType code;
    @XmlAttribute(name = "sequenceNumber", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long sequenceNumber;

    /**
     * Gets the value of the recipients property.
     * 
     * @return
     *     possible object is
     *     {@link RecipientsType }
     *     
     */
    public RecipientsType getRecipients() {
        return recipients;
    }

    /**
     * Sets the value of the recipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecipientsType }
     *     
     */
    public void setRecipients(RecipientsType value) {
        this.recipients = value;
    }

    /**
     * Gets the value of the content property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContent() {
        return content;
    }

    /**
     * Sets the value of the content property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContent(String value) {
        this.content = value;
    }

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link MessageErrorCodeType }
     *     
     */
    public MessageErrorCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageErrorCodeType }
     *     
     */
    public void setCode(MessageErrorCodeType value) {
        this.code = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     */
    public long getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     */
    public void setSequenceNumber(long value) {
        this.sequenceNumber = value;
    }

}
