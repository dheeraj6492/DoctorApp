package com.pinnainfotech.doctorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

        overridePendingTransition(R.anim.animation_normal,
                R.anim.animation_up);

    }
}
