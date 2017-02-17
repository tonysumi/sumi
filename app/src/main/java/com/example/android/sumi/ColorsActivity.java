package com.example.android.sumi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ColorsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Red","Huchui"));
        words.add(new Word("Green","Hozue"));
        words.add(new Word("Yellow","NA"));
        words.add(new Word("Blue","Khiithii"));
        words.add(new Word("Black","Zubue"));
        words.add(new Word("White","Metsuixoi"));
        words.add(new Word("Purple","NA"));
        words.add(new Word("Pink", "NA"));
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
