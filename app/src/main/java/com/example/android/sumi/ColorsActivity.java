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
        words.add(new Word("Red","Huchui",R.drawable.color_red));
        words.add(new Word("Green","Hozue",R.drawable.color_green));
        words.add(new Word("Yellow","NA",R.drawable.color_dusty_yellow));
        words.add(new Word("Brown","Khiithii",R.drawable.color_brown));
        words.add(new Word("Black","Zubue",R.drawable.color_black));
        words.add(new Word("White","Metsuixoi",R.drawable.color_white));
        words.add(new Word("Gray","NA",R.drawable.color_gray));
        words.add(new Word("Mustard Yellow", "NA",R.drawable.color_mustard_yellow));
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
