package com.pinnainfotech.doctorapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatTextView;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;

public class Doctor_Details_Activity extends AppCompatActivity implements View.OnClickListener {

    AppCompatTextView tv_RBook_appointment,tv_Waiting_room_dashboard;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor__details_);

      //  int pos =getIntent().getIntExtra("url1",0);

        tv_RBook_appointment=findViewById(R.id.tv_RBook_appointment);
        tv_Waiting_room_dashboard=findViewById(R.id.tv_Waiting_room_dashboard);
        tv_RBook_appointment.setOnClickListener(this);
        tv_Waiting_room_dashboard.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        int getId=view.getId();
        switch (getId)
        {
            case R.id.tv_RBook_appointment:
                Intent bookIntent=new Intent(this,Book_Appointment_Activity.class);
                startActivity(bookIntent);
                break;

            case R.id.tv_Waiting_room_dashboard:
                Intent waiting_Intent=new Intent(this,Payment_Activity.class);
                startActivity(waiting_Intent);
                break;
        }


    }



}
