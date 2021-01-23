package com.example.tikidemo.Adapter;

import android.content.Context;
import android.icu.number.FormattedNumber;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikidemo.Model.FlashDeal.Category;
import com.example.tikidemo.Model.FlashDeal.Detail;
import com.example.tikidemo.Model.FlashDeal.FlashDeals;
import com.example.tikidemo.Model.FlashDeal.Tab;
import com.example.tikidemo.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.text.NumberFormat;
import java.util.Locale;

public class AdapterFlashDeals extends RecyclerView.Adapter<AdapterFlashDeals.ViewHolder> {

    private Context context;
    private FlashDeals flashDeals;
    NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("vi-VN"));

    public AdapterFlashDeals(Context context, FlashDeals flashDeals) {
        this.context = context;
        this.flashDeals = flashDeals;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_flashdeals, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Detail detail = flashDeals.getData().get(position);
        //Category category = flashDeals.getCategories().get(position);
        //Tab tab = flashDeals.getTabs().get(position);
        int minProgress = 10;
        int orderedProduct = detail.getProgress().getQtyOrdered();
        int totalProduct = detail.getProgress().getQty();
        int calPercent = (orderedProduct / totalProduct) * 100;
        double price = detail.getSpecialPrice();
        holder.tvSale.setText(detail.getDiscountPercent() + "%");

        holder.tvPrice.setText(formatter.format(price));
        Picasso.get().load(detail.getProduct().getThumbnailUrl())
                .into(holder.imgProduct, new Callback() {
                    @Override
                    public void onSuccess() {
                        holder.imgProduct.
                                setOnClickListener(v ->
                                        Toast.makeText(context,
                                                String.valueOf(detail.getProgress().getQtyOrdered()),
                                                Toast.LENGTH_SHORT).show());

                    }

                    @Override
                    public void onError(Exception e) {

                    }
                });
        holder.progressBar.setMax(110);
        holder.progressBar.setProgress(calPercent + minProgress);
        if (orderedProduct == 0)
            holder.tvAmoutSold.setText("Vừa mở bán");
        else
            holder.tvAmoutSold.setText("Đã bán được " + orderedProduct);
        if (calPercent < 50)
            holder.imgHot.setVisibility(View.GONE);
        else
            holder.imgHot.setVisibility(View.VISIBLE);


    }

    public void deleteAllData() {
        this.flashDeals.getData().clear();
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return flashDeals.getData().size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvSale, tvPrice, tvAmoutSold;
        ImageView imgProduct, imgHot;
        ProgressBar progressBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvSale = itemView.findViewById(R.id.custom_sale_flash_deals);
            tvPrice = itemView.findViewById(R.id.custom_price_sale_flash_deals);
            tvAmoutSold = itemView.findViewById(R.id.custom_tv_sold);
            imgProduct = itemView.findViewById(R.id.custom_product_flash_deals);
            imgHot = itemView.findViewById(R.id.custom_hot_flash_deals);
            progressBar = itemView.findViewById(R.id.custom_progressbar_flashdeals);
        }
    }
}
