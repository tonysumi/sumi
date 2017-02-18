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
        words.add(new Word("One","Lakhi",R.drawable.number_one));
        words.add(new Word("Two","Kini",R.drawable.number_two));
        words.add(new Word("Three","Khiithii",R.drawable.number_three));
        words.add(new Word("Four","Biti",R.drawable.number_four));
        words.add(new Word("Five","Pukii",R.drawable.number_five));
        words.add(new Word("Six","Tsiiqo",R.drawable.number_six));
        words.add(new Word("Seven", "Tsiini",R.drawable.number_seven));
        words.add(new Word("Eight","Tache",R.drawable.number_eight));
        words.add(new Word("Nine","Tuku",R.drawable.number_nine));
        words.add(new Word("Ten","Chixi",R.drawable.number_ten));
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_numbers);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
         }
}
