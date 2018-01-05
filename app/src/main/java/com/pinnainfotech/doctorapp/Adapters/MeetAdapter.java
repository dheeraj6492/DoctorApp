package com.pinnainfotech.doctorapp.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pinnainfotech.doctorapp.R;


public class MeetAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflter;

    public MeetAdapter(Context context) {
        this.context = context;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {


            view =inflter.inflate(R.layout.meet_us_row, null);


            return view;
        }


}
