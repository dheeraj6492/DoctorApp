package com.pinnainfotech.doctorapp.CustomFont;

import android.content.Context;
import android.graphics.Typeface;

/**
 * Created by gonna on 1/4/2018.
 */

public class FontClass {
    public static Typeface customFont(Context context) {
        Typeface font = Typeface.createFromAsset(context.getAssets(), "font/Ubuntu-B.ttf");
        return font;
    }

}
