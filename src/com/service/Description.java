
package com.service;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Description {

    @SerializedName("urls")
    @Expose
    private List<Url_> urls = null;

    public List<Url_> getUrls() {
        return urls;
    }

    public void setUrls(List<Url_> urls) {
        this.urls = urls;
    }

}
