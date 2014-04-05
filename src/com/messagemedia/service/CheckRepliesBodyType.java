
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckRepliesBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckRepliesBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumReplies" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckRepliesBodyType", propOrder = {
    "maximumReplies"
})
public class CheckRepliesBodyType {

    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumReplies;
    
    public CheckRepliesBodyType() { }
    
    public CheckRepliesBodyType(Long maximumReplies) {
    	this.maximumReplies = maximumReplies;
    }

    /**
     * Gets the value of the maximumReplies property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumReplies() {
        return maximumReplies;
    }

    /**
     * Sets the value of the maximumReplies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumReplies(Long value) {
        this.maximumReplies = value;
    }

}
