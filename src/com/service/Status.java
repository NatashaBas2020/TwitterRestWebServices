
package com.service;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Status {

    @SerializedName("user")
    @Expose
    private User user;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("coordinates")
    @Expose
    private Object coordinates;
    @SerializedName("place")
    @Expose
    private Object place;
    @SerializedName("contributors")
    @Expose
    private Object contributors;
 
    @SerializedName("is_quote_status")
    @Expose
    private Boolean isQuoteStatus;
    @SerializedName("retweet_count")
    @Expose
    private Integer retweetCount;
    @SerializedName("favorite_count")
    @Expose
    private Integer favoriteCount;
    @SerializedName("favorited")
    @Expose
    private Boolean favorited;
    @SerializedName("retweeted")
    @Expose
    private Boolean retweeted;
    @SerializedName("possibly_sensitive")
    @Expose
    private Boolean possiblySensitive;
    @SerializedName("text")
    private String text;
    
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Object getGeo() {
		return geo;
	}
	public void setGeo(Object geo) {
		this.geo = geo;
	}
	public Object getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(Object coordinates) {
		this.coordinates = coordinates;
	}
	public Object getPlace() {
		return place;
	}
	public void setPlace(Object place) {
		this.place = place;
	}
	public Object getContributors() {
		return contributors;
	}
	public void setContributors(Object contributors) {
		this.contributors = contributors;
	}
	public Boolean getIsQuoteStatus() {
		return isQuoteStatus;
	}
	public void setIsQuoteStatus(Boolean isQuoteStatus) {
		this.isQuoteStatus = isQuoteStatus;
	}
	public Integer getRetweetCount() {
		return retweetCount;
	}
	public void setRetweetCount(Integer retweetCount) {
		this.retweetCount = retweetCount;
	}
	public Integer getFavoriteCount() {
		return favoriteCount;
	}
	public void setFavoriteCount(Integer favoriteCount) {
		this.favoriteCount = favoriteCount;
	}
	public Boolean getFavorited() {
		return favorited;
	}
	public void setFavorited(Boolean favorited) {
		this.favorited = favorited;
	}
	public Boolean getRetweeted() {
		return retweeted;
	}
	public void setRetweeted(Boolean retweeted) {
		this.retweeted = retweeted;
	}
	public Boolean getPossiblySensitive() {
		return possiblySensitive;
	}
	public void setPossiblySensitive(Boolean possiblySensitive) {
		this.possiblySensitive = possiblySensitive;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}

    
}
