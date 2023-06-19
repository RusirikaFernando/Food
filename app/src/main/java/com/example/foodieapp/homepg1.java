package com.example.foodieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class homepg1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepg1);
    }
    public void add1(View n){
        Intent i = new Intent(this, homepg6.class);
        startActivity(i);
    }
    public void backbutton1(View n){
        Intent i = new Intent(this, homepage.class);
        startActivity(i);
    }
}