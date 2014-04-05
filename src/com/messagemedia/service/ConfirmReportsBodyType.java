
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmReportsBodyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConfirmReportsBodyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="reports" type="{http://xml.m4u.com.au/2009}ConfirmReportListType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfirmReportsBodyType", propOrder = {
    "reports"
})
public class ConfirmReportsBodyType {

    @XmlElement(required = true)
    protected ConfirmReportListType reports;
    
    public ConfirmReportsBodyType() { }
    
    public ConfirmReportsBodyType(ConfirmItemType[] confirmItems)  {
    	this.reports = new ConfirmReportListType();
    	
    	for (ConfirmItemType confirmItem : confirmItems) {
    		this.reports.getReport().add(confirmItem);
    	}
    }

    /**
     * Gets the value of the reports property.
     * 
     * @return
     *     possible object is
     *     {@link ConfirmReportListType }
     *     
     */
    public ConfirmReportListType getReports() {
        return reports;
    }

    /**
     * Sets the value of the reports property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConfirmReportListType }
     *     
     */
    public void setReports(ConfirmReportListType value) {
        this.reports = value;
    }

}
