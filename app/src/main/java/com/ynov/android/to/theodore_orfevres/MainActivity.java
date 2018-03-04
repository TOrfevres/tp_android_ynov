package com.ynov.android.to.theodore_orfevres;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;

import com.ynov.android.to.theodore_orfevres.bean.Contact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> tabs = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        createData();
        pagerInit();
    }

    private void pagerInit() {
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabs, contacts);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void createData() {
        // Create Tabs names
        tabs.add(getResources().getString(R.string.tab_1));
        tabs.add(getResources().getString(R.string.tab_2));
        tabs.add(getResources().getString(R.string.tab_3));

        // Create contacts
        for (int i = 0; i < 15;i++) {
            List<String> talks = new ArrayList<>();
            talks.add(getResources().getString(R.string.user_details_1));
            talks.add(getResources().getString(R.string.user_details_2) + " " + (i+1));
            talks.add(getResources().getString(R.string.user_details_3));
            Collections.shuffle(talks);

            contacts.add(new Contact(
                    getResources().getString(R.string.user_name),
                    talks
            ));
        }
    }
}
