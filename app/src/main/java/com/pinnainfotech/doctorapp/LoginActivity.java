package com.pinnainfotech.doctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    AppCompatButton joinButton,signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        signInButton=findViewById(R.id.mLogin);
        joinButton=findViewById(R.id.mJoin);

        joinButton.setOnClickListener(this);
        signInButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

        int getid=view.getId();
        if(getid==R.id.mLogin)
        {
            Intent signIntent=new Intent(this,MainActivity.class);
            startActivity(signIntent);
        }else if(getid==R.id.mJoin) {
            Intent joinIntent = new Intent(this, JoinActivity.class);
            startActivity(joinIntent);
        }
    }


}
