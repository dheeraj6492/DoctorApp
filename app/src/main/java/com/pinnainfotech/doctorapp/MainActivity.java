package com.pinnainfotech.doctorapp;

import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Spannable;
import android.text.SpannableString;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.pinnainfotech.doctorapp.CustomFont.CustomTypefaceSpan;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MeetUs;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyAccount;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyAppointment;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyHealth;
import com.pinnainfotech.doctorapp.Fragments.Fragment_MyHome;
import com.pinnainfotech.doctorapp.Interface.FragmentMessenger;
import com.pinnainfotech.doctorapp.SplashScreen.Util.GLOBAL;

import static com.pinnainfotech.doctorapp.CustomFont.FontClass.customFont;


public class MainActivity extends AppCompatActivity implements FragmentMessenger,NavigationView.OnNavigationItemSelectedListener {
    private Menu menu;
    private MenuItem myLeads, home, myMeetings, myTeam, distance, leadAssign, trackMyTeam;
    private ActionBarDrawerToggle mDrawerToggle;
    private NavigationView yourNavigationView;
    private DrawerLayout drawer;
    private  Toolbar toolbar;
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

   private TabLayout tabLayout, tabLayoutBottom;

    private SectionsPagerAdapter mSectionsPagerAdapter;

private String test;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //drawer set
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

         yourNavigationView = (NavigationView) findViewById(R.id.nav_view);
        yourNavigationView.setNavigationItemSelectedListener(this);




        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.view_pager);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);


        setIconTab();
      //  mTabLayoutBottom();
        changeFragment(new Fragment_MyHome(), null, "Fragment_MyHome", true);


    }



    private void setIconTab() {
        for (int tabCount = 0; tabCount < GLOBAL.tabName.length; tabCount++) {
            // tabLayout.addTab(tabLayout.newTab().setText(GLOBAL.tabName[tabCount]));
            tabLayout.getTabAt(tabCount).setIcon(GLOBAL.tabIcons[tabCount]);
//            tabLayoutBottom.getTabAt(tabCount).setIcon(GLOBAL.tabIcons[tabCount]);

        }
    }

    private void mTabLayoutBottom() {
        tabLayoutBottom = (TabLayout) findViewById(R.id.tab_layout);
        tabLayoutBottom.setTabGravity(TabLayout.GRAVITY_CENTER);


        for (int tabCount = 0; tabCount < GLOBAL.tabNameBottom.length; tabCount++) {
            tabLayoutBottom.addTab(tabLayoutBottom.newTab().setText(GLOBAL.tabNameBottom[tabCount]));
            tabLayoutBottom.getTabAt(tabCount).setIcon(GLOBAL.tabIcons[tabCount]);
        }

        tabLayoutBottom.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int tabCount = tab.getPosition();

//
                switch (tabCount) {
                    case 0:
                        backStack();


                        changeFragment(new Fragment_MyHome(), null, "Fragment_MyHome", true);
//

//
// Intent intent=new Intent(MainActivity.this,JoinActivity.class);
//                         startActivity(intent);
                        break;
                    case 1:
                        backStack();
                        changeFragment(new Fragment_MeetUs(), null, "Fragment_MeetUs", true);

//                        Intent intent1=new Intent(MainActivity.this,JoinActivity.class);
//                        startActivity(intent1);
                        break;
                    case 2:
//                        changeFragment(new ExpendableListView(), null, "ExpendableListView", true);

                        Intent intent3 = new Intent(MainActivity.this, JoinActivity.class);
                        startActivity(intent3);

                        overridePendingTransition(R.anim.animation_up,
                                R.anim.animation_normal);

                        break;
                }


            }


            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    @Override
    public void changeFragment(Fragment fragment, Bundle data, String fragmentTag, boolean addToBackStack) {
        fragmentManager = getSupportFragmentManager();
        boolean fragmentPopped = fragmentManager.popBackStackImmediate(fragmentTag, 0);

        if (!fragmentPopped && fragmentManager.findFragmentByTag(fragmentTag) == null) { //fragment not in backlist stack, create it.
            fragmentTransaction = fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.view_pager, fragment, fragmentTag);
            if (data != null)
                fragment.setArguments(data);
            fragmentTransaction.addToBackStack(fragmentTag);
            fragmentTransaction.commit();
        }


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();

        tabLayout.setVisibility(View.VISIBLE);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (fragmentManager.getBackStackEntryCount() == 1)
                MainActivity.this.finish();
            else {
                fragmentManager.popBackStack();
            }
        }
    }

    private void backStack() {
        for (int i = 0; i < fragmentManager.getBackStackEntryCount(); ++i) {
            fragmentManager.popBackStack();
        }
    }









     @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            // Handle the camera action
            changeFragment(new Fragment_MyHome(), null, "Fragment_MyHome", true);
        } else if (id == R.id.nav_myLeads) {

            changeFragment(new Fragment_MyHealth(), null, "Fragment_MeetUs", true);
        } else if (id == R.id.nav_meetings) {
            changeFragment(new Fragment_MeetUs(), null, "Fragment_MeetUs", true);

        } else if (id == R.id.nav_team) {
            changeFragment(new Fragment_MyAppointment(), null, "Fragment_MeetUs", true);
        } else if (id == R.id.nav_distance) {
            changeFragment(new Fragment_MyHealth(), null, "Fragment_MeetUs", true);
        }
         drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}



