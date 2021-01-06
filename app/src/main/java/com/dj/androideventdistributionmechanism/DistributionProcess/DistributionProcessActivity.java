package com.dj.androideventdistributionmechanism.DistributionProcess;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

import com.dj.androideventdistributionmechanism.R;

public class DistributionProcessActivity extends AppCompatActivity {
    public static final String TAG = "DistributionProcess";

    /**
     * 真实的传递流程
     * MainActivity: dispatchTouchEvent
     * MyViewGroup: dispatchTouchEvent
     * MyViewGroup: onInterceptTouchEvent
     * MyView: dispatchTouchEvent
     * MyView: onTouchEvent
     * MyViewGroup: onTouchEvent
     * MainActivity: onTouchEvent
     *
     * MainActivity: dispatchTouchEvent
     * MainActivity: onTouchEvent
     * MainActivity: dispatchTouchEvent
     * MainActivity: onTouchEvent
     * MainActivity: dispatchTouchEvent
     * MainActivity: onTouchEvent
     * MainActivity: dispatchTouchEvent
     * MainActivity: onTouchEvent
     * MainActivity: dispatchTouchEvent
     * MainActivity: onTouchEvent
     * MainActivity: dispatchTouchEvent
     * ...
     *
     * 同一个事件序列，如果子View（或ViewGroup）没有处理该事件（没有消费事件），那么后续事件就不会再传递到子View中。
     * 会在MainActivity：dispatchTouchEvent和MainActivity：onTouchEvent之间传递
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribution_process);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.d(TAG, "MainActivity: dispatchTouchEvent");
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.d(TAG, "MainActivity: onTouchEvent");
        return super.onTouchEvent(event);
    }
}