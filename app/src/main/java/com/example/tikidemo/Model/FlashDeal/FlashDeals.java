package com.example.tikidemo.Model.FlashDeal;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class FlashDeals {

    @SerializedName("data")
    @Expose
    private List<Detail> data = null;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("tabs")
    @Expose
    private List<Tab> tabs = null;
    @SerializedName("version")
    @Expose
    private String version;

    public FlashDeals(List<Detail> data, List<Category> categories, List<Tab> tabs, String version) {
        this.data = data;
        this.categories = categories;
        this.tabs = tabs;
        this.version = version;
    }

    public List<Detail> getData() {
        return data;
    }

    public void setData(List<Detail> data) {
        this.data = data;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Tab> getTabs() {
        return tabs;
    }

    public void setTabs(List<Tab> tabs) {
        this.tabs = tabs;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "FlashDeals{" +
                "data=" + data +
                ", categories=" + categories +
                ", tabs=" + tabs +
                ", version='" + version + '\'' +
                '}';
    }
}