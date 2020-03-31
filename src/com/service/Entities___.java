package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities___ {

    @SerializedName("url")
    @Expose
    private Url___ url;
    @SerializedName("description")
    @Expose
    private Description_ description;

    public Url___ getUrl() {
        return url;
    }

    public void setUrl(Url___ url) {
        this.url = url;
    }

    public Description_ getDescription() {
        return description;
    }

    public void setDescription(Description_ description) {
        this.description = description;
    }

}
