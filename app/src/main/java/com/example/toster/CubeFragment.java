package com.example.toster;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CubeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CubeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CubeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cubeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static CubeFragment newInstance(String param1, String param2) {
        CubeFragment fragment = new CubeFragment();
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

    private SharedPreferences shared;

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
    private final String save_2X2 = "save2X2";

    private String format(long milliseconds) {
        String time = String.format("%1$TM:%1$TS:%1$TL", milliseconds);
        return time.substring(0, time.length() - 1);
    }


    private View view;
    StatisticFragment statisticFragment = new StatisticFragment();
    private TextView lastTime;
    private static boolean clickFlag = true;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_cube, container, false);

        init();
        lastTime.setText(shared.getString(save_2X2,"Последнее время\n00:00:00"));


        int key = 2;









        Button btnScramble = view.findViewById(R.id.buttonScramble);
        Button btnResult = view.findViewById(R.id.buttonResult);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button btnTour = view.findViewById(R.id.tourneer);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);
        ConstraintLayout cubelayout = view.findViewById(R.id.cubelayout);


        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> TimerFuture = null;
        final int[] cklic = {0};






        ImageButton openMenu = view.findViewById(R.id.openMenu);

        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Bundle bundle = new Bundle();

        ImageGen imageGen = new ImageGen();



       // File file = new File("notes2.txt");


        View vin = new MyCanvas(view.getContext());
        MyCanvas myCanvas = new MyCanvas(view.getContext());
        myCanvas.key_Cube = 2;
        Bitmap bitmap = Bitmap.createBitmap(160/*width*/, 120/*height*/, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        imageGen.strok = "";
        ImageView iv = (ImageView) view.findViewById(R.id.imageView2);
        vin.draw(canvas);
        iv.setImageBitmap(bitmap);


        btnScramble.setText(imageGen.strok);
        clickFlag = true;





        btnScramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickFlag == true) {
                    imageGen.strok = "";
                    vin.draw(canvas);
                    iv.setImageBitmap(bitmap);
                    btnScramble.setText(imageGen.strok);
                }

            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Navigation.findNavController(view).navigate(R.id.action_cubeFragment_to_statisticFragment,bundle);

            }
        });
        openMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(0);
            }
        });
        closeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(-100000);
            }
        });
        cubeThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeFragment_to_cubeTreeFragment);

            }
        });
        btnTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeFragment_to_tourneerFirstFragment);
            }
        });


        cubelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFingerDown) {
                    isFingerDown = true;

                    if (stopWatch.isRunning()) {
                        lastTime.setText(shared.getString(save_2X2,"Последнее время\n00:00:00"));
                        SharedPreferences.Editor edit = shared.edit();
                        if (stopw.getText().toString() != "Последнее время\n00:00:00"){
                            edit.putString(save_2X2,"Последнее время\n"+stopw.getText().toString());
                            edit.apply();
                        }

                        timerHandler.sendEmptyMessage(stop);
                        justStopped = true;
                        clickFlag = true;

                        imageGen.strok = "";
                        vin.draw(canvas);
                        iv.setImageBitmap(bitmap);
                        btnScramble.setText(imageGen.strok);



                    }
                    readyTime = System.currentTimeMillis();
                    justStopped = false;
                    } else {
                    isFingerDown = false;
                    if (!justStopped && System.currentTimeMillis() - readyTime > 1000) {
                        timerHandler.sendEmptyMessage(start);

                        clickFlag = false;
                    }
                }

            }

        });

        return view;
    }
    private void init(){
        shared = getActivity().getSharedPreferences("Cube2X2", Context.MODE_PRIVATE);
        stopw = view.findViewById(R.id.stopwatch);
        lastTime = view.findViewById(R.id.lastTime);

    }



}
