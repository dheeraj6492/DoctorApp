package com.pinnainfotech.doctorapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.pinnainfotech.doctorapp.R;

import java.util.ArrayList;
import java.util.Collections;


public class Fragment_MyAccount extends Fragment {



    private View view;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_fragment__my_account,container,false);

        return view;
    }


}
