
package com.service;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Url___ {

    @SerializedName("urls")
    @Expose
    private List<Url____> urls = null;

    public List<Url____> getUrls() {
        return urls;
    }

    public void setUrls(List<Url____> urls) {
        this.urls = urls;
    }

}
