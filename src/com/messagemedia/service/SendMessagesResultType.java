
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SendMessagesResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SendMessagesResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="accountDetails" type="{http://xml.m4u.com.au/2009}AccountDetailsType"/>
 *         &lt;element name="errors" type="{http://xml.m4u.com.au/2009}MessageErrorListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sent" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="scheduled" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="failed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SendMessagesResultType", propOrder = {
    "accountDetails",
    "errors"
})
public class SendMessagesResultType {

    @XmlElement(required = true)
    protected AccountDetailsType accountDetails;
    protected MessageErrorListType errors;
    @XmlAttribute(name = "sent", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long sent;
    @XmlAttribute(name = "scheduled", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long scheduled;
    @XmlAttribute(name = "failed", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long failed;

    /**
     * Gets the value of the accountDetails property.
     * 
     * @return
     *     possible object is
     *     {@link AccountDetailsType }
     *     
     */
    public AccountDetailsType getAccountDetails() {
        return accountDetails;
    }

    /**
     * Sets the value of the accountDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountDetailsType }
     *     
     */
    public void setAccountDetails(AccountDetailsType value) {
        this.accountDetails = value;
    }

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link MessageErrorListType }
     *     
     */
    public MessageErrorListType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageErrorListType }
     *     
     */
    public void setErrors(MessageErrorListType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the sent property.
     * 
     */
    public long getSent() {
        return sent;
    }

    /**
     * Sets the value of the sent property.
     * 
     */
    public void setSent(long value) {
        this.sent = value;
    }

    /**
     * Gets the value of the scheduled property.
     * 
     */
    public long getScheduled() {
        return scheduled;
    }

    /**
     * Sets the value of the scheduled property.
     * 
     */
    public void setScheduled(long value) {
        this.scheduled = value;
    }

    /**
     * Gets the value of the failed property.
     * 
     */
    public long getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     */
    public void setFailed(long value) {
        this.failed = value;
    }

}
