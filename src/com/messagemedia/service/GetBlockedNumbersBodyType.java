
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetBlockedNumbersBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetBlockedNumbersBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumRecipients" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetBlockedNumbersBodyType", propOrder = {
    "maximumRecipients"
})
public class GetBlockedNumbersBodyType {

    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumRecipients;
    
    public GetBlockedNumbersBodyType() { }
    
    public GetBlockedNumbersBodyType(Long maximumRecipients) {
    	this.maximumRecipients = maximumRecipients;
    }

    /**
     * Gets the value of the maximumRecipients property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumRecipients() {
        return maximumRecipients;
    }

    /**
     * Sets the value of the maximumRecipients property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumRecipients(Long value) {
        this.maximumRecipients = value;
    }

}
