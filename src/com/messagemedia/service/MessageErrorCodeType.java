
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="invalidRecipient"/>
 *     &lt;enumeration value="recipientBlocked"/>
 *     &lt;enumeration value="emptyMessageContent"/>
 *     &lt;enumeration value="messageLengthLimit"/>
 *     &lt;enumeration value="other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageErrorCodeType")
@XmlEnum
public enum MessageErrorCodeType {

    @XmlEnumValue("invalidRecipient")
    INVALID_RECIPIENT("invalidRecipient"),
    @XmlEnumValue("recipientBlocked")
    RECIPIENT_BLOCKED("recipientBlocked"),
    @XmlEnumValue("emptyMessageContent")
    EMPTY_MESSAGE_CONTENT("emptyMessageContent"),
    @XmlEnumValue("messageLengthLimit")
    MESSAGE_LENGTH_LIMIT("messageLengthLimit"),
    @XmlEnumValue("other")
    OTHER("other");
    private final String value;

    MessageErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageErrorCodeType fromValue(String v) {
        for (MessageErrorCodeType c: MessageErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
