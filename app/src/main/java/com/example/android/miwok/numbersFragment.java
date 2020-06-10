package com.example.android.miwok;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 * Use the {@link numbersFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class numbersFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public numbersFragment() {
        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.word_list, container, false);


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
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment numbersFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static numbersFragment newInstance(String param1, String param2) {
        numbersFragment fragment = new numbersFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_numbers, container, false);
    }
}
