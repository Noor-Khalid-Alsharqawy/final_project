package com.example.tabanna;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager showActivities= findViewById(R.id.view);
        TabLayout activities= findViewById(R.id.tabs);

        activities.setupWithViewPager(showActivities);

        FragmentAdapter adapter= new FragmentAdapter(getSupportFragmentManager());
        showActivities.setAdapter(adapter);

        activities.getTabAt(0).setIcon(R.drawable.browse);
        activities.getTabAt(1).setIcon(R.drawable.announce);
        activities.getTabAt(2).setIcon(R.drawable.reserved);
        activities.getTabAt(3).setIcon(R.drawable.ads);


    }
}