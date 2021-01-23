package com.example.tikidemo.Model.Banner;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Banners {

    @SerializedName("data")
    @Expose
    private List<Detail> data = null;

    public List<Detail> getData() {
        return data;
    }

    public void setData(List<Detail> data) {
        this.data = data;
    }
}