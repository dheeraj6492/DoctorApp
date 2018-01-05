package com.pinnainfotech.doctorapp.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;



import com.pinnainfotech.doctorapp.Adapters.MeetAdapter;
import com.pinnainfotech.doctorapp.R;


public class Fragment_MeetUs extends Fragment {



    MeetAdapter mMeetAdapter;
    private ListView listView;

    private View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_fragment__meet_us,container,false);
        listView=(ListView)view.findViewById(R.id.listView);
        mMeetAdapter  = new MeetAdapter(getActivity());
        listView.setAdapter(mMeetAdapter);
        return view;
    }





}
