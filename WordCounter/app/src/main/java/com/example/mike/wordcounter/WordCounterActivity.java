package com.example.mike.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class WordCounterActivity extends AppCompatActivity {

    private WordCounter wordCounter;
    private Button countWordsButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        wordCounter = new WordCounter();
    }

}
