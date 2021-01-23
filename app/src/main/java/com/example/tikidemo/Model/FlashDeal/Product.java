package com.example.tikidemo.Model.FlashDeal;

import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Product {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("sku")
    @Expose
    private Object sku;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url_path")
    @Expose
    private String urlPath;
    @SerializedName("price")
    @Expose
    private Integer price;
    @SerializedName("list_price")
    @Expose
    private Integer listPrice;
    @SerializedName("badges")
    @Expose
    private List<Badge> badges = null;
    @SerializedName("discount")
    @Expose
    private Integer discount;
    @SerializedName("rating_average")
    @Expose
    private Integer ratingAverage;
    @SerializedName("review_count")
    @Expose
    private Integer reviewCount;
    @SerializedName("order_count")
    @Expose
    private Integer orderCount;
    @SerializedName("thumbnail_url")
    @Expose
    private String thumbnailUrl;
    @SerializedName("is_visible")
    @Expose
    private Boolean isVisible;
    @SerializedName("is_fresh")
    @Expose
    private Boolean isFresh;
    @SerializedName("is_flower")
    @Expose
    private Boolean isFlower;
    @SerializedName("is_gift_card")
    @Expose
    private Boolean isGiftCard;
    @SerializedName("inventory")
    @Expose
    private Inventory inventory;
    @SerializedName("url_attendant_input_form")
    @Expose
    private String urlAttendantInputForm;
    @SerializedName("master_id")
    @Expose
    private Integer masterId;
    @SerializedName("seller_product_id")
    @Expose
    private Integer sellerProductId;
    @SerializedName("price_prefix")
    @Expose
    private String pricePrefix;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Product withId(Integer id) {
        this.id = id;
        return this;
    }

    public Object getSku() {
        return sku;
    }

    public void setSku(Object sku) {
        this.sku = sku;
    }

    public Product withSku(Object sku) {
        this.sku = sku;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product withName(String name) {
        this.name = name;
        return this;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public Product withUrlPath(String urlPath) {
        this.urlPath = urlPath;
        return this;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Product withPrice(Integer price) {
        this.price = price;
        return this;
    }

    public Integer getListPrice() {
        return listPrice;
    }

    public void setListPrice(Integer listPrice) {
        this.listPrice = listPrice;
    }

    public Product withListPrice(Integer listPrice) {
        this.listPrice = listPrice;
        return this;
    }

    public List<Badge> getBadges() {
        return badges;
    }

    public void setBadges(List<Badge> badges) {
        this.badges = badges;
    }

    public Product withBadges(List<Badge> badges) {
        this.badges = badges;
        return this;
    }

    public Integer getDiscount() {
        return discount;
    }

    public void setDiscount(Integer discount) {
        this.discount = discount;
    }

    public Product withDiscount(Integer discount) {
        this.discount = discount;
        return this;
    }

    public Integer getRatingAverage() {
        return ratingAverage;
    }

    public void setRatingAverage(Integer ratingAverage) {
        this.ratingAverage = ratingAverage;
    }

    public Product withRatingAverage(Integer ratingAverage) {
        this.ratingAverage = ratingAverage;
        return this;
    }

    public Integer getReviewCount() {
        return reviewCount;
    }

    public void setReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
    }

    public Product withReviewCount(Integer reviewCount) {
        this.reviewCount = reviewCount;
        return this;
    }

    public Integer getOrderCount() {
        return orderCount;
    }

    public void setOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
    }

    public Product withOrderCount(Integer orderCount) {
        this.orderCount = orderCount;
        return this;
    }

    public String getThumbnailUrl() {
        return thumbnailUrl;
    }

    public void setThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
    }

    public Product withThumbnailUrl(String thumbnailUrl) {
        this.thumbnailUrl = thumbnailUrl;
        return this;
    }

    public Boolean getIsVisible() {
        return isVisible;
    }

    public void setIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Product withIsVisible(Boolean isVisible) {
        this.isVisible = isVisible;
        return this;
    }

    public Boolean getIsFresh() {
        return isFresh;
    }

    public void setIsFresh(Boolean isFresh) {
        this.isFresh = isFresh;
    }

    public Product withIsFresh(Boolean isFresh) {
        this.isFresh = isFresh;
        return this;
    }

    public Boolean getIsFlower() {
        return isFlower;
    }

    public void setIsFlower(Boolean isFlower) {
        this.isFlower = isFlower;
    }

    public Product withIsFlower(Boolean isFlower) {
        this.isFlower = isFlower;
        return this;
    }

    public Boolean getIsGiftCard() {
        return isGiftCard;
    }

    public void setIsGiftCard(Boolean isGiftCard) {
        this.isGiftCard = isGiftCard;
    }

    public Product withIsGiftCard(Boolean isGiftCard) {
        this.isGiftCard = isGiftCard;
        return this;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Product withInventory(Inventory inventory) {
        this.inventory = inventory;
        return this;
    }

    public String getUrlAttendantInputForm() {
        return urlAttendantInputForm;
    }

    public void setUrlAttendantInputForm(String urlAttendantInputForm) {
        this.urlAttendantInputForm = urlAttendantInputForm;
    }

    public Product withUrlAttendantInputForm(String urlAttendantInputForm) {
        this.urlAttendantInputForm = urlAttendantInputForm;
        return this;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Product withMasterId(Integer masterId) {
        this.masterId = masterId;
        return this;
    }

    public Integer getSellerProductId() {
        return sellerProductId;
    }

    public void setSellerProductId(Integer sellerProductId) {
        this.sellerProductId = sellerProductId;
    }

    public Product withSellerProductId(Integer sellerProductId) {
        this.sellerProductId = sellerProductId;
        return this;
    }

    public String getPricePrefix() {
        return pricePrefix;
    }

    public void setPricePrefix(String pricePrefix) {
        this.pricePrefix = pricePrefix;
    }

    public Product withPricePrefix(String pricePrefix) {
        this.pricePrefix = pricePrefix;
        return this;
    }

}