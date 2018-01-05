package com.pinnainfotech.doctorapp.Adapters;

/**
 * Created by DineshP on 12/29/2017.
 */

 public class FaqModel {
    private String title;
    private String  imagename;

    public FaqModel(String title, String imagename) {
        this.title = title;
        this.imagename = imagename;
    }


    public String getTitle() {
        return title;
    }

    public String getImagename() {
        return imagename;
    }
}
