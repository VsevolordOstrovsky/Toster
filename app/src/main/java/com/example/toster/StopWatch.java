package com.example.toster;

import android.widget.TextView;

import java.util.concurrent.TimeUnit;

public class StopWatch{
    public boolean flag = false;
    long mill = 0;
    long sec = 0;
    long min = 0;
    public void time(){
        cubeFragment cubeFragment = new cubeFragment();
        short millisecondsToSleep = 1;

//
        long nano = 0;

        while(flag) {
            try {
                TimeUnit.MILLISECONDS.sleep(millisecondsToSleep);
                nano = System.nanoTime();
                textStop(nano);

            } catch (InterruptedException ie) {
                Thread.currentThread().interrupt();
            }

            }
            System.out.println(min + ":" + sec + ":" + mill);
        }
        public void textStop(long nanoTime){
        mill = nanoTime%1000;
        sec = mill/1000;
        min = sec/60;
    }
}

