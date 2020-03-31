package com.service;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Entities__ {

    @SerializedName("hashtags")
    @Expose
    private List<Object> hashtags = null;
    @SerializedName("symbols")
    @Expose
    private List<Object> symbols = null;
    @SerializedName("user_mentions")
    @Expose
    private List<Object> userMentions = null;
    @SerializedName("urls")
    @Expose
    private List<Url__> urls = null;
    @SerializedName("media")
    @Expose
    private List<Medium__> media = null;

    public List<Object> getHashtags() {
        return hashtags;
    }

    public void setHashtags(List<Object> hashtags) {
        this.hashtags = hashtags;
    }

    public List<Object> getSymbols() {
        return symbols;
    }

    public void setSymbols(List<Object> symbols) {
        this.symbols = symbols;
    }

    public List<Object> getUserMentions() {
        return userMentions;
    }

    public void setUserMentions(List<Object> userMentions) {
        this.userMentions = userMentions;
    }

    public List<Url__> getUrls() {
        return urls;
    }

    public void setUrls(List<Url__> urls) {
        this.urls = urls;
    }

    public List<Medium__> getMedia() {
        return media;
    }

    public void setMedia(List<Medium__> media) {
        this.media = media;
    }

}
