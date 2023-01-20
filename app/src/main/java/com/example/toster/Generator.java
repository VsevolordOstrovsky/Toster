package com.example.toster;

import android.provider.ContactsContract;

public class Generator {


    public static String[] gen(){
        String[] right = {"R","R2","R'"};
        String[] left = {"L","L2","L'"};
        String[] up = {"U","U2","U'"};
        String[] doun = {"D","D2","D'"};
        String[] front = {"F","F2","F'"};
        String[] back = {"B","B2","B'"};
        String[][] wasd = {right,left,up,doun,front,back};
        String[] f = new String[12];
        int a1 = 100000;
        int j = 0;
        for(int i = 0; i < 12; i++) {
            int a = random(6, 0);
            int b = random(3, 0);
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            if (a1 == a) {
                a = random(6, 0);
            }
            a1 = a;
            f[j] = wasd[a][b];
            j++;



        }
        return f;
    }

    static int random(int max, int min){

        double x = (Math.random() * (max - min)) + min;
        int i = (int) x;
        return i;
    }



}
