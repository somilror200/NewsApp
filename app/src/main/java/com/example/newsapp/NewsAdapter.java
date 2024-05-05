package com.example.newsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {

    private List<NewsItem> newsList;
    private FragmentManager fragmentManager;

    public NewsAdapter(List<NewsItem> newsList, FragmentManager fragmentManager) {
        this.newsList = newsList;
        this.fragmentManager = fragmentManager;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        NewsItem newsItem = newsList.get(position);
        holder.titleTextView.setText(newsItem.getTitle());
        holder.descriptionTextView.setText(newsItem.getDescription());

        new ImageLoadTask(newsItem.getImageUrl(), holder.imageView).execute();

        holder.itemView.setOnClickListener(v -> {
            // Navigate to news detail fragment

            // 1. Create NewsDetailFragment instance and set arguments
            NewsDetailFragment newsDetailFragment = new NewsDetailFragment();
            Bundle args = new Bundle();
            args.putString("title", newsItem.getTitle());
            args.putString("description", newsItem.getDescription());
            args.putString("imageUrl", newsItem.getImageUrl());
            newsDetailFragment.setArguments(args);

            // 2. Replace current fragment with NewsDetailFragment
            fragmentManager.beginTransaction()
                    .replace(R.id.containerMain, newsDetailFragment)
                    .addToBackStack(null)  // Optional: Add to back stack for navigation
                    .commit();
        });
    }

    @Override
    public int getItemCount() {
        return newsList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleTextView;
        TextView descriptionTextView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTextView = itemView.findViewById(R.id.titleTextView);
            descriptionTextView = itemView.findViewById(R.id.descriptionTextView);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}

