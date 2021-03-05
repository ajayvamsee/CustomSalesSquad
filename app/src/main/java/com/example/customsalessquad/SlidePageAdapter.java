package com.example.customsalessquad;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.List;

public class SlidePageAdapter  extends FragmentStatePagerAdapter {

    List<Fragment> fragmentList;
    public SlidePageAdapter(FragmentManager fragmentManager,List<Fragment> fragmentList) {
        super(fragmentManager);
        this.fragmentList=fragmentList;
    }



    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
