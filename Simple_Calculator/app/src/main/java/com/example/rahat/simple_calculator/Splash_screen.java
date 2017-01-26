package com.example.rahat.simple_calculator;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Splash_screen extends AppCompatActivity {
    private static int splashTimeOut=4000;// in mili second
    ActionBar actionBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        actionBar=getSupportActionBar();
        actionBar.hide();// for hiding actionbar
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(Splash_screen.this,calculator_activity.class);
                startActivity(intent);
                finish();
            }
        },splashTimeOut);
    }
}
