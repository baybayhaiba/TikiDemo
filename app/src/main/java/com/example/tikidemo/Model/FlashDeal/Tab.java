package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Tab {

    @SerializedName("query_value")
    @Expose
    private Integer queryValue;
    @SerializedName("from_date")
    @Expose
    private String fromDate;
    @SerializedName("to_date")
    @Expose
    private String toDate;
    @SerializedName("display")
    @Expose
    private String display;
    @SerializedName("active")
    @Expose
    private Boolean active;

    public Integer getQueryValue() {
        return queryValue;
    }

    public void setQueryValue(Integer queryValue) {
        this.queryValue = queryValue;
    }

    public Tab withQueryValue(Integer queryValue) {
        this.queryValue = queryValue;
        return this;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public Tab withFromDate(String fromDate) {
        this.fromDate = fromDate;
        return this;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public Tab withToDate(String toDate) {
        this.toDate = toDate;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public Tab withDisplay(String display) {
        this.display = display;
        return this;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Tab withActive(Boolean active) {
        this.active = active;
        return this;
    }

}