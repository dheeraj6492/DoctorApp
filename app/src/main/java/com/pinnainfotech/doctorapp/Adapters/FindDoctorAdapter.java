package com.pinnainfotech.doctorapp.Adapters;

import android.content.Context;
import android.support.v7.widget.AppCompatAutoCompleteTextView;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.AppCompatTextView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.pinnainfotech.doctorapp.ModelClass.DoctorList;
import com.pinnainfotech.doctorapp.R;


import java.util.ArrayList;

/**
 * Created by gonna on 12/29/2017.
 */

public class FindDoctorAdapter extends BaseAdapter {

    private Context context;
    private AppCompatImageView imageView;
    ArrayList<DoctorList> itemsData;
    public FindDoctorAdapter(Context context,ArrayList<DoctorList> itemsData) {
        this.context = context;
        this.itemsData=itemsData;

    }

    @Override
    public int getCount() {
        return itemsData.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {




        LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        view= inflater.inflate(R.layout.find_doctor_list_row,null);

//        imageView = (AppCompatImageView) view.findViewById(R.id.image_Doctor);
        TextView tvDoctorName =  view.findViewById(R.id.text_DoctoName);
        TextView tvSpecialityName = view.findViewById(R.id.text_Speciality);

        tvDoctorName.setText(itemsData.get(position).getDoctorName());

        //set Doctor Name Or Speciality Name

//        tvDoctorName.setText(itemsData.get(position).getDoctorName());
//        tvSpecialityName.setText(itemsData.get(position).getSpecialityName());
//
//
//        //Set Image from Server side
//
//        Glide.with(context).load(itemsData.get(position).getArtworkUrl60())
//                .thumbnail(0.5f)
//                .crossFade()
//                .diskCacheStrategy(DiskCacheStrategy.ALL)
//                .into(imageView);

        return view;
    }
}
