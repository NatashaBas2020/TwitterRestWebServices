
package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes__ {

    @SerializedName("large")
    @Expose
    private Large__ large;
    @SerializedName("thumb")
    @Expose
    private Thumb__ thumb;
    @SerializedName("medium")
    @Expose
    private Medium_____ medium;
    @SerializedName("small")
    @Expose
    private Small__ small;

    public Large__ getLarge() {
        return large;
    }

    public void setLarge(Large__ large) {
        this.large = large;
    }

    public Thumb__ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb__ thumb) {
        this.thumb = thumb;
    }

    public Medium_____ getMedium() {
        return medium;
    }

    public void setMedium(Medium_____ medium) {
        this.medium = medium;
    }

    public Small__ getSmall() {
        return small;
    }

    public void setSmall(Small__ small) {
        this.small = small;
    }

}
