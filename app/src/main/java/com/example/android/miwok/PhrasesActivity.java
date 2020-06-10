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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ArrayList<word> words = new ArrayList<>();

        words.add(new word("Bonjour","Good morning"));
        words.add(new word("Où vas-tu ?","where are you going ?"));
        words.add(new word("Comment vous appelez-vous ?","What is your name ?"));
        words.add(new word("Mon nom est...","My name is..."));
        words.add(new word("Comment tu te sens ?","How are you feeling ?"));
        words.add(new word("Je me sens bien","I'm feeling good"));
        words.add(new word("Viens-tu ?","Are you coming ?"));
        words.add(new word("Ouais, je viens","Yes, I'm coming"));
        words.add(new word("Allons y","Let's go"));
        words.add(new word("Viens ici","Come here"));
        words.add(new word("Merci","Thank you"));

        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
