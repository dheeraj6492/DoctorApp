package com.pinnainfotech.doctorapp.Interface;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.MenuItem;

/**
 * Created by gonna on 12/26/2017.
 */

public interface FragmentMessenger {

    public void changeFragment(Fragment fragment, Bundle data, String fragmentTag, boolean addToBackStack);


}
