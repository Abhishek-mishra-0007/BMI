package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splasih extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splasih);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent iNext = new Intent(splasih.this,MainActivity.class);
                startActivity(iNext);
                finish();
            }
        },4000);
    }
}