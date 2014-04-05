
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteScheduledMessagesResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteScheduledMessagesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="result" type="{http://xml.m4u.com.au/2009}DeleteScheduledMessagesResultType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteScheduledMessagesResponseType", propOrder = {
    "result"
})
public class DeleteScheduledMessagesResponseType {

    @XmlElement(required = true)
    protected DeleteScheduledMessagesResultType result;

    /**
     * Gets the value of the result property.
     * 
     * @return
     *     possible object is
     *     {@link DeleteScheduledMessagesResultType }
     *     
     */
    public DeleteScheduledMessagesResultType getResult() {
        return result;
    }

    /**
     * Sets the value of the result property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeleteScheduledMessagesResultType }
     *     
     */
    public void setResult(DeleteScheduledMessagesResultType value) {
        this.result = value;
    }

}
