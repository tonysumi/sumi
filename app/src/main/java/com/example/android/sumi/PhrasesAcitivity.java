package com.example.android.sumi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("What is your name?","O je ku ye?"));
        words.add(new Word("where are you going?","Khila ii che ne?"));
        words.add(new Word("My name is...","E je nah..."));
        words.add(new Word("Come here.","Hi la e xi"));
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_phrases);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
