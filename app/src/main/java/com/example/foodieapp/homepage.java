package com.example.foodieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(homepage.this, MapsActivity.class);
                startActivity(intent);
                finish();

            }
        },25000);

    }
    public void mapbtn(View n){
        Intent i = new Intent(this, MapsActivity.class);
        startActivity(i);
    }
}