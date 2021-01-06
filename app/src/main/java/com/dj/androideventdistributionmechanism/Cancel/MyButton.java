package com.dj.androideventdistributionmechanism.Cancel;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.Button;

import com.dj.androideventdistributionmechanism.DistributionProcess.DistributionProcessActivity;
import com.dj.androideventdistributionmechanism.MainActivity;

public class MyButton extends androidx.appcompat.widget.AppCompatButton {
    public MyButton(Context context) {
        super(context);
    }

    public MyButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Log.d(CancelActivity.TAG, "MyButton: dispatchTouchEvent:"+event.getAction());
        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        // event.getAction()==3 表明是个取消事件
        Log.d(CancelActivity.TAG, "MyButton: onTouchEvent:"+event.getAction());
        return super.onTouchEvent(event);
    }

}
