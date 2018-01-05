package com.pinnainfotech.doctorapp.Fragments;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.pinnainfotech.doctorapp.Adapters.FindDoctorAdapter;
import com.pinnainfotech.doctorapp.Doctor_Details_Activity;
import com.pinnainfotech.doctorapp.ModelClass.DoctorList;
import com.pinnainfotech.doctorapp.R;

import java.util.ArrayList;


public class Fragment_FindDoctor extends Fragment implements  AdapterView.OnItemClickListener {

    private ListView listDoctor;
    private ArrayList<DoctorList> mDoctorLists;



    private FindDoctorAdapter mAdapter;

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view=inflater.inflate(R.layout.fragment_fragment__find_doctor,container,false);
        int pos =getActivity().getIntent().getIntExtra("url",0);



        listDoctor = (ListView)view.findViewById(R.id.list_Doctor);
        listDoctor.setOnItemClickListener(this);
        ArrayList<DoctorList> itemsData = new ArrayList<>();

        for (int c = 0; c < 20; c++) {
            itemsData.add(new DoctorList("dinesh" + c, "uewe","ghg"));

        }

        mAdapter = new FindDoctorAdapter(getContext(),itemsData);

        listDoctor.setAdapter(mAdapter);




        return view;


    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(getContext(), Doctor_Details_Activity.class);
        intent.putExtra("url", i);
        startActivity(intent);

    }
}
