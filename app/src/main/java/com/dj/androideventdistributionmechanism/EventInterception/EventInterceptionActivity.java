package com.dj.androideventdistributionmechanism.EventInterception;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.dj.androideventdistributionmechanism.R;

public class EventInterceptionActivity extends AppCompatActivity {

    public static final String TAG = "EventInterception";

    /**
     * 拦截后，MyView2中的dispatchTouchEvent方法和onTouchEvent方法都不会被调用到
     *  事件在MyViewGroup2中的onTouchEvent方法中进行了处理
     *  处理完后，return true，下次还会传回MyViewGroup2中进行处理
     *
     * EventInterceptionActivity: dispatchTouchEvent
     * MyViewGroup2：dispatchTouchEvent
     * MyViewGroup2：onInterceptTouchEvent
     * MyViewGroup2：手指按下
     * EventInterceptionActivity: dispatchTouchEvent
     * MyViewGroup2：dispatchTouchEvent
     * MyViewGroup2：手指移动
     * EventInterceptionActivity: dispatchTouchEvent
     * MyViewGroup2：dispatchTouchEvent
     * MyViewGroup2：手指移动
     * EventInterceptionActivity: dispatchTouchEvent
     * MyViewGroup2：dispatchTouchEvent
     * MyViewGroup2：手指移动
     * EventInterceptionActivity: dispatchTouchEvent
     * MyViewGroup2：dispatchTouchEvent
     * MyViewGroup2：手指抬起
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_interception);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "EventInterceptionActivity: dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "EventInterceptionActivity: onTouchEvent");
        return super.onTouchEvent(event);
    }
}