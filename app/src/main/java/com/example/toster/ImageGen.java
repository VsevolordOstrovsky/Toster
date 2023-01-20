package com.example.toster;

import android.widget.ImageView;

public class ImageGen extends Generator {

    static String[][] a1 = {
            //        0   1   2   3   4   5   6   7
            /*0*/   {" "," ","W","W"," "," "," "," "},
            /*1*/   {" "," ","W","W"," "," "," "," "},
            /*2*/   {"O","O","G","G","R","R","B","B"},
            /*3*/   {"O","O","G","G","R","R","B","B"},
            /*4*/   {" "," ","Y","Y"," "," "," "," "},
            /*5*/   {" "," ","Y","Y"," "," "," "," "}
    };
    static String strok = "";
    public static void scrambl(String g){
        // UP block
        if(g == "U'"){
            for (int qweqewqwe = 0; qweqewqwe < 2; qweqewqwe++) {
                String f = a1[2][7];
                for (int i = 7; i > 0; i--) {
                    a1[2][i] = a1[2][i - 1];
                }
                a1[2][0] = f;
            }
            String[] h = new String[4];
            int x = 0;
            for(int i = 2; i<4;i++){
                h[x] = a1[0][i];
                x++;
            }
            for(int i = 1; i < 1; i++){
                h[x] = a1[i][3];
                x++;
            }
            for(int i = 3; i >1;i--){
                h[x] = a1[1][i];
                x++;
            }
            for(int i = 0;i > 0;i--){
                h[x] = a1[i][2];
                x++;
            }
            String f = h[0];
            for(int i = 0; i < 3; i++){
                h[i] = h[i+1];
            }
            h[3] = f;
            x = 0;
            for(int i = 2; i<4;i++){
                a1[0][i] = h[x];
                x++;
            }
            for(int i = 1; i < 1; i++){
                a1[i][3] = h[x];
                x++;
            }
            for(int i = 3; i >1;i--){
                a1[1][i] = h[x];
                x++;
            }
            for(int i = 0;i > 0;i--){
                a1[i][2] = h[x];
                x++;
            }



        }
        if(g == "U") {
            for (int qweqewqwe = 0; qweqewqwe < 2; qweqewqwe++) {
                String f = a1[2][0];
                for (int i = 0; i < 7; i++) {
                    a1[2][i] = a1[2][i + 1];
                }
                a1[2][7] = f;
            }
            String[] h = new String[4];
            int x = 0;
            for(int i = 2; i<4;i++){
                h[x] = a1[0][i];
                x++;
            }
            for(int i = 1; i < 1; i++){
                h[x] = a1[i][3];
                x++;
            }
            for(int i = 3; i >1;i--){
                h[x] = a1[1][i];
                x++;
            }
            for(int i = 0;i > 0;i--){
                h[x] = a1[i][2];
                x++;
            }
            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;
            x = 0;
            for(int i = 2; i<4;i++){
                a1[0][i] = h[x];
                x++;
            }
            for(int i = 1; i < 1; i++){
                a1[i][3] = h[x];
                x++;
            }
            for(int i = 3; i >1;i--){
                a1[1][i] = h[x];
                x++;
            }
            for(int i = 0;i > 0;i--){
                a1[i][2] = h[x];
                x++;
            }
        }
        if(g == "U2") {
            for (int qweqewqwe = 0; qweqewqwe < 4; qweqewqwe++) {
                String f = a1[2][0];
                for (int i = 0; i < 7; i++) {
                    a1[2][i] = a1[2][i + 1];
                }
                a1[2][7] = f;
            }
            for(int klk = 0; klk < 2; klk++) {
                String[] h = new String[4];
                int x = 0;
                for (int i = 2; i < 4; i++) {
                    h[x] = a1[0][i];
                    x++;
                }
                for (int i = 1; i < 1; i++) {
                    h[x] = a1[i][3];
                    x++;
                }
                for (int i = 3; i > 1; i--) {
                    h[x] = a1[1][i];
                    x++;
                }
                for (int i = 0; i > 0; i--) {
                    h[x] = a1[i][2];
                    x++;
                }
                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;
                x = 0;
                for (int i = 2; i < 4; i++) {
                    a1[0][i] = h[x];
                    x++;
                }
                for (int i = 1; i < 1; i++) {
                    a1[i][3] = h[x];
                    x++;
                }
                for (int i = 3; i > 1; i--) {
                    a1[1][i] = h[x];
                    x++;
                }
                for (int i = 0; i > 0; i--) {
                    a1[i][2] = h[x];
                    x++;
                }
            }
        }
        //DOWN block
        if(g == "D") {
            for (int qweqewqwe = 0; qweqewqwe < 2; qweqewqwe++) {
                String f = a1[3][7];
                for (int i = 7; i > 0; i--) {
                    a1[3][i] = a1[3][i - 1];
                }
                a1[3][0] = f;
            }
            String[] h = new String[4];
            int x = 0;
            for (int i = 2; i < 4; i++) {
                h[x] = a1[4][i];
                x++;
            }
            for (int i = 5; i < 5; i++) {
                h[x] = a1[i][3];
                x++;
            }
            for (int i = 3; i > 1; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 4; i--) {
                h[x] = a1[i][2];
                x++;
            }

            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;

            x = 0;
            for (int i = 2; i < 4; i++) {
                a1[4][i] = h[x];
                x++;
            }
            for (int i = 5; i < 5; i++) {
                a1[i][3] = h[x];
                x++;
            }
            for (int i = 3; i > 1; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 4; i--) {
                a1[i][2] = h[x];
                x++;
            }
        }
        if(g == "D'"){
            for (int qweqewqwe = 0; qweqewqwe < 2; qweqewqwe++) {
                String f = a1[3][0];
                for (int i = 0; i < 7; i++) {
                    a1[3][i] = a1[3][i + 1];
                }
                a1[3][7] = f;
            }
            String[] h = new String[4];
            int x = 0;
            for (int i = 2; i < 4; i++) {
                h[x] = a1[4][i];
                x++;
            }
            for (int i = 5; i < 5; i++) {
                h[x] = a1[i][3];
                x++;
            }
            for (int i = 3; i > 1; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 4; i--) {
                h[x] = a1[i][2];
                x++;
            }

            String f = h[0];
            for (int i = 0; i < 3; i++) {
                h[i] = h[i + 1];
            }
            h[3] = f;

            x = 0;
            for (int i = 2; i < 4; i++) {
                a1[4][i] = h[x];
                x++;
            }
            for (int i = 5; i < 5; i++) {
                a1[i][3] = h[x];
                x++;
            }
            for (int i = 3; i > 1; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 4; i--) {
                a1[i][2] = h[x];
                x++;
            }

        }
        if(g == "D2"){
            for (int qweqewqwe = 0; qweqewqwe < 4; qweqewqwe++) {
                String f = a1[3][0];
                for (int i = 0; i < 7; i++) {
                    a1[3][i] = a1[3][i + 1];
                }
                a1[3][7] = f;
            }
            for(int klk = 0; klk < 2; klk++) {
                String[] h = new String[4];
                int x = 0;
                for (int i = 2; i < 4; i++) {
                    h[x] = a1[4][i];
                    x++;
                }
                for (int i = 5; i < 5; i++) {
                    h[x] = a1[i][3];
                    x++;
                }
                for (int i = 3; i > 1; i--) {
                    h[x] = a1[5][i];
                    x++;
                }
                for (int i = 4; i > 4; i--) {
                    h[x] = a1[i][2];
                    x++;
                }

                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;

                x = 0;
                for (int i = 2; i < 4; i++) {
                    a1[4][i] = h[x];
                    x++;
                }
                for (int i = 5; i < 5; i++) {
                    a1[i][3] = h[x];
                    x++;
                }
                for (int i = 3; i > 1; i--) {
                    a1[5][i] = h[x];
                    x++;
                }
                for (int i = 4; i > 4; i--) {
                    a1[i][2] = h[x];
                    x++;
                }
            }
        }
        // RIGHT block
        if(g == "R"){

            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][3];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][6];
                p++;
            }
            for(int j = 0; j < 2; j++) {
                String as = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][6] = q[p];
                p++;
            }



            String[] h = new String[4];
            int x = 0;
            for (int i = 4; i < 6; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i > 3; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                h[x] = a1[i][4];
                x++;
            }

            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;

            x = 0;
            for (int i = 4; i < 6; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][5]  = h[x];
                x++;
            }
            for (int i = 5; i > 3; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                a1[i][4] = h[x];
                x++;
            }
        }
        if(g == "R'"){
            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][3];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][6];
                p++;
            }
            for(int j = 0; j < 2; j++) {
                String as = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][6] = q[p];
                p++;
            }



            String[] h = new String[4];
            int x = 0;
            for (int i = 4; i < 6; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i > 3; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                h[x] = a1[i][4];
                x++;
            }

            String f = h[0];
            for(int i = 0; i < 3; i++){
                h[i] = h[i+1];
            }
            h[3] = f;

            x = 0;
            for (int i = 4; i < 6; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][5]  = h[x];
                x++;
            }
            for (int i = 5; i > 3; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                a1[i][4] = h[x];
                x++;
            }
        }
        if(g == "R2"){
            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][3];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][6];
                p++;
            }
            for(int j = 0; j < 4; j++) {
                String as = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][6] = q[p];
                p++;
            }


            for(int df = 0; df < 2; df++) {
                String[] h = new String[4];
                int x = 0;
                for (int i = 4; i < 6; i++) {
                    h[x] = a1[2][i];
                    x++;
                }
                for (int i = 3; i < 3; i++) {
                    h[x] = a1[i][5];
                    x++;
                }
                for (int i = 5; i > 3; i--) {
                    h[x] = a1[3][i];
                    x++;
                }
                for (int i = 3; i > 3; i--) {
                    h[x] = a1[i][4];
                    x++;
                }

                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;

                x = 0;
                for (int i = 4; i < 6; i++) {
                    a1[2][i] = h[x];
                    x++;
                }
                for (int i = 3; i < 3; i++) {
                    a1[i][5] = h[x];
                    x++;
                }
                for (int i = 5; i > 3; i--) {
                    a1[3][i] = h[x];
                    x++;
                }
                for (int i = 3; i > 3; i--) {
                    a1[i][4] = h[x];
                    x++;
                }
            }

        }
        // LEFT block
        if(g == "L"){
            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][2];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][7];
                p++;
            }
            for(int j = 0; j < 2; j++) {
                String as = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][2] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][7] = q[p];
                p++;
            }



            String[] h = new String[4];
            int x = 0;
            for (int i = 0; i < 2; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][1];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }

            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;

            x = 0;
            for (int i = 0; i < 2; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][1] = h[x];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }
        }
        if(g == "L'"){
            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][2];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][7];
                p++;
            }
            for(int j = 0; j < 2; j++) {
                String as = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][2] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][7] = q[p];
                p++;
            }



            String[] h = new String[4];
            int x = 0;
            for (int i = 0; i < 2; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][1];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }

            String f = h[0];
            for(int i = 0; i < 3; i++){
                h[i] = h[i+1];
            }
            h[3] = f;

            x = 0;
            for (int i = 0; i < 2; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][1] = h[x];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }

        }
        if(g == "L2"){
            String[] q = new String[8];
            int p = 0;
            for (int i = 0; i < 6; i++) {
                q[p]=a1[i][2];
                p++;
            }
            for (int i = 3; i >1; i--) {
                q[p]=a1[i][7];
                p++;
            }
            for(int j = 0; j < 4; j++) {
                String as = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = as;
            }
            p = 0;
            for (int i = 0; i < 6; i++) {
                a1[i][2] = q[p];
                p++;
            }
            for (int i = 3; i > 1; i--) {
                a1[i][7] = q[p];
                p++;
            }



            String[] h = new String[4];
            int x = 0;
            for (int i = 0; i < 2; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][1];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }
            for(int gg = 0; gg < 2;gg++) {
                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;
            }

            x = 0;
            for (int i = 0; i < 2; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][1] = h[x];
                x++;
            }
            for (int i = 1; i >= 0; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 3; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }
        }
        // FRONT block
        if(g == "F"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 2; i < 4; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][3];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][2];
                x++;
            }

            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;

            x = 0;
            for (int i = 2; i < 4; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][3] = h[x];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][2] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[1][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][4];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[4][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][1];
                z++;
            }


            for(int hhh = 0; hhh <2;hhh++) {
                String d = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[1][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][4] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[4][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][1] = q[z];
                z++;
            }

        }
        if(g == "F'"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 2; i < 4; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][3];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][2];
                x++;
            }

            String f = h[0];
            for (int i = 0; i < 3; i++) {
                h[i] = h[i + 1];
            }
            h[3] = f;

            x = 0;
            for (int i = 2; i < 4; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][3] = h[x];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][2] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[1][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][4];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[4][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][1];
                z++;
            }


            for(int gg = 0;gg<2;gg++) {
                String d = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[1][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][4] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[4][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][1] = q[z];
                z++;
            }
        }
        if(g == "F2"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 2; i < 4; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][3];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][2];
                x++;
            }
            for(int dd = 0; dd<2;dd++) {
                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;
            }

            x = 0;
            for (int i = 2; i < 4; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][3] = h[x];
                x++;
            }
            for (int i = 3; i >= 2; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][2] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[1][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][4];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[4][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][1];
                z++;
            }


            for(int hhh = 0; hhh <4;hhh++) {
                String d = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[1][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][4] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[4][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][1] = q[z];
                z++;
            }
        }
        //BACK block
        if(g == "B"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 6; i < 8; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][7];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][6];
                x++;
            }

            String f = h[3];
            for(int i = 3; i > 0; i--){
                h[i] = h[i-1];
            }
            h[0] = f;

            x = 0;


            for (int i = 6; i < 8; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][7] = h[x];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][6] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[0][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][5];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[5][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][0];
                z++;
            }


            for(int hhh = 0; hhh <2;hhh++) {
                String d = q[0];
                for (int i = 0; i < 7; i++) {
                    q[i] = q[i + 1];
                }
                q[7] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[0][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][5] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[5][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][0] = q[z];
                z++;
            }

        }
        if(g == "B'"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 6; i < 8; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][7];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][6];
                x++;
            }

            String f = h[0];
            for(int i = 0; i < 3; i++){
                h[i] = h[i+1];
            }
            h[3] = f;

            x = 0;


            for (int i = 6; i < 8; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][7] = h[x];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][6] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[0][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][5];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[5][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][0];
                z++;
            }


            for(int hhh = 0; hhh <2;hhh++) {
                String d = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[0][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][5] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[5][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][0] = q[z];
                z++;
            }
        }
        if(g == "B2"){
            String[] h = new String[4];
            int x = 0;
            for (int i = 6; i < 8; i++) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                h[x] = a1[i][7];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                h[x] = a1[i][6];
                x++;
            }
            for(int gg = 0;gg < 2; gg++) {
                String f = h[0];
                for (int i = 0; i < 3; i++) {
                    h[i] = h[i + 1];
                }
                h[3] = f;
            }

            x = 0;


            for (int i = 6; i < 8; i++) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 3; i < 3; i++) {
                a1[i][7] = h[x];
                x++;
            }
            for (int i = 7; i >= 6; i--) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 2; i > 2; i--) {
                a1[i][6] = h[x];
                x++;
            }


            String[] q = new String[8];
            int z = 0;
            for(int i = 2; i < 4; i++){
                q[z] = a1[0][i];
                z++;
            }
            for(int i = 2;i < 4; i++){
                q[z] = a1[i][5];
                z++;
            }
            for(int i = 3; i >=2;i--){
                q[z] = a1[5][i];
                z++;
            }
            for(int i = 3;i >=2;i--){
                q[z] = a1[i][0];
                z++;
            }


            for(int hhh = 0; hhh <4;hhh++) {
                String d = q[7];
                for (int i = 7; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }

            z = 0;
            for(int i = 2; i < 4; i++){
                a1[0][i] = q[z];
                z++;
            }
            for(int i = 2;i < 4; i++){
                a1[i][5] = q[z];
                z++;
            }
            for(int i = 3; i >=2;i--){
                a1[5][i] = q[z];
                z++;
            }
            for(int i = 3;i >=2;i--){
                a1[i][0] = q[z];
                z++;
            }

        }

    }
    public static void main(){


        String[] d = gen();
        for(int i = 0; i < d.length;i++){
            scrambl(d[i]);
        }
        for(int i = 0; i < d.length;i++){
            if(i == d.length-1){
                strok += d[i];
            }else{
                strok += d[i]+" ";
            }
        }

    }
}
