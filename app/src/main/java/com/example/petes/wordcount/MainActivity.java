package com.example.petes.wordcount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView counter;
    private EditText sentenceEditText;
    private int currentWordCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.counter = (TextView) findViewById(R.id.counter);
        this.sentenceEditText = (EditText) findViewById(R.id.editText);
        this.currentWordCount = 0;
    }

    public void onButtonClick(View view) {
        String sentence = this.sentenceEditText.getText().toString();
        Input input = new Input(sentence);
        int result = input.wordCount();
        this.counter.setText(Integer.toString(result));
    }



}
