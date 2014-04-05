
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmRepliesBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmRepliesBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="replies" type="{http://xml.m4u.com.au/2009}ConfirmReplyListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmRepliesBodyType", propOrder = {
    "replies"
})
public class ConfirmRepliesBodyType {

    @XmlElement(required = true)
    protected ConfirmReplyListType replies;
    
    public ConfirmRepliesBodyType() { }
    
    public ConfirmRepliesBodyType(ConfirmItemType[] confirmItems) {
    	this.setReplies(new ConfirmReplyListType());
    	
    	for (ConfirmItemType item : confirmItems) {
    		this.replies.getReply().add(item);
    	}
    }

    /**
     * Gets the value of the replies property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmReplyListType }
     *     
     */
    public ConfirmReplyListType getReplies() {
        return replies;
    }

    /**
     * Sets the value of the replies property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmReplyListType }
     *     
     */
    public void setReplies(ConfirmReplyListType value) {
        this.replies = value;
    }

}
