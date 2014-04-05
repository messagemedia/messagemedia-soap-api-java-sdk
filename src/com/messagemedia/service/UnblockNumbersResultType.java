
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UnblockNumbersResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnblockNumbersResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="errors" type="{http://xml.m4u.com.au/2009}MessageErrorListType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="unblocked" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="failed" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnblockNumbersResultType", propOrder = {
    "errors"
})
public class UnblockNumbersResultType {

    protected MessageErrorListType errors;
    @XmlAttribute(name = "unblocked", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long unblocked;
    @XmlAttribute(name = "failed", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long failed;

    /**
     * Gets the value of the errors property.
     * 
     * @return
     *     possible object is
     *     {@link MessageErrorListType }
     *     
     */
    public MessageErrorListType getErrors() {
        return errors;
    }

    /**
     * Sets the value of the errors property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageErrorListType }
     *     
     */
    public void setErrors(MessageErrorListType value) {
        this.errors = value;
    }

    /**
     * Gets the value of the unblocked property.
     * 
     */
    public long getUnblocked() {
        return unblocked;
    }

    /**
     * Sets the value of the unblocked property.
     * 
     */
    public void setUnblocked(long value) {
        this.unblocked = value;
    }

    /**
     * Gets the value of the failed property.
     * 
     */
    public long getFailed() {
        return failed;
    }

    /**
     * Sets the value of the failed property.
     * 
     */
    public void setFailed(long value) {
        this.failed = value;
    }

}
