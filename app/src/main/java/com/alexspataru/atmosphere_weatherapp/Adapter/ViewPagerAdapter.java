package com.alexspataru.atmosphere_weatherapp.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.annotations.Nullable;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment>fragmentList = new ArrayList<>();
    private final List<String> fragmentTitle = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i){
        return fragmentList.get(i);
    }
    @Override
    public int getCount(){
        return fragmentList.size();
    }
    public void addFragment (Fragment fragment, String title){

        fragmentList.add(fragment);
        fragmentTitle.add(title);


    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentTitle.get(position);
    }

}
