package com.example.tikidemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikidemo.Model.Banner.Banners;
import com.example.tikidemo.Model.QuickLink.QuickLinks;
import com.example.tikidemo.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.Collections;

public class AdapterBanners extends RecyclerView.Adapter<AdapterBanners.PagerVH> {

    private Context context;
    private Banners banners;

    public AdapterBanners(Context context, Banners banners) {
        this.context = context;
        this.banners = banners;
    }

    public static class PagerVH extends RecyclerView.ViewHolder {
        ImageView imageButton;

        public PagerVH(@NonNull View itemView) {
            super(itemView);
            imageButton = itemView.findViewById(R.id.img_banner);
        }
    }

    @NonNull
    @Override
    public PagerVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_banner, parent, false);
        return new PagerVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PagerVH holder, int position) {

        Picasso.get().load(banners.getData().get(position)
                .getImageUrl())
                .into(holder.imageButton);
    }

    public void deleteAllData() {
        this.banners.getData().clear();
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return banners.getData().size();
    }

}
