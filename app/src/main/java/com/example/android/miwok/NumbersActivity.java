/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ArrayList<word> words = new ArrayList<word>();

        words.add(new word("Un","one",R.drawable.number_one));
        words.add(new word("Deux","Two",R.drawable.number_two));
        words.add(new word("Trois","Three",R.drawable.number_three));
        words.add(new word("Quatre","Four",R.drawable.number_four));
        words.add(new word("Cinq","Five",R.drawable.number_five));
        words.add(new word("Six","six",R.drawable.number_six));
        words.add(new word("Sept","Seven",R.drawable.number_seven));
        words.add(new word("Huit","Eight",R.drawable.number_eight));
        words.add(new word("Neuf","Nine",R.drawable.number_nine));
        words.add(new word("Dix","Ten",R.drawable.number_ten));

        WordAdapter Adapter = new WordAdapter(this, words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}