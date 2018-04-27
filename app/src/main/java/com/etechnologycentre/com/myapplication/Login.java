package com.etechnologycentre.com.myapplication;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RelativeLayout;

public class Login extends AppCompatActivity {
    RelativeLayout background;
    Button login, signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Window w = getWindow();
        w.addFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            w.addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
        }
        background = findViewById(R.id.background);
        AnimationDrawable progressDrawable = (AnimationDrawable) background.getBackground();
        progressDrawable.start();
        login = findViewById(R.id.login);
        signup = findViewById(R.id.signup);
        login.setOnClickListener(v->startActivity(new Intent(this,MainActivity.class)));
        signup.setOnClickListener(v->startActivity(new Intent(this,doSignup.class)));


    }
}
