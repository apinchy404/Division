package com.example.divisionapp;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int splashTimeOut = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(MainActivity.this, Div.class);
                startActivity(i);
                Toast.makeText(MainActivity.this, "Divisions Of Bd", Toast.LENGTH_SHORT).show();
                finish();
            }
        }, splashTimeOut);


    }
}