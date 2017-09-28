package com.example.tablayoutusinglayout;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by 정인섭 on 2017-09-28.
 */

public class Two extends FrameLayout {

    public Two(Context context) {
        super(context);
        initView();
    }

    public Two(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
    //내가 만든 레이아웃을 inflate하고
    //나 자신에게 add한다.
    private void initView(){
        // 1. 레이아웃파일로 뷰를 만들고
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_second, null);

        addView(view);
    }
}
