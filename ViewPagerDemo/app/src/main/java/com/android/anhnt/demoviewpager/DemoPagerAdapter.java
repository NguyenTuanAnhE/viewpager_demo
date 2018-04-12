package com.android.anhnt.demoviewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by hihi on 4/12/2018.
 */

public class DemoPagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public DemoPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return DemoFragment.getInstance(position);
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public float getPageWidth(int position) {
        return 0.9f;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.title_page_cyan);

            case 1:
                return context.getString(R.string.title_page_pink);

            case 2:
                return context.getString(R.string.title_page_yellow);

            default:
                return super.getPageTitle(position);

        }
    }
}
