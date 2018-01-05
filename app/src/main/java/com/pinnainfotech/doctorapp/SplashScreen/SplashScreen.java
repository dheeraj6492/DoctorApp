package com.pinnainfotech.doctorapp.SplashScreen;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.pinnainfotech.doctorapp.LoginActivity;
import com.pinnainfotech.doctorapp.MainActivity;
import com.pinnainfotech.doctorapp.R;

public class SplashScreen extends AppCompatActivity {

    private final static int spead=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

            mSplash();

    }



    public void mSplash()
     {
         Thread mythread = new Thread() {
             public void run() {
                 try {
                     sleep(spead);
                     Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                     startActivity(intent);
                     finish();
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             }
         };
         mythread.start();
     }
    }


