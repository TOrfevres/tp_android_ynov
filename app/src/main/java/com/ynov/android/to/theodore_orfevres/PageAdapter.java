package com.ynov.android.to.theodore_orfevres;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {
    private List<String> tabs = new ArrayList<>();

    PageAdapter(FragmentManager fm, List<String> tabs) {
        super(fm);
        this.tabs.addAll(tabs);
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new TalkPageFragment();

            case 1:
                return new ContactPageFragment();

            default:
                return new AccountPageFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
