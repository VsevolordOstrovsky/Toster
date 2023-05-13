package com.example.toster;

public class ImageGenThree extends Generator{
    static String[][] a1 = {
            //        0     1     2     3     4     5     6      7     8    9     10    11
            /*0*/   {" ", " ", " ", "W", "W", "W", " ", " ", " ", " ", " ", " "},
            /*1*/   {" ", " ", " ", "W", "W", "W", " ", " ", " ", " ", " ", " "},
            /*2*/   {" ", " ", " ", "W", "W", "W", " ", " ", " ", " ", " ", " "},
            /*3*/   {"O", "O", "O", "G", "G", "G", "R", "R", "R", "B", "B", "B"},
            /*4*/   {"O", "O", "O", "G", "G", "G", "R", "R", "R", "B", "B", "B"},
            /*5*/   {"O", "O", "O", "G", "G", "G", "R", "R", "R", "B", "B", "B"},
            /*6*/   {" ", " ", " ", "Y", "Y", "Y", " ", " ", " ", " ", " ", " "},
            /*7*/   {" ", " ", " ", "Y", "Y", "Y", " ", " ", " ", " ", " ", " "},
            /*8*/   {" ", " ", " ", "Y", "Y", "Y", " ", " ", " ", " ", " ", " "}
    };
    public static String strok = "";
    public static void scrambl(String g) {
        // UP block
        if (g == "U'") {
            for (int qweqewqwe = 0; qweqewqwe < 3; qweqewqwe++) {
                String f = a1[3][11];
                for (int i = 11; i > 0; i--) {
                    a1[3][i] = a1[3][i - 1];
                }
                a1[3][0] = f;
            }
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[0][i];
                x++;
            }
            for (int i = 1; i < 3; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 4; i > 2; i--) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 1; i > 0; i--) {
                h[x] = a1[i][3];
                x++;
            }
            // перемещает
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < h.length - 1; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }
            //назначает заного
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[0][i] = h[x];
                x++;
            }
            for (int i = 1; i < 3; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 4; i > 2; i--) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 1; i > 0; i--) {
                a1[i][3] = h[x];
                x++;
            }


        }
        if (g == "U") {
            for (int qweqewqwe = 0; qweqewqwe < 3; qweqewqwe++) {
                String f = a1[3][0];
                for (int i = 0; i < 11; i++) {
                    a1[3][i] = a1[3][i + 1];
                }
                a1[3][11] = f;
            }
            // считывание
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[0][i];
                x++;
            }
            for (int i = 1; i < 3; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 4; i > 2; i--) {
                h[x] = a1[2][i];
                x++;
            }
            for (int i = 1; i > 0; i--) {
                h[x] = a1[i][3];
                x++;
            }
            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }
            // назначение заного
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[0][i] = h[x];
                x++;
            }
            for (int i = 1; i < 3; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 4; i > 2; i--) {
                a1[2][i] = h[x];
                x++;
            }
            for (int i = 1; i > 0; i--) {
                a1[i][3] = h[x];
                x++;
            }
        }
        if (g == "U2") {
            for (int qweqewqwe = 0; qweqewqwe < 6; qweqewqwe++) {
                String f = a1[3][0];
                for (int i = 0; i < 11; i++) {
                    a1[3][i] = a1[3][i + 1];
                }
                a1[3][11] = f;
            }
            for (int klk = 0; klk < 2; klk++) {
                String[] h = new String[8];
                int x = 0;
                for (int i = 3; i < 6; i++) {
                    h[x] = a1[0][i];
                    x++;
                }
                for (int i = 1; i < 3; i++) {
                    h[x] = a1[i][5];
                    x++;
                }
                for (int i = 4; i > 2; i--) {
                    h[x] = a1[2][i];
                    x++;
                }
                for (int i = 1; i > 0; i--) {
                    h[x] = a1[i][3];
                    x++;
                }
                // перемещение
                for (int kkk = 0; kkk < 2; kkk++) {
                    String f = h[7];
                    for (int i = 7; i > 0; i--) {
                        h[i] = h[i - 1];
                    }
                    h[0] = f;
                }
                // назначение заного
                x = 0;
                for (int i = 3; i < 6; i++) {
                    a1[0][i] = h[x];
                    x++;
                }
                for (int i = 1; i < 3; i++) {
                    a1[i][5] = h[x];
                    x++;
                }
                for (int i = 4; i > 2; i--) {
                    a1[2][i] = h[x];
                    x++;
                }
                for (int i = 1; i > 0; i--) {
                    a1[i][3] = h[x];
                    x++;
                }
            }
        }
        //DOWN block
        if (g == "D'") {
            for (int qweqewqwe = 0; qweqewqwe < 3; qweqewqwe++) {
                String f = a1[5][0];
                for (int i = 0; i < 11; i++) {
                    a1[5][i] = a1[5][i + 1];
                }
                a1[5][11] = f;
            }

            // считывание
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[6][i];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                h[x] = a1[8][i];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                h[x] = a1[i][3];
                x++;
            }
            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }
            // назначение заного
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[6][i] = h[x];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                a1[8][i] = h[x];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                a1[i][3] = h[x];
                x++;
            }
        }
        if (g == "D") {

            for (int qweqewqwe = 0; qweqewqwe < 3; qweqewqwe++) {
                String f = a1[5][11];
                for (int i = 11; i > 0; i--) {
                    a1[5][i] = a1[5][i - 1];
                }
                a1[5][0] = f;
            }
            // считывание
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[6][i];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                h[x] = a1[8][i];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                h[x] = a1[i][3];
                x++;
            }

            // перемещение

            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }

            // назначение заного
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[6][i] = h[x];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                a1[8][i] = h[x];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                a1[i][3] = h[x];
                x++;
            }

        }
        if (g == "D2") {
            for (int qweqewqwe = 0; qweqewqwe < 6; qweqewqwe++) {
                String f = a1[5][0];
                for (int i = 0; i < 11; i++) {
                    a1[5][i] = a1[5][i + 1];
                }
                a1[5][11] = f;
            }
            // считывание
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[6][i];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                h[x] = a1[8][i];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                h[x] = a1[i][3];
                x++;
            }
            for (int kkk = 0; kkk < 4; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }

            // назначение заного
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[6][i] = h[x];
                x++;
            }
            for (int i = 7; i < 8; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i > 2; i--) {
                a1[8][i] = h[x];
                x++;
            }
            for (int i = 7; i > 6; i--) {
                a1[i][3] = h[x];
                x++;
            }

        }
        // RIGHT block
        if (g == "R") {
            // считывание
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][5];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][9];
                p++;
            }
            // перемещение
            for (int j = 0; j < 3; j++) {
                String as = q[0];
                for (int i = 0; i < 11; i++) {
                    q[i] = q[i + 1];
                }
                q[11] = as;
            }
            //назначение
            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][5] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][9] = q[p];
                p++;
            }


            // считывание грани
            String[] h = new String[8];
            int x = 0;
            for (int i = 6; i < 9; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][8];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][6];
                x++;
            }
            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }
            //назначение грани
            x = 0;
            for (int i = 6; i < 9; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][8] = h[x];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][6] = h[x];
                x++;
            }
        }
        if (g == "R'") {
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][5];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][9];
                p++;
            }

            for (int j = 0; j < 3; j++) {
                String as = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }

            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][5] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][9] = q[p];
                p++;
            }


            String[] h = new String[8];
            int x = 0;
            for (int i = 6; i < 9; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][8];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][6];
                x++;
            }

            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }
            x = 0;
            for (int i = 6; i < 9; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][8] = h[x];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][6] = h[x];
                x++;
            }
        }
        if (g == "R2") {
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][5];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][9];
                p++;
            }
            for (int j = 0; j < 6; j++) {
                String as = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }
            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][5] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][9] = q[p];
                p++;
            }


            String[] h = new String[8];
            int x = 0;
            for (int i = 6; i < 9; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][8];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][6];
                x++;
            }

            for (int kkk = 0; kkk < 4; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }

            x = 0;
            for (int i = 6; i < 9; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][8] = h[x];
                x++;
            }
            for (int i = 8; i > 5; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][6] = h[x];
                x++;
            }


        }
        // LEFT block
        if (g == "L") {
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][3];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][11];
                p++;
            }

            for (int j = 0; j < 3; j++) {
                String as = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = as;
            }
            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][11] = q[p];
                p++;
            }


            String[] h = new String[8];
            int x = 0;
            for (int i = 0; i < 3; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][2];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }

            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }

            x = 0;
            for (int i = 0; i < 3; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][2] = h[x];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }
        }
        if (g == "L'") {
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][3];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][11];
                p++;
            }
            for (int j = 0; j < 3; j++) {
                String as = q[0];
                for (int i = 0; i < 11; i++) {
                    q[i] = q[i + 1];
                }
                q[11] = as;
            }
            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][11] = q[p];
                p++;
            }


            String[] h = new String[8];
            int x = 0;
            for (int i = 0; i < 3; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][2];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }
            x = 0;
            for (int i = 0; i < 3; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][2] = h[x];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }

        }
        if (g == "L2") {
            String[] q = new String[12];
            int p = 0;
            for (int i = 0; i < 9; i++) {
                q[p] = a1[i][3];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                q[p] = a1[i][11];
                p++;
            }
            for (int j = 0; j < 6; j++) {
                String as = q[0];
                for (int i = 0; i < 11; i++) {
                    q[i] = q[i + 1];
                }
                q[11] = as;
            }
            p = 0;
            for (int i = 0; i < 9; i++) {
                a1[i][3] = q[p];
                p++;
            }
            for (int i = 5; i > 2; i--) {
                a1[i][11] = q[p];
                p++;
            }


            String[] h = new String[8];
            int x = 0;
            for (int i = 0; i < 3; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][2];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][0];
                x++;
            }
            for (int kkk = 0; kkk < 4; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }
            x = 0;
            for (int i = 0; i < 3; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][2] = h[x];
                x++;
            }
            for (int i = 2; i >= 0; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][0] = h[x];
                x++;
            }
        }
        // FRONT block
        if (g == "F") {
            // получение плоскости
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][3];
                x++;
            }
            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }
            // назначение плоскости
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][3] = h[x];
                x++;
            }

            // получение ребер
            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[2][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][6];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[6][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][2];
                z++;
            }

            //перемещение
            for (int hhh = 0; hhh < 3; hhh++) {
                String d = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }
            //назначение ребер
            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[2][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][6] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[6][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][2] = q[z];
                z++;
            }

        }
        if (g == "F'") {
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][3];
                x++;
            }
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }

            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][3] = h[x];
                x++;
            }


            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[2][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][6];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[6][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][2];
                z++;
            }


            for (int gg = 0; gg < 3; gg++) {
                String d = q[0];
                for (int i = 0; i < 11; i++) {
                    q[i] = q[i + 1];
                }
                q[11] = d;
            }

            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[2][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][6] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[6][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][2] = q[z];
                z++;
            }
        }
        if (g == "F2") {
            String[] h = new String[8];
            int x = 0;
            for (int i = 3; i < 6; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][5];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][3];
                x++;
            }
            // перемещение
            for (int kkk = 0; kkk < 4; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }
            // назначение плоскости
            x = 0;
            for (int i = 3; i < 6; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][5] = h[x];
                x++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][3] = h[x];
                x++;
            }

            // получение ребер
            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[2][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][6];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[6][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][2];
                z++;
            }

            //перемещение
            for (int hhh = 0; hhh < 6; hhh++) {
                String d = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }
            //назначение ребер
            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[2][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][6] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[6][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][2] = q[z];
                z++;
            }
        }
        //BACK block
        if (g == "B") {
            // получение плоскости
            String[] h = new String[8];
            int x = 0;
            for (int i = 9; i < 12; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][11];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][9];
                x++;
            }

            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[7];
                for (int i = 7; i > 0; i--) {
                    h[i] = h[i - 1];
                }
                h[0] = f;
            }
            // назначение плоскости
            x = 0;
            for (int i = 9; i < 12; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][11] = h[x];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][9] = h[x];
                x++;
            }

            // получение граний
            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[0][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][8];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[8][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][0];
                z++;
            }

            // перемещение
            for (int hhh = 0; hhh < 3; hhh++) {
                String d = q[0];
                for (int i = 0; i < 11; i++) {
                    q[i] = q[i + 1];
                }
                q[11] = d;
            }
            // назначение граний
            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[0][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][8] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[8][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][0] = q[z];
                z++;
            }

        }
        if (g == "B'") {
            // получение плоскости
            String[] h = new String[8];
            int x = 0;
            for (int i = 9; i < 12; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][11];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][9];
                x++;
            }

            // перемещение
            for (int kkk = 0; kkk < 2; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }

            // назначение плоскости
            x = 0;
            for (int i = 9; i < 12; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][11] = h[x];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][9] = h[x];
                x++;
            }

            // получение граний
            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[0][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][8];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[8][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][0];
                z++;
            }

            // перемещение
            for (int hhh = 0; hhh < 3; hhh++) {
                String d = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }

            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[0][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][8] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[8][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][0] = q[z];
                z++;
            }
        }
        if (g == "B2") {
            // получение плоскости
            String[] h = new String[8];
            int x = 0;
            for (int i = 9; i < 12; i++) {
                h[x] = a1[3][i];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                h[x] = a1[i][11];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                h[x] = a1[5][i];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                h[x] = a1[i][9];
                x++;
            }

            // перемещение
            for (int kkk = 0; kkk < 4; kkk++) {
                String f = h[0];
                for (int i = 0; i < 7; i++) {
                    h[i] = h[i + 1];
                }
                h[7] = f;
            }

            // назначение плоскости
            x = 0;
            for (int i = 9; i < 12; i++) {
                a1[3][i] = h[x];
                x++;
            }
            for (int i = 4; i < 5; i++) {
                a1[i][11] = h[x];
                x++;
            }
            for (int i = 11; i >= 9; i--) {
                a1[5][i] = h[x];
                x++;
            }
            for (int i = 4; i > 3; i--) {
                a1[i][9] = h[x];
                x++;
            }

            // получение граний
            String[] q = new String[12];
            int z = 0;
            for (int i = 3; i < 6; i++) {
                q[z] = a1[0][i];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                q[z] = a1[i][8];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[8][i];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                q[z] = a1[i][0];
                z++;
            }

            // перемещение
            for (int hhh = 0; hhh < 6; hhh++) {
                String d = q[11];
                for (int i = 11; i > 0; i--) {
                    q[i] = q[i - 1];
                }
                q[0] = d;
            }

            z = 0;
            for (int i = 3; i < 6; i++) {
                a1[0][i] = q[z];
                z++;
            }
            for (int i = 3; i < 6; i++) {
                a1[i][8] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[8][i] = q[z];
                z++;
            }
            for (int i = 5; i >= 3; i--) {
                a1[i][0] = q[z];
                z++;
            }

        }
    }
    public static void main(String[] d){



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
