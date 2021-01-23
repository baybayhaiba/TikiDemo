package com.example.tikidemo.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tikidemo.Model.QuickLink.Detail;
import com.example.tikidemo.Model.QuickLink.QuickLinks;
import com.example.tikidemo.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterQuickLink extends RecyclerView.Adapter<AdapterQuickLink.ViewHolder> {

    private Context context;
    private QuickLinks quickLinks;
    private int factory;
    private int index;

    public AdapterQuickLink(Context context, QuickLinks quickLinks) {
        this.context = context;
        this.quickLinks = quickLinks;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.item_quicklink, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        factory = 0;
        index = position;


        for (int i = 0; i < quickLinks.getData().size(); i++) {
            if (index >= quickLinks.getData().get(i).size()) {
                factory++;
                index -= quickLinks.getData().get(i).size();
            }
        }

        holder.tvTitle.setText(quickLinks.getData().get(factory).get(index).getTitle());

        Picasso.get().load(quickLinks.getData().get(factory).get(index).getImageUrl())
                .into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        int count = 0;
        for (int i = 0; i < quickLinks.getData().size(); i++)
            count += quickLinks.getData().get(i).size();
        return count;
    }

    public void deleteAllData() {
        this.quickLinks.getData().clear();
        this.notifyDataSetChanged();
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgView;
        TextView tvTitle;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgView = itemView.findViewById(R.id.custom_img_quicklink);
            tvTitle = itemView.findViewById(R.id.custom_title_quicklink);
        }
    }
}
