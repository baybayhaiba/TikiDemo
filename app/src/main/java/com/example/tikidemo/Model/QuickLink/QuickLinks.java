package com.example.tikidemo.Model.QuickLink;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuickLinks {

    @SerializedName("data")
    @Expose
    private List<List<Detail>> data = null;

    public List<List<Detail>> getData() {
        return data;
    }

    public void setData(List<List<Detail>> data) {
        this.data = data;
    }

    public QuickLinks withData(List<List<Detail>> data) {
        this.data = data;
        return this;
    }

}