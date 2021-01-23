package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Inventory {

    @SerializedName("product_virtual_type")
    @Expose
    private Object productVirtualType;
    @SerializedName("fulfillment_type")
    @Expose
    private String fulfillmentType;

    public Object getProductVirtualType() {
        return productVirtualType;
    }

    public void setProductVirtualType(Object productVirtualType) {
        this.productVirtualType = productVirtualType;
    }

    public Inventory withProductVirtualType(Object productVirtualType) {
        this.productVirtualType = productVirtualType;
        return this;
    }

    public String getFulfillmentType() {
        return fulfillmentType;
    }

    public void setFulfillmentType(String fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
    }

    public Inventory withFulfillmentType(String fulfillmentType) {
        this.fulfillmentType = fulfillmentType;
        return this;
    }

}