
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBlockedNumbersResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBlockedNumbersResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="recipients" type="{http://xml.m4u.com.au/2009}RecipientsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="found" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="returned" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBlockedNumbersResultType", propOrder = {
    "recipients"
})
public class GetBlockedNumbersResultType {

    @XmlElement(required = true)
    protected RecipientsType recipients;
    @XmlAttribute(name = "found", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long found;
    @XmlAttribute(name = "returned", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long returned;

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
     * Gets the value of the found property.
     * 
     */
    public long getFound() {
        return found;
    }

    /**
     * Sets the value of the found property.
     * 
     */
    public void setFound(long value) {
        this.found = value;
    }

    /**
     * Gets the value of the returned property.
     * 
     */
    public long getReturned() {
        return returned;
    }

    /**
     * Sets the value of the returned property.
     * 
     */
    public void setReturned(long value) {
        this.returned = value;
    }

}
