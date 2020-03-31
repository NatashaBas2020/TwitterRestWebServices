
package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes {

    @SerializedName("large")
    @Expose
    private Large large;
    @SerializedName("thumb")
    @Expose
    private Thumb thumb;
    @SerializedName("medium")
    @Expose
    private Medium_ medium;
    @SerializedName("small")
    @Expose
    private Small small;

    public Large getLarge() {
        return large;
    }

    public void setLarge(Large large) {
        this.large = large;
    }

    public Thumb getThumb() {
        return thumb;
    }

    public void setThumb(Thumb thumb) {
        this.thumb = thumb;
    }

    public Medium_ getMedium() {
        return medium;
    }

    public void setMedium(Medium_ medium) {
        this.medium = medium;
    }

    public Small getSmall() {
        return small;
    }

    public void setSmall(Small small) {
        this.small = small;
    }

}
