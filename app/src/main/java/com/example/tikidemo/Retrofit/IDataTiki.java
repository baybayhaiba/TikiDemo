package com.example.tikidemo.Retrofit;

import com.example.tikidemo.Model.Banner.Banners;
import com.example.tikidemo.Model.FlashDeal.FlashDeals;
import com.example.tikidemo.Model.QuickLink.QuickLinks;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface IDataTiki {

    @GET("v2/home/banners/v2")
    Observable<Banners> Banners();

    @GET("shopping/v2/widgets/quick_link")
    Observable<QuickLinks> QuickLinks();

    @GET("v2/widget/deals/hot")
    Observable<FlashDeals> FlashDeals();
}
