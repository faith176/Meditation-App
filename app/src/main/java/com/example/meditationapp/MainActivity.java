package com.example.meditationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * The method that will be called when the start button is pressed. Begins main portion of app
     * @param view The current view.
     */
    public void onStartButtonPressed(View view) {
        Intent intent = new Intent(MainActivity.this, BreatheActivity.class);
        startActivity(intent);
    }
}