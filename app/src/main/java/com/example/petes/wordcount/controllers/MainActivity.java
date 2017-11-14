package com.example.petes.wordcount.controllers;

import android.content.Intent;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.petes.wordcount.R;
import com.example.petes.wordcount.models.Input;

public class MainActivity extends AppCompatActivity {

    private EditText sentenceEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        this.sentenceEditText = (EditText) findViewById(R.id.editText);
    }

    public void onButtonClick(View view) {
//        String sentence = this.sentenceEditText.getText().toString();
//        Input input = new Input(sentence);
//        int result = input.wordCount();
//        this.counter.setText(Integer.toString(result));

        Intent intent = new Intent(this, AnswerActivity.class);
        String sentence = this.sentenceEditText.getText().toString();
        Input input = new Input(sentence);
        int count = input.wordCount();
        intent.putExtra("answer", count);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.activity_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.action_about){
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
        }

        else if (item.getItemId() == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
        }

        return true;
    }





}
