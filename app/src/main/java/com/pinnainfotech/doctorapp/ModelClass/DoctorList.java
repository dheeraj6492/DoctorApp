package com.pinnainfotech.doctorapp.ModelClass;

/**
 * Created by gonna on 12/29/2017.
 */

public class DoctorList {

    private String doctorName;
    private String SpecialityName;
    private String artworkUrl60;

    public DoctorList()
    {

    }
    public DoctorList(String doctorName, String specialityName, String artworkUrl60) {
        this.doctorName = doctorName;
        SpecialityName = specialityName;
        this.artworkUrl60 = artworkUrl60;

    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialityName() {
        return SpecialityName;
    }

    public void setSpecialityName(String specialityName) {
        SpecialityName = specialityName;
    }

    public String getArtworkUrl60() {
        return artworkUrl60;
    }

    public void setArtworkUrl60(String artworkUrl60) {
        this.artworkUrl60 = artworkUrl60;
    }

    @Override
    public String toString() {
        return "DoctorList{" +
                "doctorName='" + doctorName + '\'' +
                ", SpecialityName='" + SpecialityName + '\'' +
                ", artworkUrl60='" + artworkUrl60 + '\'' +
                '}';
    }
}
