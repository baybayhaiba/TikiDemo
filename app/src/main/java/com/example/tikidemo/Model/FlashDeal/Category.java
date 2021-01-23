package com.example.tikidemo.Model.FlashDeal;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

@SerializedName("id")
@Expose
private Integer id;
@SerializedName("query_value")
@Expose
private String queryValue;
@SerializedName("name")
@Expose
private String name;
@SerializedName("thumbnail_url")
@Expose
private String thumbnailUrl;

public Integer getId() {
return id;
}

public void setId(Integer id) {
this.id = id;
}

public Category withId(Integer id) {
this.id = id;
return this;
}

public String getQueryValue() {
return queryValue;
}

public void setQueryValue(String queryValue) {
this.queryValue = queryValue;
}

public Category withQueryValue(String queryValue) {
this.queryValue = queryValue;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Category withName(String name) {
this.name = name;
return this;
}

public String getThumbnailUrl() {
return thumbnailUrl;
}

public void setThumbnailUrl(String thumbnailUrl) {
this.thumbnailUrl = thumbnailUrl;
}

public Category withThumbnailUrl(String thumbnailUrl) {
this.thumbnailUrl = thumbnailUrl;
return this;
}

}