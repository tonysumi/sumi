package com.example.android.sumi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class FamilyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Father","Apu"));
        words.add(new Word("Mother","Aza"));
        words.add(new Word("Sister","Afo"));
        words.add(new Word("Brother","Amu"));
        words.add(new Word("Grand Father","Azii"));
        words.add(new Word("Grand Mother","Apza"));
        words.add(new Word("Baby","Ank aa"));
        words.add(new Word("Boy", "Kiktimi"));
        words.add(new Word("Girl","Totimi"));
        words.add(new Word("Wife","Anipu"));
        words.add(new Word("Husband","Akimi"));
        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
