package com.alexspataru.atmosphere_weatherapp;


import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
@RequiresApi(api = Build.VERSION_CODES.HONEYCOMB)
public class TodayWeatherFragment extends Fragment {

    static TodayWeatherFragment instance;

    public static android.support.v4.app.Fragment getInstance(){
        if(instance == null)
            instance = new TodayWeatherFragment();
        return instance;
    }


    public TodayWeatherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_today_weather, container, false);
    }

}
