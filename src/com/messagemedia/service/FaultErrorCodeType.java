
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultErrorCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FaultErrorCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="authenticationFailed"/>
 *     &lt;enumeration value="invalidDataFormat"/>
 *     &lt;enumeration value="perDayMessageLimit"/>
 *     &lt;enumeration value="requestSizeLimit"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FaultErrorCodeType")
@XmlEnum
public enum FaultErrorCodeType {

    @XmlEnumValue("authenticationFailed")
    AUTHENTICATION_FAILED("authenticationFailed"),
    @XmlEnumValue("invalidDataFormat")
    INVALID_DATA_FORMAT("invalidDataFormat"),
    @XmlEnumValue("perDayMessageLimit")
    PER_DAY_MESSAGE_LIMIT("perDayMessageLimit"),
    @XmlEnumValue("requestSizeLimit")
    REQUEST_SIZE_LIMIT("requestSizeLimit");
    private final String value;

    FaultErrorCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FaultErrorCodeType fromValue(String v) {
        for (FaultErrorCodeType c: FaultErrorCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
