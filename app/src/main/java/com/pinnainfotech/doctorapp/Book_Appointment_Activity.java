package com.pinnainfotech.doctorapp;

import android.content.Intent;
import android.icu.text.LocaleDisplayNames;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.util.Log;
import android.view.View;
import android.widget.CalendarView;
import android.widget.Toast;

public class Book_Appointment_Activity extends AppCompatActivity implements View.OnClickListener,CalendarView.OnDateChangeListener {

   private AppCompatButton btn_bookAppointment;
   private CalendarView simpleCalendarView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book__appointment_);

        btn_bookAppointment=findViewById(R.id.btn_bookAppointment);
        btn_bookAppointment.setOnClickListener(this);
         simpleCalendarView =  findViewById(R.id.calendarView);
         simpleCalendarView.setOnDateChangeListener(this);

        
    }

    @Override
    public void onClick(View view) {

        Intent intentPayment=new Intent(this,Payment_Activity.class);
        startActivity(intentPayment);
        finish();
    }

    @Override
    public void onSelectedDayChange(@NonNull CalendarView calendarView, int year, int month, int dayofMonth) {
      
        Toast.makeText(getApplicationContext(), dayofMonth + "/" + month + "/" + year, Toast.LENGTH_LONG).show();

    }
}
