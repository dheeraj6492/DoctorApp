package com.pinnainfotech.doctorapp.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.pinnainfotech.doctorapp.Adapters.FaqAdapters;
import com.pinnainfotech.doctorapp.Adapters.FaqModel;
import com.pinnainfotech.doctorapp.Adapters.HomeAdapter;
import com.pinnainfotech.doctorapp.FindDoctorActivity;
import com.pinnainfotech.doctorapp.Interface.FragmentMessenger;
import com.pinnainfotech.doctorapp.R;

import java.util.ArrayList;


public class Fragment_MyHome extends Fragment implements AdapterView.OnItemClickListener {
    private View view;
    HomeAdapter mHomeAdapter;
    private GridView listView;
    private ArrayList<FaqModel> faqEnglishModels;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_fragment_home, container, false);

        listView = (GridView) view.findViewById(R.id.list_view);

        listView.setOnItemClickListener(this);


        faqEnglishModels = new ArrayList<>();

        for (int c = 0; c < 20; c++) {
            faqEnglishModels.add(new FaqModel("dinesh" + c, "uewe"));

        }

        listView.setAdapter(new FaqAdapters(getActivity(), faqEnglishModels));


        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

        Intent intent = new Intent(getActivity(), FindDoctorActivity.class);

        intent.putExtra("url", position);

        startActivity(intent);


    }


}
