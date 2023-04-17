package com.example.toster;

import static android.content.Context.WINDOW_SERVICE;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Point;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cubeThreeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cubeThreeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cubeThreeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cubeTreeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cubeThreeFragment newInstance(String param1, String param2) {
        cubeThreeFragment fragment = new cubeThreeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }
    private final int start = 0, stop = 1, refresh = 2;

    private final StopWatch stopWatch = new StopWatch();
    private TextView stopw;

    Handler timerHandler = new Handler(Looper.getMainLooper()) {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);

            switch (msg.what) {
                case start:
                    if (stopWatch.isRunning())
                        break;
                    try {
                        Thread.sleep(120);
                    } catch (InterruptedException e) {
                        Log.d("RRR",e.fillInStackTrace().toString());
                    }
                    stopWatch.start();
                    timerHandler.sendEmptyMessage(refresh);
                    break;
                case refresh:
                    stopw.setText(String.format("%s", format(stopWatch.getElapsedTime())));
                    timerHandler.sendEmptyMessageDelayed(refresh, 1);
                    break;
                case stop:
                    timerHandler.removeMessages(refresh);
                    if (!stopWatch.isRunning())
                        break;
                    stopWatch.stop();
                    break;
                default:
                    break;
            }
        }
    };
    private boolean justStopped = false, isFingerDown = false;
    private long readyTime;

    private String format(long milliseconds) {
        String time = String.format("%1$TM:%1$TS:%1$TL", milliseconds);
        return time.substring(0, time.length() - 1);
    }
    private static boolean clikcFlag = true;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cube_three, container, false);

        int key = 3;





        Button btnScramble = view.findViewById(R.id.buttonScramble);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button btnResult = view.findViewById(R.id.buttonResult);
        Button btnTour = view.findViewById(R.id.tourneer);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);


        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> TimerFuture = null;
        final int[] cklic = {0};


        Handler handler = new Handler();
        final int[] seconds = {0};
        cubeFragment cubeFragment = new cubeFragment();
        MainActivity mainActivity = new MainActivity();



        ImageButton openMenu = view.findViewById(R.id.openMenu);
        ConstraintLayout cubeThreeLayout = view.findViewById(R.id.cubeTreeLayout);
        FrameLayout frameScramble = view.findViewById(R.id.frameLayoutScramble);
        stopw = view.findViewById(R.id.textView3);

        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Bundle bundle = new Bundle();

        ImageGenThree imageGenThree = new ImageGenThree();


        View vin = new MyCanvas(view.getContext());
        MyCanvas myCanvas = new MyCanvas(view.getContext());
        myCanvas.key_Cube = 3;
        Bitmap bitmap = Bitmap.createBitmap(160/*width*/, 120/*height*/, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);

        imageGenThree.strok = "";
        ImageView iv = (ImageView) view.findViewById(R.id.imageView3);
        vin.draw(canvas);
        iv.setImageBitmap(bitmap);

        btnScramble.setText(imageGenThree.strok);
        clikcFlag = true;




        openMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(0);
            }
        });

        closeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(-10000000);
            }
        });
        cubeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeTreeFragment_to_cubeFragment);
            }
        });

        btnScramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clikcFlag == true) {
                    imageGenThree.strok = "";
                    vin.draw(canvas);
                    iv.setImageBitmap(bitmap);
                    btnScramble.setText(imageGenThree.strok);
                }


            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeTreeFragment_to_cubeThreeStatisticFragment);
            }
        });
        btnTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeTreeFragment_to_tourneerFirstFragment);
            }
        });
        cubeThreeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFingerDown) {

                    isFingerDown = true;
                    if (stopWatch.isRunning()) {
                        timerHandler.sendEmptyMessage(stop);
                        justStopped = true;

                        imageGenThree.strok = "";
                        vin.draw(canvas);
                        iv.setImageBitmap(bitmap);
                        btnScramble.setText(imageGenThree.strok);

                        clikcFlag = true;

                    }
                    readyTime = System.currentTimeMillis();
                    justStopped = false;
                } else {

                    isFingerDown = false;
                    if (!justStopped && System.currentTimeMillis() - readyTime > 1000) {
                        timerHandler.sendEmptyMessage(start);
                        clikcFlag = false;
                    }
                }

            }

        });





        return view;
    }

}