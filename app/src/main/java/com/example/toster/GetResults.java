package com.example.toster;

import java.util.HashMap;
import java.util.Map;

public class GetResults {
    public static Map<String,Integer> map = new HashMap<>();
    public static void getRes(String name, String time){

        int milsec = 0, sec = 0, min = 0;
        int finishMilSec = 0;
        String[] parts = time.split(":");
        milsec = Integer.parseInt(parts[2]);
        sec = Integer.parseInt(parts[1]);
        min = Integer.parseInt(parts[0]);
        finishMilSec = milsec*1+sec*100+min*6000;
        if(map.get(name) == null){
            map.put(name,finishMilSec);
        }else{
            map.put(name,finishMilSec+ map.get(name));
        }


    }

    public String sredPer(String name, Integer milsec){
        milsec = milsec/3;
        int min = milsec / 6000;
        int sec = (milsec%6000) / 100;
        milsec = milsec%100;
        return String.format("%s %2$02d:%3$02d:%4$02d",name,min,sec,milsec);
    }
}
