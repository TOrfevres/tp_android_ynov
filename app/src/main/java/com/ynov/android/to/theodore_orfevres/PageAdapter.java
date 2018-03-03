package com.ynov.android.to.theodore_orfevres;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.ynov.android.to.theodore_orfevres.bean.Contact;

import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {
    private FragmentManager fragmentManager = null;

    private List<String> tabs = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    PageAdapter(FragmentManager fm, List<String> tabs, List<Contact> contacts) {
        super(fm);
        this.fragmentManager = fm;
        this.tabs.addAll(tabs);
        this.contacts.addAll(contacts);
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return tabs.get(position);
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();

        // TODO Wtf is going on with parceler ?

        switch (position) {
            case 0:
//                bundle.putParcelableArrayList("talk_list", contacts);
                TalkPageFragment tFragment = new TalkPageFragment();
//                tFragment.setArguments(bundle);
                return tFragment;

            case 1:
//                bundle.putParcelableArrayList("contact_list", contacts);
                ContactPageFragment cFragment = new ContactPageFragment();
//                cFragment.setArguments(bundle);
                return cFragment;

            default:
                return new AccountPageFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }
}
