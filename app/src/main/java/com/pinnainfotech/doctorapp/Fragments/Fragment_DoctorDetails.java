package com.pinnainfotech.doctorapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinnainfotech.doctorapp.Book_Appointment_Activity;
import com.pinnainfotech.doctorapp.Payment_Activity;
import com.pinnainfotech.doctorapp.R;


public class Fragment_DoctorDetails extends Fragment implements View.OnClickListener  {
    private View view;
    AppCompatTextView tv_RBook_appointment,tv_Waiting_room_dashboard;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fragment__doctor_details,container,false);

        tv_RBook_appointment=view.findViewById(R.id.tv_RBook_appointment);
        tv_Waiting_room_dashboard=view.findViewById(R.id.tv_Waiting_room_dashboard);
        tv_RBook_appointment.setOnClickListener(this);
        tv_Waiting_room_dashboard.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        int getId=view.getId();
        switch (getId)
        {
            case R.id.tv_RBook_appointment:
                Intent bookIntent=new Intent(getContext(),Book_Appointment_Activity.class);
                startActivity(bookIntent);
                break;

            case R.id.tv_Waiting_room_dashboard:
                Intent waiting_Intent=new Intent(getContext(),Payment_Activity.class);
                startActivity(waiting_Intent);
                break;
        }
    }
}
