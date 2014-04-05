
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CheckReportsResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CheckReportsResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reports" type="{http://xml.m4u.com.au/2009}ReportListType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="returned" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *       &lt;attribute name="remaining" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckReportsResultType", propOrder = {
    "reports"
})
public class CheckReportsResultType {

    @XmlElement(required = true)
    protected ReportListType reports;
    @XmlAttribute(name = "returned", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long returned;
    @XmlAttribute(name = "remaining", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long remaining;

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link ReportListType }
     *     
     */
    public ReportListType getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReportListType }
     *     
     */
    public void setReports(ReportListType value) {
        this.reports = value;
    }

    /**
     * Gets the value of the returned property.
     * 
     */
    public long getReturned() {
        return returned;
    }

    /**
     * Sets the value of the returned property.
     * 
     */
    public void setReturned(long value) {
        this.returned = value;
    }

    /**
     * Gets the value of the remaining property.
     * 
     */
    public long getRemaining() {
        return remaining;
    }

    /**
     * Sets the value of the remaining property.
     * 
     */
    public void setRemaining(long value) {
        this.remaining = value;
    }

}
