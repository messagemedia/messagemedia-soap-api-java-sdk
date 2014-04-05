
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeliveryStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeliveryStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="delivered"/>
 *     &lt;enumeration value="pending"/>
 *     &lt;enumeration value="failed"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DeliveryStatusType")
@XmlEnum
public enum DeliveryStatusType {

    @XmlEnumValue("delivered")
    DELIVERED("delivered"),
    @XmlEnumValue("pending")
    PENDING("pending"),
    @XmlEnumValue("failed")
    FAILED("failed");
    private final String value;

    DeliveryStatusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeliveryStatusType fromValue(String v) {
        for (DeliveryStatusType c: DeliveryStatusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
