
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MessageSendModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="MessageSendModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="dropAll"/>
 *     &lt;enumeration value="dropAllWithErrors"/>
 *     &lt;enumeration value="dropAllWithSuccess"/>
 *     &lt;enumeration value="normal"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MessageSendModeType")
@XmlEnum
public enum MessageSendModeType {

    @XmlEnumValue("dropAll")
    DROP_ALL("dropAll"),
    @XmlEnumValue("dropAllWithErrors")
    DROP_ALL_WITH_ERRORS("dropAllWithErrors"),
    @XmlEnumValue("dropAllWithSuccess")
    DROP_ALL_WITH_SUCCESS("dropAllWithSuccess"),
    @XmlEnumValue("normal")
    NORMAL("normal");
    private final String value;

    MessageSendModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static MessageSendModeType fromValue(String v) {
        for (MessageSendModeType c: MessageSendModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
