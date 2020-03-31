
package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes_ {

    @SerializedName("large")
    @Expose
    private Large_ large;
    @SerializedName("thumb")
    @Expose
    private Thumb_ thumb;
    @SerializedName("medium")
    @Expose
    private Medium___ medium;
    @SerializedName("small")
    @Expose
    private Small_ small;

    public Large_ getLarge() {
        return large;
    }

    public void setLarge(Large_ large) {
        this.large = large;
    }

    public Thumb_ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb_ thumb) {
        this.thumb = thumb;
    }

    public Medium___ getMedium() {
        return medium;
    }

    public void setMedium(Medium___ medium) {
        this.medium = medium;
    }

    public Small_ getSmall() {
        return small;
    }

    public void setSmall(Small_ small) {
        this.small = small;
    }

}
