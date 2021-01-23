package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

@SerializedName("deal_id")
@Expose
private Integer dealId;
@SerializedName("deal_status")
@Expose
private String dealStatus;
@SerializedName("deal_version")
@Expose
private Integer dealVersion;
@SerializedName("status")
@Expose
private Integer status;
@SerializedName("url")
@Expose
private String url;
@SerializedName("tags")
@Expose
private String tags;
@SerializedName("discount_percent")
@Expose
private Integer discountPercent;
@SerializedName("special_price")
@Expose
private Integer specialPrice;
@SerializedName("special_from_date")
@Expose
private Integer specialFromDate;
@SerializedName("from_date")
@Expose
private String fromDate;
@SerializedName("special_to_date")
@Expose
private Integer specialToDate;
@SerializedName("progress")
@Expose
private Progress progress;
@SerializedName("product")
@Expose
private Product product;

public Integer getDealId() {
return dealId;
}

public void setDealId(Integer dealId) {
this.dealId = dealId;
}

public Detail withDealId(Integer dealId) {
this.dealId = dealId;
return this;
}

public String getDealStatus() {
return dealStatus;
}

public void setDealStatus(String dealStatus) {
this.dealStatus = dealStatus;
}

public Detail withDealStatus(String dealStatus) {
this.dealStatus = dealStatus;
return this;
}

public Integer getDealVersion() {
return dealVersion;
}

public void setDealVersion(Integer dealVersion) {
this.dealVersion = dealVersion;
}

public Detail withDealVersion(Integer dealVersion) {
this.dealVersion = dealVersion;
return this;
}

public Integer getStatus() {
return status;
}

public void setStatus(Integer status) {
this.status = status;
}

public Detail withStatus(Integer status) {
this.status = status;
return this;
}

public String getUrl() {
return url;
}

public void setUrl(String url) {
this.url = url;
}

public Detail withUrl(String url) {
this.url = url;
return this;
}

public String getTags() {
return tags;
}

public void setTags(String tags) {
this.tags = tags;
}

public Detail withTags(String tags) {
this.tags = tags;
return this;
}

public Integer getDiscountPercent() {
return discountPercent;
}

public void setDiscountPercent(Integer discountPercent) {
this.discountPercent = discountPercent;
}

public Detail withDiscountPercent(Integer discountPercent) {
this.discountPercent = discountPercent;
return this;
}

public Integer getSpecialPrice() {
return specialPrice;
}

public void setSpecialPrice(Integer specialPrice) {
this.specialPrice = specialPrice;
}

public Detail withSpecialPrice(Integer specialPrice) {
this.specialPrice = specialPrice;
return this;
}

public Integer getSpecialFromDate() {
return specialFromDate;
}

public void setSpecialFromDate(Integer specialFromDate) {
this.specialFromDate = specialFromDate;
}

public Detail withSpecialFromDate(Integer specialFromDate) {
this.specialFromDate = specialFromDate;
return this;
}

public String getFromDate() {
return fromDate;
}

public void setFromDate(String fromDate) {
this.fromDate = fromDate;
}

public Detail withFromDate(String fromDate) {
this.fromDate = fromDate;
return this;
}

public Integer getSpecialToDate() {
return specialToDate;
}

public void setSpecialToDate(Integer specialToDate) {
this.specialToDate = specialToDate;
}

public Detail withSpecialToDate(Integer specialToDate) {
this.specialToDate = specialToDate;
return this;
}

public Progress getProgress() {
return progress;
}

public void setProgress(Progress progress) {
this.progress = progress;
}

public Detail withProgress(Progress progress) {
this.progress = progress;
return this;
}

public Product getProduct() {
return product;
}

public void setProduct(Product product) {
this.product = product;
}

public Detail withProduct(Product product) {
this.product = product;
return this;
}

}