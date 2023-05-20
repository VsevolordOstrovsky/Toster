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
        finishMilSec = milsec*10+sec*1000+min*60000;
        if(map.get(name) == null){
            map.put(name,finishMilSec);
        }else{
            map.put(name,finishMilSec+ map.get(name));
        }


    }
}
