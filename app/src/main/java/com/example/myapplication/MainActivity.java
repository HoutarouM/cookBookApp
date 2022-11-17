package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    // jezeli w ukladzie z ogranieczeniami nie zdefiniowane ograniczenia (constrainty)
    // pojawia sie w lewych gornym rogu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}