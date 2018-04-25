package com.example.mike.wordcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class WordCounterActivity extends AppCompatActivity {

    private WordCounter wordCounter;
    private Button countWordsButton;
    private EditText userInputText;
    private TextView answerTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_word_counter);

        this.countWordsButton = findViewById(R.id.countWordsButtonID);
        this.userInputText = findViewById(R.id.userInputTextID);
        this.answerTextView = findViewById(R.id.answerTextViewID);

        wordCounter = new WordCounter();
    }

    public void refresh(){
        wordCounter = new WordCounter();
    }

    public void onClickOfCountWordsButton(View countWordsButton){
        refresh();
        String paragraph = userInputText.getText().toString();
        answerTextView.setText("" + (wordCounter.countWords(paragraph)));
    }


}
