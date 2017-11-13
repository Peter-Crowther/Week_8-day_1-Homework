package com.example.petes.wordcount;

import android.icu.lang.UCharacter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by petes on 13/11/2017.
 */

public class InputTest {

    Input input;


    @Test
    public void testNumberOfWords() {
        input = new Input("Hello World");
        assertEquals(2, input.wordCount());
    }

//    @Test
//    public void testFrequencyOfWords() {
//        input = new Input("It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity");
//
//    }

}
