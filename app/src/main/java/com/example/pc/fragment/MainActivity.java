package com.example.pc.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ViewPager vp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<Fragment> fragments=new ArrayList<Fragment>();
        fragments.add(new Fragment1());
        fragments.add(new Fragment2());
        fragments.add(new Fragment3());
        fragments.add(new Fragment4());
        FragAdapter adapter = new FragAdapter(getSupportFragmentManager(), fragments);
        vp = (ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(adapter);
    }
    public void choose1(View view){
        vp.setCurrentItem(0);
    }
    public void choose2(View view){
        vp.setCurrentItem(1);
    }
    public void choose3(View view){
        vp.setCurrentItem(2);
    }
    public void choose4(){
        vp.setCurrentItem(3);
    }
}
