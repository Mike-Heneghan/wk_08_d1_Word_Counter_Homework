package com.example.mike.wordcounter;

import java.util.ArrayList;

/**
 * Created by mike on 23/04/2018.
 */

public class WordCounter {
    private String paragraph;
    private ArrayList<String> words;


    public WordCounter(){
        this.paragraph = null;
        this.words = new ArrayList<>();
    }

    public int countWords(String paragraph){
        String[] words = paragraph.split(" ");
        return words.length;
    }


}
