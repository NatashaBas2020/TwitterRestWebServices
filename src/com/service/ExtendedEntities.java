
package com.service;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ExtendedEntities {

    @SerializedName("media")
    @Expose
    private List<Medium____> media = null;

    public List<Medium____> getMedia() {
        return media;
    }

    public void setMedia(List<Medium____> media) {
        this.media = media;
    }

}
