package com.alexspataru.atmosphere_weatherapp.Common;

import android.location.Location;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Common {

    public static final String APP_ID = "8346b1b32d7314257bf858dbb4a414f3";
    public static Location current_location = null;

    public static String convertUnixToDate(int dt) {
        Date date = new Date(dt*1000L);
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm dd EEE MM yyyy");
        String formatted = sdf.format(date);
        return formatted;
    }
}
