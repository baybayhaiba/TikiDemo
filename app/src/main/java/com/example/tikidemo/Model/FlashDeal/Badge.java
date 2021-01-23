package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Badge {

    @SerializedName("code")
    @Expose
    private String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Badge withCode(String code) {
        this.code = code;
        return this;
    }

}