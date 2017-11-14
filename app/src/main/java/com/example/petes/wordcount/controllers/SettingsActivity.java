package com.example.petes.wordcount.controllers;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.example.petes.wordcount.R;

public class SettingsActivity extends AppCompatActivity {

    private TextView settingsInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        this.settingsInfo = (TextView) findViewById(R.id.textView);

        this.settingsInfo.setText("Feature coming soon");
    }

}
