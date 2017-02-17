package com.example.android.sumi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Zero","Abo"));
        words.add(new Word("One","Lakhi"));
        words.add(new Word("Two","Kini"));
        words.add(new Word("Three","Khiithii"));
        words.add(new Word("Four","Biti"));
        words.add(new Word("Five","Pukii"));
        words.add(new Word("Six","Tsiiqo"));
        words.add(new Word("Seven", "Tsiini"));
        words.add(new Word("Eight","Tache"));
        words.add(new Word("Nine","Tuku"));
        words.add(new Word("Ten","Chixi"));
        WordAdapter adapter =
                new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
         }
}
