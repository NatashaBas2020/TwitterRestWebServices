
package com.model;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.service.Status;

public class TwitterSearchDataModel {

    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = null;
   
    private List<String> errorsList = null;

    public List<Status> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }
    
    public List<String> getErrorsList() {
		return errorsList;
	}

	public void setErrorsList(List<String> errorsList) {
		this.errorsList = errorsList;
	}

	@Override
	public String toString() {
		return "TwitterSearchDataModel [statuses=" + statuses + ", errorsList=" + errorsList + "]";
	}

}
