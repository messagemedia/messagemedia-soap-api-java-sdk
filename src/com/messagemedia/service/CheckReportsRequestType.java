
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckReportsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckReportsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://xml.m4u.com.au/2009}AuthenticationType"/>
 *         &lt;element name="requestBody" type="{http://xml.m4u.com.au/2009}CheckReportsBodyType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReportsRequestType", propOrder = {
    "authentication",
    "requestBody"
})
public class CheckReportsRequestType {

    @XmlElement(required = true)
    protected AuthenticationType authentication;
    @XmlElement(required = true)
    protected CheckReportsBodyType requestBody;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationType }
     *     
     */
    public AuthenticationType getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationType }
     *     
     */
    public void setAuthentication(AuthenticationType value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the requestBody property.
     * 
     * @return
     *     possible object is
     *     {@link CheckReportsBodyType }
     *     
     */
    public CheckReportsBodyType getRequestBody() {
        return requestBody;
    }

    /**
     * Sets the value of the requestBody property.
     * 
     * @param value
     *     allowed object is
     *     {@link CheckReportsBodyType }
     *     
     */
    public void setRequestBody(CheckReportsBodyType value) {
        this.requestBody = value;
    }

}
