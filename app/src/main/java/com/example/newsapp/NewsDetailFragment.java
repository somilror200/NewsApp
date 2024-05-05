package com.example.newsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

public class NewsDetailFragment extends Fragment {

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_news_detail, container, false);

        // Retrieve news item details from arguments
        Bundle args = getArguments();
        if (args != null && args.containsKey("title") && args.containsKey("description")) {
            String title = args.getString("title");
            String description = args.getString("description");

            // Update UI with news item details
            TextView titleTextView = root.findViewById(R.id.titleTextView);
            TextView descriptionTextView = root.findViewById(R.id.descriptionTextView);

            titleTextView.setText(title);
            descriptionTextView.setText(description);
        }

        return root;
    }
}
