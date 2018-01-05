package com.pinnainfotech.doctorapp.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pinnainfotech.doctorapp.R;


public class Fragment_MyAppointment extends Fragment {

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

       // mIdDifineMethod();

        view=inflater.inflate(R.layout.branch_fragment,container,false);
        return view;
    }

    public void mIdDifineMethod() {

        //button_appointmen= (AppCompatImageButton) view.findViewById(R.id.buttonAwesome);
    }
}
