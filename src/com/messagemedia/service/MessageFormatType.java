
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageFormatType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageFormatType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="SMS"/>
 *     &lt;enumeration value="voice"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageFormatType")
@XmlEnum
public enum MessageFormatType {

    SMS("SMS"),
    @XmlEnumValue("voice")
    VOICE("voice");
    private final String value;

    MessageFormatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageFormatType fromValue(String v) {
        for (MessageFormatType c: MessageFormatType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
