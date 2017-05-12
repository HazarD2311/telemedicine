package com.example.hazard.telemedicine.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.hazard.telemedicine.Const;
import com.example.hazard.telemedicine.fragment.ExampleFragment;

public class TabPagerFragmentAdapter extends FragmentPagerAdapter {

    private String[] tabs;

    public TabPagerFragmentAdapter(FragmentManager fm) {
        super(fm);
        tabs = new String[] {
                Const.PROFILE_TAB_NAME,
                Const.APPEAL_TAB_NAME,
                Const.MESSAGES_TAB_NAME
        };
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case Const.PROFILE_TAB:
                return ExampleFragment.getInstance();
            case Const.APPEAL_TAB:
                return ExampleFragment.getInstance();
            case Const.MESSAGES_TAB:
                return ExampleFragment.getInstance();
        }
        return null;
    }

    @Override
    public int getCount() {
        return Const.COUNT_OF_TABS;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs[position];
    }
}