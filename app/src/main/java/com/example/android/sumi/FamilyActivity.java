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
        words.add(new Word("Father","Apu",R.drawable.family_father));
        words.add(new Word("Mother","Aza",R.drawable.family_mother));
        words.add(new Word("Sister","Afo",R.drawable.family_younger_sister));
        words.add(new Word("Brother","Amu",R.drawable.family_younger_brother));
        words.add(new Word("Grand Father","Azii",R.drawable.family_grandfather));
        words.add(new Word("Grand Mother","Apza",R.drawable.family_grandmother));
        words.add(new Word("Baby","Ank aa",R.drawable.family_son));
        words.add(new Word("Boy", "Kiktimi",R.drawable.family_older_brother));
        words.add(new Word("Girl","Totimi",R.drawable.family_older_sister));
        words.add(new Word("Wife","Anipu",R.drawable.family_older_sister));
        words.add(new Word("Husband","Akimi",R.drawable.family_father));
        WordAdapter adapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
