package com.example.tablayoutusinglayout;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTabLayout();
        setViewPager();

    }

    private void setViewPager(){
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        //List<Fragment> list = new ArrayList<>();
//        list.add(new One(this));
//        list.add(new Two(this));
//        list.add(new Three());
//        list.add(new Four());
        CustomAdapter adapter = new CustomAdapter(this);
        viewPager.setAdapter(adapter);
        setListner();
    }

    private void setListner() {
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(viewPager));
        // ViewPager의 변경사항을 탭레이아웃에 전달
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    private void setTabLayout(){
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.addTab(tabLayout.newTab().setText("One"));
        tabLayout.addTab(tabLayout.newTab().setText("Two"));
        tabLayout.addTab(tabLayout.newTab().setText("Three"));
        tabLayout.addTab(tabLayout.newTab().setText("Four"));
//        tabLayout.addTab(tabLayout.newTab().setText("Five"));
        //탭레이아웃을 뷰페이저에 연결


    }
}
