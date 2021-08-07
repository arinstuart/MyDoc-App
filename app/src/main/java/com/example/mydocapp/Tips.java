package com.example.mydocapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Tips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflate = getMenuInflater();
        inflate.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {

            case R.id.Logout:
                Intent s = new Intent(Tips.this, Login.class);
                startActivity(s);
                return true;
            case R.id.preferences:
                Intent p = new Intent(Tips.this, Daily.class);
                startActivity(p);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    public void daily(View view) {
        Intent i = new Intent(getApplicationContext(), Daily.class);
        startActivity(i);
        finish();
    }
    public void consult(View view) {
        Intent i = new Intent(getApplicationContext(), Consult.class);
        startActivity(i);
        finish();
    }
    public void contact(View view) {
        Intent i = new Intent(getApplicationContext(), Contact.class);
        startActivity(i);
        finish();
    }
    public void appontments(View view) {
        Intent i = new Intent(getApplicationContext(), Appointments.class);
        startActivity(i);
        finish();
    }
    public void buy(View view){
                Intent i = new Intent(getApplicationContext(), Buy.class);
                startActivity(i);
                finish();
    }
}