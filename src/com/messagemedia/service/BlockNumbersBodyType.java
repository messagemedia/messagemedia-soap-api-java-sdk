
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BlockNumbersBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockNumbersBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipients" type="{http://xml.m4u.com.au/2009}RecipientsType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockNumbersBodyType", propOrder = {
    "recipients"
})
public class BlockNumbersBodyType {

    @XmlElement(required = true)
    protected RecipientsType recipients;
    
    public BlockNumbersBodyType() { }
    
    public BlockNumbersBodyType(RecipientType[] recipients)  {
    	this.recipients = new RecipientsType();
    	
    	for (RecipientType recipient : recipients) {
    		this.recipients.getRecipient().add(recipient);
    	}
    }

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

}
