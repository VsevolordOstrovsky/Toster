package com.example.toster;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    Button btn;
    TextView textView;
    ImageView imageView0, imageView1,imageView2,imageView3,imageView4,imageView5,imageView6,imageView7,imageView8,imageView9,
            imageView10,imageView11,imageView12,imageView13,imageView14,imageView15,imageView16,imageView17,imageView18,imageView19,
            imageView20,imageView21,imageView22,imageView23;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.button);
        textView = findViewById(R.id.textView);
        imageView0 = findViewById(R.id.imageView0);
        imageView1 = findViewById(R.id.imageView1);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        imageView4 = findViewById(R.id.imageView4);
        imageView5 = findViewById(R.id.imageView5);
        imageView6 = findViewById(R.id.imageView6);
        imageView7 = findViewById(R.id.imageView7);
        imageView8 = findViewById(R.id.imageView8);
        imageView9 = findViewById(R.id.imageView9);
        imageView10 = findViewById(R.id.imageView10);
        imageView11 = findViewById(R.id.imageView11);
        imageView12 = findViewById(R.id.imageView12);
        imageView13 = findViewById(R.id.imageView13);
        imageView14 = findViewById(R.id.imageView14);
        imageView15 = findViewById(R.id.imageView15);
        imageView16 = findViewById(R.id.imageView16);
        imageView17 = findViewById(R.id.imageView17);
        imageView18 = findViewById(R.id.imageView18);
        imageView19 = findViewById(R.id.imageView19);
        imageView20 = findViewById(R.id.imageView20);
        imageView21 = findViewById(R.id.imageView21);
        imageView22 = findViewById(R.id.imageView22);
        imageView23 = findViewById(R.id.imageView23);




        Generator generator = new Generator();
        ImageGen imageGen = new ImageGen();
        imageGen.main();
        textView.setText(imageGen.strok);

        switch (imageGen.a1[0][2]){
            case "W":
                imageView0.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView0.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView0.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView0.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView0.setImageResource(R.drawable.orange);
                break;
            default:
                imageView0.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[0][3]){
            case "W":
                imageView1.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView1.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView1.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView1.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView1.setImageResource(R.drawable.orange);
                break;
            default:
                imageView1.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[1][2]){
            case "W":
                imageView2.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView2.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView2.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView2.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView2.setImageResource(R.drawable.orange);
                break;
            default:
                imageView2.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[1][3]){
            case "W":
                imageView3.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView3.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView3.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView3.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView3.setImageResource(R.drawable.orange);
                break;
            default:
                imageView3.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][0]){
            case "W":
                imageView4.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView4.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView4.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView4.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView4.setImageResource(R.drawable.orange);
                break;
            default:
                imageView4.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][1]){
            case "W":
                imageView5.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView5.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView5.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView5.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView5.setImageResource(R.drawable.orange);
                break;
            default:
                imageView5.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][0]){
            case "W":
                imageView6.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView6.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView6.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView6.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView6.setImageResource(R.drawable.orange);
                break;
            default:
                imageView6.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][1]){
            case "W":
                imageView7.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView7.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView7.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView7.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView7.setImageResource(R.drawable.orange);
                break;
            default:
                imageView7.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][2]){
            case "W":
                imageView8.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView8.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView8.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView8.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView8.setImageResource(R.drawable.orange);
                break;
            default:
                imageView8.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][3]){
            case "W":
                imageView9.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView9.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView9.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView9.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView9.setImageResource(R.drawable.orange);
                break;
            default:
                imageView9.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][2]){
            case "W":
                imageView10.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView10.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView10.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView10.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView10.setImageResource(R.drawable.orange);
                break;
            default:
                imageView10.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][3]){
            case "W":
                imageView11.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView11.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView11.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView11.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView11.setImageResource(R.drawable.orange);
                break;
            default:
                imageView11.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][4]){
            case "W":
                imageView12.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView12.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView12.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView12.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView12.setImageResource(R.drawable.orange);
                break;
            default:
                imageView12.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][5]){
            case "W":
                imageView13.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView13.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView13.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView13.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView13.setImageResource(R.drawable.orange);
                break;
            default:
                imageView13.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][4]){
            case "W":
                imageView14.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView14.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView14.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView14.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView14.setImageResource(R.drawable.orange);
                break;
            default:
                imageView14.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][5]){
            case "W":
                imageView15.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView15.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView15.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView15.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView15.setImageResource(R.drawable.orange);
                break;
            default:
                imageView15.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][6]){
            case "W":
                imageView16.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView16.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView16.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView16.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView16.setImageResource(R.drawable.orange);
                break;
            default:
                imageView16.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[2][7]){
            case "W":
                imageView17.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView17.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView17.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView17.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView17.setImageResource(R.drawable.orange);
                break;
            default:
                imageView17.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][6]){
            case "W":
                imageView18.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView18.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView18.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView18.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView18.setImageResource(R.drawable.orange);
                break;
            default:
                imageView18.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[3][7]){
            case "W":
                imageView19.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView19.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView19.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView19.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView19.setImageResource(R.drawable.orange);
                break;
            default:
                imageView19.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[4][2]){
            case "W":
                imageView20.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView20.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView20.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView20.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView20.setImageResource(R.drawable.orange);
                break;
            default:
                imageView20.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[4][3]){
            case "W":
                imageView21.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView21.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView21.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView21.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView21.setImageResource(R.drawable.orange);
                break;
            default:
                imageView21.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[5][2]){
            case "W":
                imageView22.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView22.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView22.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView22.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView22.setImageResource(R.drawable.orange);
                break;
            default:
                imageView22.setImageResource(R.drawable.yellow);
                break;

        }
        switch (imageGen.a1[5][3]){
            case "W":
                imageView23.setImageResource(R.drawable.white);
                break;
            case "R":
                imageView23.setImageResource(R.drawable.red);
                break;
            case "B":
                imageView23.setImageResource(R.drawable.blue);
                break;
            case "G":
                imageView23.setImageResource(R.drawable.green);
                break;
            case "O":
                imageView23.setImageResource(R.drawable.orange);
                break;
            default:
                imageView23.setImageResource(R.drawable.yellow);
                break;

        }


