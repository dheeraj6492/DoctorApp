package com.pinnainfotech.doctorapp.Adapters;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.pinnainfotech.doctorapp.R;


/**
 * Created by gonna on 12/26/2017.
 */

public class HomeAdapter extends BaseAdapter {

    Context context;
    LayoutInflater inflter;


    public HomeAdapter(Context context) {
        this.context = context;
        inflter = (LayoutInflater.from(context));
    }

    @Override
    public int getCount() {
        return 5;
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
    public View getView(int position, View view, ViewGroup viewGroup) {
        view =inflter.inflate(R.layout.home_row, null);


        return view;
    }
}
