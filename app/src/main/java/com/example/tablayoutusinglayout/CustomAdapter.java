package com.example.tablayoutusinglayout;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by 정인섭 on 2017-09-27.
 */

//Fragment를 사용하는 것보다 Layout을 사용하는게 나을수도 있다. Fragment는 생명주기를 신경써줘야하기 때문
/*
페이저 아답터에 프래그먼터 배열을 넘겨서 동작하게 한다.
 */
public class CustomAdapter extends PagerAdapter {

    private static final int COUNT=4;
    ArrayList<View> list = new ArrayList<>();
    Context context;
    public CustomAdapter(Context context) {
        this.context = context;
        list.add(new One(context));
        list.add(new Two(context));
        list.add(new Three(context));
        list.add(new Four(context));

    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
        //super.destroyItem(container, position, object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = list.get(position);

        container.addView(view);
        return view;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    @Override
    public int getCount() {
        return COUNT;
    }
}
