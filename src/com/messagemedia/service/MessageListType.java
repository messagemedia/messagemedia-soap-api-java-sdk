
package com.messagemedia.service;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageListType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MessageListType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="message" type="{http://xml.m4u.com.au/2009}MessageType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="sendMode" type="{http://xml.m4u.com.au/2009}MessageSendModeType" default="normal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageListType", propOrder = {
    "message"
})
public class MessageListType {

    @XmlElement(required = true)
    protected List<MessageType> message;
    @XmlAttribute(name = "sendMode")
    protected MessageSendModeType sendMode;

    /**
     * Gets the value of the message property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the message property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMessage().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MessageType }
     * 
     * 
     */
    public List<MessageType> getMessage() {
        if (message == null) {
            message = new ArrayList<MessageType>();
        }
        return this.message;
    }

    /**
     * Gets the value of the sendMode property.
     * 
     * @return
     *     possible object is
     *     {@link MessageSendModeType }
     *     
     */
    public MessageSendModeType getSendMode() {
        if (sendMode == null) {
            return MessageSendModeType.NORMAL;
        } else {
            return sendMode;
        }
    }

    /**
     * Sets the value of the sendMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageSendModeType }
     *     
     */
    public void setSendMode(MessageSendModeType value) {
        this.sendMode = value;
    }

}
