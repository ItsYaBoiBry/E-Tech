package com.etechnologycentre.com.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        int SPLASH_TIME_OUT = 2000;
        new Handler().postDelayed(() -> {
            Intent i = new Intent(SplashScreen.this, Login.class);
            startActivity(i);
            finish();
        }, SPLASH_TIME_OUT);
    }
}
