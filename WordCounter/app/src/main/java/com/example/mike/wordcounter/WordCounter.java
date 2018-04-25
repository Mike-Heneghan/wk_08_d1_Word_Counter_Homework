package com.example.mike.wordcounter;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by mike on 23/04/2018.
 */

public class WordCounter {

    public WordCounter(){
    }

    public int countWords(String paragraph){
        String[] words = paragraph.split(" ");
        return (words.length);

    }


}
