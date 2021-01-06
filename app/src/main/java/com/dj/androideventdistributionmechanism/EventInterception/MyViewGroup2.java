package com.dj.androideventdistributionmechanism.EventInterception;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.FrameLayout;

import androidx.annotation.LongDef;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyViewGroup2 extends FrameLayout {
    public MyViewGroup2(@NonNull Context context) {
        super(context);
    }

    public MyViewGroup2(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyViewGroup2(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public MyViewGroup2(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(EventInterceptionActivity.TAG, "MyViewGroup2：dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.i(EventInterceptionActivity.TAG, "MyViewGroup2：onInterceptTouchEvent");
        super.onInterceptTouchEvent(ev);
        return true; // 拦截事件，事件进入MyViewGroup2后就被拦截住了，不会再传入MyView2
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.i(EventInterceptionActivity.TAG, "MyViewGroup2：手指按下");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.i(EventInterceptionActivity.TAG, "MyViewGroup2：手指移动");
                break;
            case MotionEvent.ACTION_UP:
                Log.i(EventInterceptionActivity.TAG, "MyViewGroup2：手指抬起");
                break;
        }
        super.onTouchEvent(event);
        return true; // 由MyViewGroup2处理事件
    }
}
