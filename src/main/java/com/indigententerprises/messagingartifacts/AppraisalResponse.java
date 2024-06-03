package com.indigententerprises.messagingartifacts;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="appraisal-response", namespace="http://www.deliciouscottage.com/appraisal")
public class AppraisalResponse {
    private String dateString;
    private String itemName;
    private Long value;

    @XmlElement(name="date")
    public String getDateString() {
        return dateString;
    }

    public void setDateString(final String dateString) {
        this.dateString = dateString;
    }

    @XmlElement(name="item")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @XmlElement(name="value")
    public Long getValue() {
        return value;
    }

    public void setValue(final Long value) {
        this.value = value;
    }
}
