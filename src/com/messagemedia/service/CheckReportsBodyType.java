
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckReportsBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckReportsBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maximumReports" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReportsBodyType", propOrder = {
    "maximumReports"
})
public class CheckReportsBodyType {

    @XmlSchemaType(name = "unsignedInt")
    protected Long maximumReports;
    
    public CheckReportsBodyType() { }
    
    public CheckReportsBodyType(Long maximumReports) {
    	this.maximumReports = maximumReports;
    }

    /**
     * Gets the value of the maximumReports property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getMaximumReports() {
        return maximumReports;
    }

    /**
     * Sets the value of the maximumReports property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setMaximumReports(Long value) {
        this.maximumReports = value;
    }

}
