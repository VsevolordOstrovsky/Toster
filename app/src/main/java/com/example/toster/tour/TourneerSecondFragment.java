package com.example.toster.tour;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
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

import com.example.toster.GetResults;
import com.example.toster.ImageGen;
import com.example.toster.ImageGenThree;
import com.example.toster.MyCanvas;
import com.example.toster.R;
import com.example.toster.StopWatch;
import com.example.toster.TourneerViewModel;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TourneerSecondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TourneerSecondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TourneerSecondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TourneerSecondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TourneerSecondFragment newInstance(String param1, String param2) {
        TourneerSecondFragment fragment = new TourneerSecondFragment();
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


    private static ImageGen imageGen = new ImageGen();
    private static ImageGenThree imageGenThree = new ImageGenThree();
    private static GetResults getResults = new GetResults();
    private static MyCanvas myCanvas;
    private static View vin;
    private static ImageView iv;
    private static Button btnScramble;
    private static Canvas canvas;
    private static Bitmap bitmap;
    private static boolean clickFlag = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_tourneer_second, container, false);
        TourneerViewModel orderViewModel = new ViewModelProvider(requireActivity()).get(TourneerViewModel.class);
        TextView textViewCubeName = view.findViewById(R.id.textViewCubeName);
        ArrayList<String> plaers_queue = new ArrayList<>();

        int flag = getArguments().getInt("flag");

        Button btnNext = view.findViewById(R.id.nextButton);
        btnNext.setX(1000000000);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println(getResults.map.get("Player1"));
                System.out.println(getResults.map.get("Player2"));
                Navigation.findNavController(view).navigate(R.id.action_tourneerSecondFragment_to_tourneerThirdFragment);
            }
        });

        orderViewModel.users.observe(getActivity(), new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {
                int a = random(strings.size(),0);
                textViewCubeName.setText(strings.get(a));
                plaers_queue.add(strings.get(a));
                strings.remove(a);

            }
        });




        btnScramble = view.findViewById(R.id.buttonScramble);

        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button btnTour = view.findViewById(R.id.tourneer);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);
        ConstraintLayout cubelayout = view.findViewById(R.id.tourneerCubeL);


        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> TimerFuture = null;
        final int[] cklic = {0};






        ImageButton openMenu = view.findViewById(R.id.openMenu);

        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Bundle bundle = new Bundle();




        stopw = view.findViewById(R.id.stopwatch3);




        orderViewModel.users.observe(getActivity(), new Observer<List<String>>() {
            @Override
            public void onChanged(List<String> strings) {

                System.out.println(strings.toString());

            }
        });





        vin = new MyCanvas(view.getContext());
        myCanvas = new MyCanvas(view.getContext());

        bitmap = Bitmap.createBitmap(160/*width*/, 120/*height*/, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);

        iv = (ImageView) view.findViewById(R.id.imageView4);
//        imageGen.strok = "";
//        vin.draw(canvas);
//        iv.setImageBitmap(bitmap);
//        btnScramble.setText(imageGen.strok);
        collektionsMetod(flag);
        clickFlag = true;
        btnScramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clickFlag == true) {
                    collektionsMetod(flag);
                }

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
                Navigation.findNavController(view).navigate(R.id.action_tourneerSecondFragment_to_cubeTreeFragment);

            }
        });
        cubeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerSecondFragment_to_cubeFragment);
            }
        });
        btnTour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerSecondFragment_to_tourneerFirstFragment);
            }
        });



        cubelayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFingerDown) {
                    isFingerDown = true;
                    if (stopWatch.isRunning()) {

                        timerHandler.sendEmptyMessage(stop);
                        justStopped = true;
                        clickFlag = true;

                        collektionsMetod(flag);
                        final int[] k = {0};
                        orderViewModel.users.observe(getActivity(), new Observer<List<String>>() {
                            List<String> list;
                            @Override
                            public void onChanged(List<String> strings) {
                                list = strings;
                                int a = 0;
                                if(strings.size() > 0) {
                                    textViewCubeName.setText(list.get(a));
                                    list.remove(a);
                                }else{
                                    iv.setX(1000000000);
                                    btnScramble.setX(1000000000);
                                    btnNext.setX(0);

                                }

                            }
                        });
                        // вызов GetResults
                        getResults.getRes(textViewCubeName.getText().toString(), stopw.getText().toString());


                    }
                    readyTime = System.currentTimeMillis();
                    justStopped = false;
                } else {
                    isFingerDown = false;
                    if (!justStopped && System.currentTimeMillis() - readyTime > 1000) {
                        timerHandler.sendEmptyMessage(start);
                        System.out.println("1");
                        clickFlag = false;
                    }
                }

            }

        });









        return view;
    }
    
    

    private static void collektionsMetod(int flag){
        switch (flag){
            case 2:
                myCanvas.key_Cube = 2;
                imageGen.strok = "";
                vin.draw(canvas);
                iv.setImageBitmap(bitmap);
                btnScramble.setText(imageGen.strok);
                break;
            case 3:
                myCanvas.key_Cube = 3;
                imageGenThree.strok = "";
                vin.draw(canvas);
                iv.setImageBitmap(bitmap);
                btnScramble.setText(imageGenThree.strok);
        }
    }
    static int random(int max, int min){

        double x = (Math.random() * (max - min)) + min;
        int i = (int) x;
        return i;
    }
}