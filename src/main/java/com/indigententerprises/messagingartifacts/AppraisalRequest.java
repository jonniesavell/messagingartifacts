package com.indigententerprises.messagingartifacts;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="appraisal-request", namespace="http://www.deliciouscottage.com/appraisal")
public class AppraisalRequest {

    private String itemName;

    @XmlElement(name = "item")
    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
