package com.example.p218_intent2_subsub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.google.android.gms.dynamic.IFragmentWrapper;


public class PagerAdapter extends FragmentPagerAdapter {
    private final int PAGE_COUNT = 3;
    private String[] titles = new String[] { "➀→", "➁→", "➂" };

    PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return this.titles[position];
    }

    @Override
    public Fragment getItem(int i) {
        switch(i){
            case 0:
                return new flagment11_main();
            case 1:
                return new flagment12_main();
            default:
                return new flagment13_main();
        }
    }
}
