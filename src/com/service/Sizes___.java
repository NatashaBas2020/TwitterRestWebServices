
package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Sizes___ {

    @SerializedName("large")
    @Expose
    private Large___ large;
    @SerializedName("thumb")
    @Expose
    private Thumb___ thumb;
    @SerializedName("medium")
    @Expose
    private Medium_______ medium;
    @SerializedName("small")
    @Expose
    private Small___ small;

    public Large___ getLarge() {
        return large;
    }

    public void setLarge(Large___ large) {
        this.large = large;
    }

    public Thumb___ getThumb() {
        return thumb;
    }

    public void setThumb(Thumb___ thumb) {
        this.thumb = thumb;
    }

    public Medium_______ getMedium() {
        return medium;
    }

    public void setMedium(Medium_______ medium) {
        this.medium = medium;
    }

    public Small___ getSmall() {
        return small;
    }

    public void setSmall(Small___ small) {
        this.small = small;
    }

}
