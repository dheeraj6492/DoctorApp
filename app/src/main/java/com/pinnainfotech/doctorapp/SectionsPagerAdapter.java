package com.pinnainfotech.doctorapp;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pinnainfotech.doctorapp.Fragments.Fragment_MeetUs;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyAccount;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyAppointment;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyHealth;


import com.pinnainfotech.doctorapp.Fragments.Fragment_MyHome;

/**
 * Created by gonna on 12/26/2017.
 */

class SectionsPagerAdapter extends FragmentPagerAdapter {


    public SectionsPagerAdapter(FragmentManager fm ) {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                Fragment_MyHome branch2=new Fragment_MyHome();
                return branch2;

            case 1:
                Fragment_MyHealth branch1=new Fragment_MyHealth();
                return branch1;
            case 2:
                Fragment_MyAccount myAccount=new Fragment_MyAccount();
                return myAccount;

            case 3:
                Fragment_MeetUs meetUs=new Fragment_MeetUs();
                return meetUs;
            case 4:
                Fragment_MyAppointment branch3=new Fragment_MyAppointment();
                return branch3;
//                Fragment_MyAccount myAccount=new Fragment_MyAccount();
//                return myAccount;



        }
        return null;
    }

    @Override
    public int getCount() {
        return 4 ;
    }

//    @Override
//    public CharSequence getPageTitle(int position) {
//        switch (position) {
//            case 0:
//                return "Home";
//            case 1:
//                return "My Health";
//            case 2:
//                return "My Appointment";
//            case 3:
//                return "Meet Us";
//
//            case 4:
//                return "My Account";
//
//
//        }
//        return null;
//    }
}
