package com.example.tikidemo.Main;


import com.example.tikidemo.Model.Banner.Banners;
import com.example.tikidemo.Model.FlashDeal.FlashDeals;
import com.example.tikidemo.Model.QuickLink.QuickLinks;
import com.example.tikidemo.Retrofit.IDataTiki;
import com.example.tikidemo.Retrofit.RetrofitClientInstance;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View view;
    private IDataTiki dataTiki;

    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        dataTiki = RetrofitClientInstance.getInstance().create(IDataTiki.class);
    }


    @Override
    public void getDataBanners() {
        view.dataBannerPending();
        dataTiki.Banners()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<Banners>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull Banners banners) {
                        view.dataBanners(banners);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.dataBannerFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        view.dataBannerSuccess();
                    }
                });
    }

    @Override
    public void getDataQuickLinks() {
        view.dataQuickLinksPending();
        dataTiki.QuickLinks().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<QuickLinks>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull QuickLinks quickLinks) {
                        view.dataQuickLinks(quickLinks);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.dataQuickLinksFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        view.dataQuickLinksSuccess();
                    }
                });
    }

    @Override
    public void getDataFlashDeals() {
        view.dataFlashDealsPending();
        dataTiki.FlashDeals().subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<FlashDeals>() {
                    @Override
                    public void onSubscribe(@NonNull Disposable d) {

                    }

                    @Override
                    public void onNext(@NonNull FlashDeals flashDeals) {
                        view.dataFlashDeals(flashDeals);
                    }

                    @Override
                    public void onError(@NonNull Throwable e) {
                        view.dataFlashDealsFail(e.getMessage());
                    }

                    @Override
                    public void onComplete() {
                        view.dataFlashDealsSuccess();
                    }
                });
    }
}
