package com.example.tikidemo.Model.QuickLink;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Detail {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("authentication")
    @Expose
    private Boolean authentication;
    @SerializedName("web_url")
    @Expose
    private String webUrl;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Detail withTitle(String title) {
        this.title = title;
        return this;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Detail withContent(String content) {
        this.content = content;
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

    public Boolean getAuthentication() {
        return authentication;
    }

    public void setAuthentication(Boolean authentication) {
        this.authentication = authentication;
    }

    public Detail withAuthentication(Boolean authentication) {
        this.authentication = authentication;
        return this;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public Detail withWebUrl(String webUrl) {
        this.webUrl = webUrl;
        return this;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Detail withImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

}