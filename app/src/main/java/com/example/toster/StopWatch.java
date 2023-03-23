package com.example.toster;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.concurrent.TimeUnit;

public class StopWatch extends AppCompatActivity {
    public int seconds = 0;

    // Is the stopwatch running?

    public boolean running;
    public boolean flag;

    public TextView sw;
    public boolean wasRunning;
    TextView timeView;


    @Override

    public void onSaveInstanceState(
            Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState
                .putInt("seconds", seconds);
        savedInstanceState
                .putBoolean("running", running);
        savedInstanceState
                .putBoolean("wasRunning", wasRunning);

    }
    protected void onPause()
    {
        super.onPause();
        wasRunning = running;
        running = false;
    }
    @Override

    protected void onResume()
    {
        super.onResume();
        if (wasRunning) {
            running = true;
        }
    }
    //Start /Stop

//    public void onClickReset(View view)
//    {
//        running = false;
//        seconds = 0;
//    }

    public void runTimer() {

        final Handler handler = new Handler();

        handler.post(new Runnable() {

            @Override
            public void run()
            {

                int minutes = (seconds  % 360000) /6000;  //int minutes = (seconds%3600)/60;
                int secs = (seconds%6000) /100;
                int msecs = seconds%100;

                @SuppressLint("DefaultLocale") String time = String.format("%02d:%02d:%02d",
                        minutes, secs, msecs);
                timeView.setText(time);
                if (running) {
                    seconds++;
                }
                handler.postDelayed(this,1);
//                if (flag == false) {System.out.println(String.valueOf(sw.getText()));
//                    flag = true;
//                }

            }

        });

    }

}

