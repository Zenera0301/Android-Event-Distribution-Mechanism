package com.dj.androideventdistributionmechanism.Cancel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.dj.androideventdistributionmechanism.R;

public class CancelActivity extends AppCompatActivity {
    public static final String TAG = "Cancel";

    /**
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:0                   0对应DOWN事件
     * MyButton: onTouchEvent:0
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:2                   2对应的MOVE事件
     * MyButton: onTouchEvent:2
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:2
     * MyButton: onTouchEvent:2
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:2
     * MyButton: onTouchEvent:2
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:2
     * MyButton: onTouchEvent:2
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:false
     * MyButton: dispatchTouchEvent:2
     * MyButton: onTouchEvent:2
     * CancelActivity: dispatchTouchEvent
     * MyScrollView: onInterceptTouchEvent:true         返回为true，表明当前事件被MyScrollView拦截了
     * MyButton: dispatchTouchEvent:3                   3对应的CANCEL事件
     * MyButton: onTouchEvent:3
     * CancelActivity: dispatchTouchEvent
     * CancelActivity: dispatchTouchEvent
     * CancelActivity: dispatchTouchEvent
     * CancelActivity: dispatchTouchEvent
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cancel);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "CancelActivity: dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "CancelActivity: onTouchEvent");
        return super.onTouchEvent(event);
    }
}