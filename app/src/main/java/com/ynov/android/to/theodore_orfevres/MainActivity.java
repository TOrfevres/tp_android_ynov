package com.ynov.android.to.theodore_orfevres;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> tabs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabs.add(getResources().getString(R.string.tab_1));
        tabs.add(getResources().getString(R.string.tab_2));
        tabs.add(getResources().getString(R.string.tab_3));
        PageAdapter adapter = new PageAdapter(getSupportFragmentManager(), tabs);

        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
