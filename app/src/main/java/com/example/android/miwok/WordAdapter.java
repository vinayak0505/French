package com.example.android.miwok;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<word> {

    private int mcolor;


    private static final String LOG_TAG = WordAdapter.class.getSimpleName();

    public WordAdapter(Activity context, ArrayList<word> words,int color) {
        super(context, 0, words);
        mcolor = color;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.text_english);
        nameTextView.setText(currentWord.getDefaultTranslation());
        TextView numberTextView = (TextView) listItemView.findViewById(R.id.text_french);
        numberTextView.setText(currentWord.getFrenchTranslation());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentWord.getImage());
        LinearLayout linearLayout = (LinearLayout) listItemView.findViewById(R.id.linearLayout);
        int color = ContextCompat.getColor(getContext(), mcolor);
        linearLayout.setBackgroundColor(color);
        return listItemView;
    }
}

