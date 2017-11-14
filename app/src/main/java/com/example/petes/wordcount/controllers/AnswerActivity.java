package com.example.petes.wordcount.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.petes.wordcount.R;

public class AnswerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        int count = extras.getInt("answer");
        TextView answerTextView = findViewById(R.id.answer);
        answerTextView.setText(Integer.toString(count));
    }

}
