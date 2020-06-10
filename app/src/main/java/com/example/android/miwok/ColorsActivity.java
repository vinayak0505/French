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
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> words = new ArrayList<>();


        words.add(new word("Roude","Red",R.drawable.color_red));
        words.add(new word("Jaune","Yellow",R.drawable.color_mustard_yellow));
        words.add(new word("Vert","green",R.drawable.color_green));
        //words.add(new word("Bleu","Blue"));
        words.add(new word("Orange","Orange",R.drawable.color_dusty_yellow));
        //words.add(new word("Violet","Violet"));
        words.add(new word("Brun","Brown",R.drawable.color_brown));
        words.add(new word("Blanc","White",R.drawable.color_white));
        words.add(new word("Noir","Black",R.drawable.color_black));
        words.add(new word("Gris","Grey",R.drawable.color_gray));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


    }
}
