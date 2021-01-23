package com.example.tikidemo.Main;

import com.example.tikidemo.Model.Banner.Banners;
import com.example.tikidemo.Model.FlashDeal.FlashDeals;
import com.example.tikidemo.Model.QuickLink.QuickLinks;

public class MainActivityContract {


    interface Presenter {
        void getDataBanners();

        void getDataQuickLinks();

        void getDataFlashDeals();
    }

    interface View {

        void dataBannerPending();

        void dataBanners(Banners banners);

        void dataBannerSuccess();

        void dataBannerFail(String error);

        void dataQuickLinksPending();

        void dataQuickLinks(QuickLinks quickLinks);

        void dataQuickLinksSuccess();

        void dataQuickLinksFail(String error);

        void dataFlashDealsPending();

        void dataFlashDeals(FlashDeals flashDeals);

        void dataFlashDealsSuccess();

        void dataFlashDealsFail(String error);

    }
}
