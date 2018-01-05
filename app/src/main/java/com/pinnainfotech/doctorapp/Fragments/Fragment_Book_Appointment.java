package com.pinnainfotech.doctorapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinnainfotech.doctorapp.Payment_Activity;
import com.pinnainfotech.doctorapp.R;


public class Fragment_Book_Appointment extends Fragment implements View.OnClickListener {
    private View view;
    private AppCompatButton btn_bookAppointment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_fragment__book__appointment, container, false);

        btn_bookAppointment=view.findViewById(R.id.btn_bookAppointment);
        btn_bookAppointment.setOnClickListener(this);
        return view;
    }


    @Override
    public void onClick(View view) {
        Intent intentPayment=new Intent(getContext(),Payment_Activity.class);
        startActivity(intentPayment);
        getActivity().finish();
    }
}






