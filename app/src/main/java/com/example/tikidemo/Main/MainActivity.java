package com.example.tikidemo.Main;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import androidx.viewpager2.widget.ViewPager2;

import com.example.tikidemo.Adapter.AdapterBanners;
import com.example.tikidemo.Adapter.AdapterFlashDeals;
import com.example.tikidemo.Adapter.AdapterQuickLink;
import com.example.tikidemo.Model.Banner.Banners;
import com.example.tikidemo.Model.FlashDeal.Category;
import com.example.tikidemo.Model.FlashDeal.Detail;
import com.example.tikidemo.Model.FlashDeal.FlashDeals;
import com.example.tikidemo.Model.FlashDeal.Tab;
import com.example.tikidemo.Model.QuickLink.QuickLinks;
import com.example.tikidemo.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    MainActivityContract.Presenter presenter;
    private ViewPager2 viewPager2;
    private FrameLayout frameLayoutViewPager2;
    private TabLayout tabLayout;
    private ProgressBar progressBarBanner, progressBarQuickLinks, progressBarFlashDeals;
    public final String TAG = this.getClass().getName();
    private int i = 0;
    private boolean isIncrease = true;
    private Handler handler;
    private Runnable runnable;
    private AdapterBanners adapterBanners;
    private AdapterQuickLink adapterQuickLink;
    private AdapterFlashDeals adapterFlashDeals;
    private RecyclerView recyclerViewQuickLinks, recyclerViewFlashDeals;
    private ImageView iconFlashdeal;
    private SwipeRefreshLayout swipeRefreshLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();
        initPresenter();
        initAnimation();
        eventPullToRefresh();
    }

    private void eventPullToRefresh() {
        swipeRefreshLayout.setOnRefreshListener(() -> {
            removeDataToSwipe();
            initPresenter();
            swipeRefreshLayout.setRefreshing(false);
        });
    }

    private void removeDataToSwipe() {
        handler.removeCallbacks(runnable);
        adapterFlashDeals.deleteAllData();
        adapterBanners.deleteAllData();
        adapterQuickLink.deleteAllData();
    }

    private void initAnimation() {
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.icon_flashdeal);
        iconFlashdeal.setAnimation(animation);
    }

    private void initComponents() {
        viewPager2 = findViewById(R.id.viewpager2);
        progressBarBanner = findViewById(R.id.progress_banners);
        progressBarFlashDeals = findViewById(R.id.progress_flashdeals);
        progressBarQuickLinks = findViewById(R.id.progress_quicklinks);
        frameLayoutViewPager2 = findViewById(R.id.framLayoutViewPager);
        recyclerViewQuickLinks = findViewById(R.id.recyclerViewQuickLink);
        tabLayout = findViewById(R.id.tabLayoutBanner);
        iconFlashdeal = findViewById(R.id.img_icon_flashdeal);
        recyclerViewFlashDeals = findViewById(R.id.recyclerViewFlashDeals);
        swipeRefreshLayout = findViewById(R.id.pullToRefresh);
        presenter = new MainActivityPresenter(this);
    }


    private void initPresenter() {
        presenter.getDataBanners();
        presenter.getDataFlashDeals();
        presenter.getDataQuickLinks();
    }


    @Override
    public void dataBannerPending() {
        progressBarBanner.setVisibility(View.VISIBLE);
        frameLayoutViewPager2.setVisibility(View.GONE);
    }

    @Override
    public void dataBanners(Banners banners) {
        Log.d(TAG, "dataBanners: " + banners.getData().size());
        adapterBanners = new AdapterBanners(this, banners);
        viewPager2.setAdapter(adapterBanners);
        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) -> {
            // tab.setText("Object " + (position + 1));
            //tab.view.setMinimumWidth(80);

        }).attach();

        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                i = position;
            }
        });
    }

    @Override
    public void dataBannerSuccess() {
        Log.d(TAG, "dataBannerSuccess: ");
        progressBarBanner.setVisibility(View.GONE);
        frameLayoutViewPager2.setVisibility(View.VISIBLE);

        handler = new Handler(Looper.myLooper());
        runnable = new Runnable() {
            @Override
            public void run() {
                if (isIncrease) {
                    if (i == adapterBanners.getItemCount() - 1) {
                        isIncrease = !isIncrease;
                        viewPager2.setCurrentItem(--i);
                    } else {
                        viewPager2.setCurrentItem(++i);
                    }
                } else {
                    if (i == 0) {
                        isIncrease = !isIncrease;
                        viewPager2.setCurrentItem(++i);
                    } else {
                        viewPager2.setCurrentItem(--i);
                    }
                }
                handler.postDelayed(this, 3000);
            }
        };
        handler.post(runnable);


    }

    @Override
    public void dataBannerFail(String error) {
        Log.d(TAG, "dataBannerFail: " + error);
        progressBarBanner.setVisibility(View.GONE);
    }

    @Override
    public void dataQuickLinksPending() {
        progressBarQuickLinks.setVisibility(View.VISIBLE);
        recyclerViewQuickLinks.setVisibility(View.GONE);
    }

    @Override
    public void dataQuickLinks(QuickLinks quickLinks) {
        adapterQuickLink = new AdapterQuickLink(this, quickLinks);
        recyclerViewQuickLinks.setAdapter(adapterQuickLink);
    }

    @Override
    public void dataQuickLinksSuccess() {
        Log.d(TAG, "dataQuickLinksSuccess: ");
        progressBarQuickLinks.setVisibility(View.GONE);
        recyclerViewQuickLinks.setVisibility(View.VISIBLE);
    }

    @Override
    public void dataQuickLinksFail(String error) {
        Log.d(TAG, "dataQuickLinksFail: " + error);
        progressBarQuickLinks.setVisibility(View.GONE);
        recyclerViewQuickLinks.setVisibility(View.VISIBLE);
    }

    @Override
    public void dataFlashDealsPending() {
        progressBarFlashDeals.setVisibility(View.VISIBLE);
        recyclerViewFlashDeals.setVisibility(View.GONE);
    }

    @Override
    public void dataFlashDeals(FlashDeals flashDeals) {
        adapterFlashDeals = new AdapterFlashDeals(this, flashDeals);
        recyclerViewFlashDeals.setAdapter(adapterFlashDeals);
        recyclerViewFlashDeals.setLayoutManager(new LinearLayoutManager(this
                , RecyclerView.HORIZONTAL, false));
    }

    @Override
    public void dataFlashDealsSuccess() {
        Log.d(TAG, "dataFlashDealsSuccess: ");
        progressBarFlashDeals.setVisibility(View.GONE);
        recyclerViewFlashDeals.setVisibility(View.VISIBLE);
    }

    @Override
    public void dataFlashDealsFail(String error) {
        Log.d(TAG, "dataFlashDealsFail: " + error);
        progressBarFlashDeals.setVisibility(View.GONE);
        recyclerViewFlashDeals.setVisibility(View.VISIBLE);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}