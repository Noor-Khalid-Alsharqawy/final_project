package com.example.tabanna;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tabanna.Fragments.announce;
import com.example.tabanna.Fragments.browse;
import com.example.tabanna.Fragments.my_announcements;
import com.example.tabanna.Fragments.my_pets;

public class FragmentAdapter extends FragmentPagerAdapter {

    public FragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: return new browse();
            case 1: return new announce();
            case 2: return new my_pets();
            case 3: return new my_announcements();
        }
        return null;
    }

    @Override
    public int getCount() { return 4; }
}
