package com.android.anhnt.demoviewpager;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


public class MainActivity extends AppCompatActivity {

    private DemoPagerAdapter demoPagerAdapter;
    private ViewPager demoPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar =  findViewById(R.id.toolbar_demo);
        setSupportActionBar(toolbar);

        demoPagerAdapter = new DemoPagerAdapter(getSupportFragmentManager(),this);

        demoPager =  findViewById(R.id.vpg_demo);
        demoPager.setAdapter(demoPagerAdapter);

        TabLayout tabLayout =  findViewById(R.id.tab_demo);
        tabLayout.setupWithViewPager(demoPager);
    }
}
