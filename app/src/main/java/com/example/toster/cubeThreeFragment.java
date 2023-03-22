package com.example.toster;

import android.content.pm.ActivityInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ScrollView;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_cube_three, container, false);

        int key = 3;



        Button btnScramble = view.findViewById(R.id.buttonScramble);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button btnResult = view.findViewById(R.id.buttonResult);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);


        final ScheduledExecutorService executorService = Executors.newSingleThreadScheduledExecutor();
        ScheduledFuture<?> TimerFuture = null;
        final int[] cklic = {0};


        Handler handler = new Handler();
        final int[] seconds = {0};
        cubeFragment cubeFragment = new cubeFragment();



        ImageButton openMenu = view.findViewById(R.id.openMenu);
        ConstraintLayout cubeThreeLayout = view.findViewById(R.id.cubeTreeLayout);
        FrameLayout frameScramble = view.findViewById(R.id.frameLayoutScramble);
        ImageView imageView3 = view.findViewById(R.id.imageView3);

        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Bundle bundle = new Bundle();

        ImageGenThree imageGenThree = new ImageGenThree();

        StopWatch stopWatch = new StopWatch();
        View v = new MyCanvas(view.getContext());
        MyCanvas myCanvas = new MyCanvas(view.getContext());
        myCanvas.key_Cube = 3;
        Bitmap bitmap = Bitmap.createBitmap(160/*width*/, 120/*height*/, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        imageGenThree.strok = "";
        ImageView iv = (ImageView) view.findViewById(R.id.imageView3);
        v.draw(canvas);
        iv.setImageBitmap(bitmap);

        btnScramble.setText(imageGenThree.strok);



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
                imageGenThree.strok = "";
                v.draw(canvas);
                iv.setImageBitmap(bitmap);
                btnScramble.setText(imageGenThree.strok);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeTreeFragment_to_cubeThreeStatisticFragment);
            }
        });
        cubeThreeLayout.setOnClickListener(new View.OnClickListener() {

            int click = 0;
            @Override
            public void onClick(View view) {
                if (click == 0){
                    click = 1;
                    imageView3.setX(100000);







                }else{
                    click = 0;
                    int width = canvas.getWidth();
                    imageView3.setX(0);



                }
            }
        });




        return view;
    }
}