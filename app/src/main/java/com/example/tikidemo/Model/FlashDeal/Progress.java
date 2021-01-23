package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Progress {

    @SerializedName("qty")
    @Expose
    private Integer qty;
    @SerializedName("qty_ordered")
    @Expose
    private Integer qtyOrdered;
    @SerializedName("qty_remain")
    @Expose
    private Integer qtyRemain;
    @SerializedName("percent")
    @Expose
    private Integer percent;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("progress_text")
    @Expose
    private String progressText;

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Progress withQty(Integer qty) {
        this.qty = qty;
        return this;
    }

    public Integer getQtyOrdered() {
        return qtyOrdered;
    }

    public void setQtyOrdered(Integer qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
    }

    public Progress withQtyOrdered(Integer qtyOrdered) {
        this.qtyOrdered = qtyOrdered;
        return this;
    }

    public Integer getQtyRemain() {
        return qtyRemain;
    }

    public void setQtyRemain(Integer qtyRemain) {
        this.qtyRemain = qtyRemain;
    }

    public Progress withQtyRemain(Integer qtyRemain) {
        this.qtyRemain = qtyRemain;
        return this;
    }

    public Integer getPercent() {
        return percent;
    }

    public void setPercent(Integer percent) {
        this.percent = percent;
    }

    public Progress withPercent(Integer percent) {
        this.percent = percent;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Progress withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getProgressText() {
        return progressText;
    }

    public void setProgressText(String progressText) {
        this.progressText = progressText;
    }

    public Progress withProgressText(String progressText) {
        this.progressText = progressText;
        return this;
    }

}