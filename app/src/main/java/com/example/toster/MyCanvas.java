package com.example.toster;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class MyCanvas extends View{
    ImageGen imageGen = new ImageGen();
    Generator generator = new Generator();

    private int width = 160;
    public int height = 120;
    public int[] color = {/*orange*/Color.argb(255,255,165,0),Color.GREEN,Color.RED,Color.BLUE,Color.WHITE,Color.YELLOW};
    int specColor = Color.argb(0,0,0,0);
    public static int key_Cube = 0;
    // control cube rotation



    public MyCanvas(Context context) {
        super(context);

    }

    @SuppressLint("DrawAllocation")
    protected void onDraw(Canvas canvas){

        Paint paint = new Paint();
        int chil = 0;
        String[][] control = new String[][]{
                //        0   1   2   3   4   5   6   7
                /*0*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                /*1*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                /*2*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                /*3*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                /*4*/   {" ", " ", "Y", "Y", " ", " ", " ", " "},
                /*5*/   {" ", " ", "Y", "Y", " ", " ", " ", " "}
        };
        switch (key_Cube){
            case 2:
                chil = 12;
                imageGen.a1 = new String[][]{
                        //        0   1   2   3   4   5   6   7
                        /*0*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                        /*1*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                        /*2*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                        /*3*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                        /*4*/   {" ", " ", "Y", "Y", " ", " ", " ", " "},
                        /*5*/   {" ", " ", "Y", "Y", " ", " ", " ", " "}
                };
                control = new String[][]{
                        //        0   1   2   3   4   5   6   7
                        /*0*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                        /*1*/   {" ", " ", "W", "W", " ", " ", " ", " "},
                        /*2*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                        /*3*/   {"O", "O", "G", "G", "R", "R", "B", "B"},
                        /*4*/   {" ", " ", "Y", "Y", " ", " ", " ", " "},
                        /*5*/   {" ", " ", "Y", "Y", " ", " ", " ", " "}
                };
                break;
            case 3:
                chil = 21;
                control = new String[][]{
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

                break;
        }

        String[] d = generator.gen(chil);
        imageGen.main(d);
        String[][] im = imageGen.a1;




        int count = 0;
        int left = 0, top = 0, right = width/8, bottom = height/6;
        int kLeft = width/8;
        int kTop = height/6;
        paint.setAntiAlias(true);

        for(int j = 0; j < 6; j++) {
            for (int i = 0; i < 8; i++) {
                switch (im[j][i]){
                    case "O":
                        paint.setColor(color[0]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);
                        break;
                    case "G":
                        paint.setColor(color[1]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);
                        break;
                    case "R":
                        paint.setColor(color[2]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);
                        break;
                    case "B":
                        paint.setColor(color[3]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);
                        break;
                    case "W":
                        paint.setColor(color[4]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);
                        break;
                    case "Y":
                        paint.setColor(color[5]);
                        paint.setStyle(Paint.Style.FILL);
                        canvas.drawRect(left,top,right,bottom,paint);
                        paint.setColor(Color.BLACK);
                        paint.setStyle(Paint.Style.STROKE);
                        canvas.drawRect(left,top,right,bottom,paint);

                        break;
                    default:
                        paint.setColor(specColor);
                        canvas.drawRect(left,top,right,bottom,paint);

                }
                left += kLeft;
                right += kLeft;
            }
            count++;
            left = 0;
            right = width/8;
            top += kTop;
            bottom += kTop;
        }
        imageGen.a1 = control;
    }
}
