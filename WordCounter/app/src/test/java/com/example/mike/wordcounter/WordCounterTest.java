package com.example.mike.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WordCounterTest {
    private WordCounter wordcounter;

    @Before

    public void setup() {
        wordcounter = new WordCounter();
    }

    @Test
    public void canAssert(){
        assertEquals(1,1);
    }

    @Test
    public void canCountWords(){
        assertEquals(4, wordcounter.countWords("The swift brown fox."));
    }
}
