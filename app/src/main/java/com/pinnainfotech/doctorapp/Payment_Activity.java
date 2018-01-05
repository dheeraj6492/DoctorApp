package com.pinnainfotech.doctorapp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;


public class Payment_Activity extends AppCompatActivity implements View.OnClickListener{
    private AppCompatButton btn_PROCEED;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_);

        btn_PROCEED=findViewById(R.id.btn_PROCEED);
        btn_PROCEED.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {


        Toast.makeText(this, "Waiting for PayU payment", Toast.LENGTH_SHORT).show();



    }
}
