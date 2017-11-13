package com.example.petes.wordcount;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by petes on 13/11/2017.
 */

public class Input {

    String input;

    public Input(String input) {
        this.input = input;
    }

    public int wordCount() {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.split("\\s+");
        return words.length;
    }

    
}
