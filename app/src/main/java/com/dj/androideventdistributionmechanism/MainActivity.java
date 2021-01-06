package com.dj.androideventdistributionmechanism;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

import com.dj.androideventdistributionmechanism.Cancel.CancelActivity;
import com.dj.androideventdistributionmechanism.DistributionProcess.DistributionProcessActivity;
import com.dj.androideventdistributionmechanism.EventInterception.EventInterceptionActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button_distributionprocess).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DistributionProcessActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_cancel).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CancelActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_eventinterception).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventInterceptionActivity.class);
                startActivity(intent);
            }
        });
    }


}