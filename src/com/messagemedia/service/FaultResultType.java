
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FaultResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FaultResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *       &lt;/sequence>
 *       &lt;attribute name="code" use="required" type="{http://xml.m4u.com.au/2009}FaultErrorCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultResultType")
public class FaultResultType {

    @XmlAttribute(name = "code", required = true)
    protected FaultErrorCodeType code;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link FaultErrorCodeType }
     *     
     */
    public FaultErrorCodeType getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link FaultErrorCodeType }
     *     
     */
    public void setCode(FaultErrorCodeType value) {
        this.code = value;
    }

}
