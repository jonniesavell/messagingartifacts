package com.indigententerprises.messagingartifacts;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="claim-check", namespace="http://www.indigententerprises.com/claim-check")
public class ClaimCheck {

    private String url;
    private String handle;

    @XmlElement(name="url", namespace="http://www.indigententerprises.com/claim-check")
    public String getUrl() {
        return url;
    }

    public void setUrl(final String url) {
        this.url = url;
    }

    @XmlElement(name="handle", namespace="http://www.indigententerprises.com/claim-check")
    public String getHandle() {
        return handle;
    }

    public void setHandle(final String handle) {
        this.handle = handle;
    }
}
