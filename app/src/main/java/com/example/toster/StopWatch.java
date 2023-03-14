package com.example.toster;

import android.widget.TextView;

public class StopWatch extends cubeFragment{
    public static void time(){

    }
}
class MyThread extends Thread{
    long millisecond = 0;
    long second = 0;
    long minute = 0;
    long hour = 0;
    String disp = "";




    public void run(boolean on)
    {

        // while the stopwatch is on
        while (on) {
            try {
                // pause 1 millisecond
                Thread.sleep(1);
                // update the time
                update();
                // changeLabel
                changeLabel();
            }
            catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
    public void update(){
        millisecond++;
        if(millisecond == 1000){
            millisecond = 0;
            second++;
            if (second == 60){
                second = 0;
                minute++;
            }
        }

    }
    public void changeLabel()
    {

        // Properly formatting the display of the timer
        if (hour < 10)
            disp = "0" + hour + " : ";
        else
            disp = hour + " : ";

        if (minute < 10)
            disp += "0" + minute + " : ";
        else
            disp += minute + " : ";

        if (second < 10)
            disp += "0" + second + " : ";
        else
            disp += second + " : ";

        if (millisecond < 10)
            disp += "00" + millisecond;
        else if (millisecond < 100)
            disp += "0" + millisecond;
        else
            disp += millisecond;


    }
}
