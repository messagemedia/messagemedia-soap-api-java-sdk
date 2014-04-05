
package com.messagemedia.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeleteScheduledMessagesResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeleteScheduledMessagesResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="unscheduled" use="required" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteScheduledMessagesResultType")
public class DeleteScheduledMessagesResultType {

    @XmlAttribute(name = "unscheduled", required = true)
    @XmlSchemaType(name = "unsignedInt")
    protected long unscheduled;

    /**
     * Gets the value of the unscheduled property.
     * 
     */
    public long getUnscheduled() {
        return unscheduled;
    }

    /**
     * Sets the value of the unscheduled property.
     * 
     */
    public void setUnscheduled(long value) {
        this.unscheduled = value;
    }

}
