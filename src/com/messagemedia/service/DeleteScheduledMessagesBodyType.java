
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteScheduledMessagesBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteScheduledMessagesBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="messages" type="{http://xml.m4u.com.au/2009}MessageIdListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteScheduledMessagesBodyType", propOrder = {
    "messages"
})
public class DeleteScheduledMessagesBodyType {

    @XmlElement(required = true)
    protected MessageIdListType messages;
    
    public DeleteScheduledMessagesBodyType() { }
    
    public DeleteScheduledMessagesBodyType(MessageIdType[] messageIds) {
    	this.messages = new MessageIdListType();
    	
    	for (MessageIdType messageId : messageIds) {
    		this.messages.getMessage().add(messageId);
    	}
    }

    /**
     * Gets the value of the messages property.
     * 
     * @return
     *     possible object is
     *     {@link MessageIdListType }
     *     
     */
    public MessageIdListType getMessages() {
        return messages;
    }

    /**
     * Sets the value of the messages property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageIdListType }
     *     
     */
    public void setMessages(MessageIdListType value) {
        this.messages = value;
    }

}
