package com.fivenodes.ecommerce.adapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.fivenodes.ecommerce.R;
import com.fivenodes.ecommerce.fragment.SwipeTabFragment;

public class InformationAdapter extends FragmentPagerAdapter {

    public InformationAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {
        Bundle bundle = new Bundle();
        int imgResId = 0;
        int tab = 0;
        int colorResId = 0;
        switch (index) {
            case 0:
            	tab = R.string.information_tab1;
                break;
            case 1:
            	tab = R.string.information_tab2;
                break;
            case 2:
            	tab = R.string.information_tab3;
                break;
        }
        bundle.putInt("image", imgResId);
        bundle.putInt("tab",tab);
        bundle.putInt("color", colorResId);
        SwipeTabFragment swipeTabFragment = new SwipeTabFragment();
        swipeTabFragment.setArguments(bundle);
        return swipeTabFragment;
    }

    @Override
    public int getCount() {
        return 3;
    }
}