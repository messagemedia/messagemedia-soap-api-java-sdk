
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountDetailsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" fixed="daily" />
 *       &lt;attribute name="creditLimit" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="creditRemaining" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountDetailsType")
public class AccountDetailsType {

    @XmlAttribute(name = "type", required = true)
    protected String type;
    @XmlAttribute(name = "creditLimit", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long creditLimit;
    @XmlAttribute(name = "creditRemaining", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long creditRemaining;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        if (type == null) {
            return "daily";
        } else {
            return type;
        }
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the creditLimit property.
     * 
     */
    public long getCreditLimit() {
        return creditLimit;
    }

    /**
     * Sets the value of the creditLimit property.
     * 
     */
    public void setCreditLimit(long value) {
        this.creditLimit = value;
    }

    /**
     * Gets the value of the creditRemaining property.
     * 
     */
    public long getCreditRemaining() {
        return creditRemaining;
    }

    /**
     * Sets the value of the creditRemaining property.
     * 
     */
    public void setCreditRemaining(long value) {
        this.creditRemaining = value;
    }

}
