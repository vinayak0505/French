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

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<word> words = new ArrayList<>();

        words.add(new word("Pere","Father",R.drawable.family_father));
        words.add(new word("Mere","Mother",R.drawable.family_mother));
        words.add(new word("Frere","Brother",R.drawable.family_son));
        words.add(new word("Soeur","Sister",R.drawable.family_daughter));
        words.add(new word("Grand-pere","Grandfather",R.drawable.family_grandfather));
        words.add(new word("Grand-pere","Grandmother",R.drawable.family_grandmother));
        words.add(new word("Femme","Wife",R.drawable.family_father));
        words.add(new word("Mari","Husband",R.drawable.family_mother));
        words.add(new word("Fils","Son",R.drawable.family_younger_brother));
        words.add(new word("Fille","Daughter",R.drawable.family_younger_sister));
        words.add(new word("Oncle","Uncle",R.drawable.family_older_brother));
        words.add(new word("Tante","Aunt",R.drawable.family_older_sister));


        WordAdapter Adapter = new WordAdapter(this,words,R.color.category_family);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(Adapter);
    }
}
