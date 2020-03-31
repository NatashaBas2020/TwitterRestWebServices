
package com.service;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description_ {

    @SerializedName("urls")
    @Expose
    private List<Url_____> urls = null;

    public List<Url_____> getUrls() {
        return urls;
    }

    public void setUrls(List<Url_____> urls) {
        this.urls = urls;
    }

}
