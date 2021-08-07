package com.example.mydocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void sign(View view) {
        Intent i = new Intent(getApplicationContext(), Profile.class);
        startActivity(i);
        finish();
    }
    public void log(View view) {
        Intent i = new Intent(getApplicationContext(), Daily.class);
        startActivity(i);
        finish();
    }
}