//        imageView.setImageResource(R.drawable.green);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageGen.strok = "";
                imageGen.main();
                textView.setText(imageGen.strok);

                switch (imageGen.a1[0][2]){
                    case "W":
                        imageView0.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView0.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView0.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView0.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView0.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView0.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[0][3]){
                    case "W":
                        imageView1.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView1.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView1.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView1.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView1.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView1.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[1][2]){
                    case "W":
                        imageView2.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView2.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView2.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView2.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView2.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView2.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[1][3]){
                    case "W":
                        imageView3.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView3.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView3.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView3.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView3.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView3.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][0]){
                    case "W":
                        imageView4.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView4.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView4.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView4.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView4.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView4.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][1]){
                    case "W":
                        imageView5.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView5.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView5.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView5.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView5.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView5.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][0]){
                    case "W":
                        imageView6.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView6.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView6.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView6.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView6.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView6.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][1]){
                    case "W":
                        imageView7.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView7.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView7.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView7.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView7.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView7.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][2]){
                    case "W":
                        imageView8.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView8.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView8.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView8.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView8.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView8.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][3]){
                    case "W":
                        imageView9.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView9.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView9.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView9.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView9.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView9.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][2]){
                    case "W":
                        imageView10.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView10.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView10.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView10.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView10.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView10.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][3]){
                    case "W":
                        imageView11.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView11.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView11.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView11.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView11.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView11.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][4]){
                    case "W":
                        imageView12.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView12.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView12.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView12.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView12.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView12.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][5]){
                    case "W":
                        imageView13.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView13.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView13.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView13.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView13.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView13.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][4]){
                    case "W":
                        imageView14.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView14.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView14.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView14.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView14.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView14.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][5]){
                    case "W":
                        imageView15.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView15.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView15.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView15.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView15.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView15.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][6]){
                    case "W":
                        imageView16.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView16.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView16.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView16.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView16.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView16.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[2][7]){
                    case "W":
                        imageView17.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView17.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView17.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView17.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView17.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView17.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][6]){
                    case "W":
                        imageView18.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView18.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView18.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView18.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView18.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView18.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[3][7]){
                    case "W":
                        imageView19.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView19.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView19.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView19.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView19.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView19.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[4][2]){
                    case "W":
                        imageView20.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView20.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView20.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView20.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView20.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView20.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[4][3]){
                    case "W":
                        imageView21.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView21.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView21.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView21.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView21.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView21.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[5][2]){
                    case "W":
                        imageView22.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView22.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView22.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView22.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView22.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView22.setImageResource(R.drawable.yellow);
                        break;

                }
                switch (imageGen.a1[5][3]){
                    case "W":
                        imageView23.setImageResource(R.drawable.white);
                        break;
                    case "R":
                        imageView23.setImageResource(R.drawable.red);
                        break;
                    case "B":
                        imageView23.setImageResource(R.drawable.blue);
                        break;
                    case "G":
                        imageView23.setImageResource(R.drawable.green);
                        break;
                    case "O":
                        imageView23.setImageResource(R.drawable.orange);
                        break;
                    default:
                        imageView23.setImageResource(R.drawable.yellow);
                        break;

                }

            }
        });
    }


}