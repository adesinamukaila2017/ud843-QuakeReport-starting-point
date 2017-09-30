package com.example.android.quakereport;

/**
 * Created by adesina on 9/22/2017.
 */

public class Earthquake {
    /** magnitude of the earthquake **/
    private String mMagnitude;

    /** magnitude of the location **/
    private String mLocation;

    /** magnitude of the earthquake **/
    private String mDate;

    /**
     * constructs a new (@link Earthquake) object
     * @param magnitude size of the earthquake
     * @param location city location of the earthquake
     * @param date date the earthquake happened
     */
    public Earthquake(String magnitude, String location, String date ) {
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    /**
     * Returns the magnitude of the earthquate
     */
    public String getmMagnitude(){return  mMagnitude;};

    /**
     * Returns the location of the earthquate
     */
    public String getmLocation(){return getmLocation();};

    /**
     * Returns the date of the earthquate
     */

    public String getmDate(){return  mDate;};

}
