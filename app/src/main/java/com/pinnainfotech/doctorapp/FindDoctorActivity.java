package com.pinnainfotech.doctorapp;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;

import com.pinnainfotech.doctorapp.Adapters.FaqModel;
import com.pinnainfotech.doctorapp.Adapters.FindDoctorAdapter;
import com.pinnainfotech.doctorapp.ModelClass.DoctorList;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class FindDoctorActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    private ListView listDoctor;
    private ArrayList<DoctorList> mDoctorLists;



    private FindDoctorAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_doctor);


        int pos =getIntent().getIntExtra("url",0);



        listDoctor = (ListView) findViewById(R.id.list_Doctor);
        listDoctor.setOnItemClickListener(this);
        ArrayList<DoctorList> itemsData = new ArrayList<>();

        for (int c = 0; c < 20; c++) {
            itemsData.add(new DoctorList("dinesh" + c, "uewe","ghg"));

        }

        mAdapter = new FindDoctorAdapter(this,itemsData);

        listDoctor.setAdapter(mAdapter);

    }


    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Intent intent = new Intent(this, Doctor_Details_Activity.class);
        intent.putExtra("url", i);
        startActivity(intent);
    }
}
