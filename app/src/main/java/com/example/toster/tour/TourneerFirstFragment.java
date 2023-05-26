package com.example.toster.tour;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.os.TestLooperManager;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.toster.GetResults;
import com.example.toster.R;
import com.example.toster.TourneerViewModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TourneerFirstFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TourneerFirstFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters


    private static EditText editText_1;
    private static EditText editText_2;
    private static EditText editText_3;
    private static EditText editText_4;
    private static SeekBar seekBar;
    Bundle bundle = new Bundle();
    Bundle bundle1 = new Bundle();

    public String s1,s2,s3,s4;

    public TourneerFirstFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TourneerFirstFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TourneerFirstFragment newInstance(String param1, String param2) {
        TourneerFirstFragment fragment = new TourneerFirstFragment();
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

        }
    }



    public static List<String> name = new ArrayList<>();
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourneer_first, container, false);

        final int[] flag_1 = {1};
        final int[] flag_2 = new int[1];
        final int[] flag_3 = new int[1];

        int flag;


        GetResults getResults = new GetResults();

        ImageButton closeMenu = view.findViewById(R.id.closeMenu);
        ImageButton openMenu = view.findViewById(R.id.openMenu);
        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button tourCube2 = view.findViewById(R.id.btn2);
        Button tourCube3 = view.findViewById(R.id.btn3);
        seekBar = view.findViewById(R.id.seekBar);
        TextView mTextView = view.findViewById(R.id.colChel2);
        final float scale = getContext().getResources().getDisplayMetrics().density;
        LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                (int)(200 * scale + 0.5f), (int) (45 * scale + 0.5f));
        lParams.gravity = Gravity.CENTER_HORIZONTAL;


//        Button btnSecond = view.findViewById(R.id.btnSecond);


        editText_1 = new EditText(getContext());
        editText_1.setText("Player1");
        editText_2 = new EditText(getContext());
        editText_2.setText("Player2");
        editText_3 = new EditText(getContext());
        editText_3.setText("Player3");
        editText_4 = new EditText(getContext());
        editText_4.setText("Player4");





        LinearLayout llMain;
        llMain = (LinearLayout) view.findViewById(R.id.llMain);
        if(bundle1.get("sss") != null){
            System.out.println("---------------------"+(Integer) bundle1.get("sss"));
            seekBar.setProgress((Integer) bundle1.get("sss"));
            mTextView.setText(bundle1.get("sss").toString());
            llMain.addView(editText_1,lParams);
            llMain.addView(editText_2,lParams);
            if(seekBar.getProgress() == 2 && flag_1[0] == 0){
                flag_2[0] = 0;
                llMain.removeView(editText_4);
                llMain.removeView(editText_3);
            }
            if(seekBar.getProgress() == 3 && flag_2[0] == 0){
                flag_2[0] = 1;
                flag_1[0] = 0;
                Log.i("RRR","crash");
                llMain.addView(editText_3,lParams);
            }else{if(seekBar.getProgress() == 3 && flag_2[0] == 1){
                flag_2[0] = 1;
                flag_1[0] = 0;

                llMain.removeView(editText_4);
            }}

            if(seekBar.getProgress() == 4 && flag_2[0] == 1){
                flag_3[0] = 1;
                flag_1[0] = 0;
                llMain.addView(editText_4,lParams);
            }else{
                if(seekBar.getProgress() == 4 && flag_2[0] == 0){
                    flag_3[0] = 1;
                    flag_1[0] = 0;
                    flag_2[0] = 1;
                    llMain.addView(editText_3,lParams);
                    llMain.addView(editText_4,lParams);
                }
            }

        }else{
            llMain.addView(editText_1,lParams);
            llMain.addView(editText_2,lParams);
        }
        System.out.println("SeekBar Progress: "+ seekBar.getProgress());



        openMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(0);
            }
        });
        closeMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                menuScroll.setX(-1000000);
            }
        });
        cubeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerFirstFragment_to_cubeFragment);
            }
        });
        cubeThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerFirstFragment_to_cubeTreeFragment);
            }
        });
        seekBar.setMax(4);
        seekBar.setMin(2);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                mTextView.setText(String.valueOf(seekBar.getProgress()));
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }
            int f = 0;
            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                if(seekBar.getProgress() == 2 && flag_1[0] == 0){
                    flag_2[0] = 0;
                    llMain.removeView(editText_4);
                    llMain.removeView(editText_3);
                    f = 0;
                }
                if(seekBar.getProgress() == 3 && flag_2[0] == 0){
                    flag_2[0] = 1;
                    flag_1[0] = 0;
                    f = 0;
                    llMain.addView(editText_3,lParams);
                }else{if(seekBar.getProgress() == 3 && flag_2[0] == 1){
                    flag_2[0] = 1;
                    flag_1[0] = 0;
                    f = 0;
                    llMain.removeView(editText_4);
                }}

                if(seekBar.getProgress() == 4 && flag_2[0] == 1 && f == 0){
                    flag_3[0] = 1;
                    flag_1[0] = 0;
                    f = 1;

                    llMain.addView(editText_4,lParams);
                }else{
                    if(seekBar.getProgress() == 4 && flag_2[0] == 0 && f == 0){
                        flag_3[0] = 1;
                        flag_1[0] = 0;
                        flag_2[0] = 1;
                        f = 1;
                        llMain.addView(editText_3,lParams);
                        llMain.addView(editText_4,lParams);
                    }
                }

            }
        });




        tourCube2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSeek();
                bundle.putInt("flag",2);
                bundle1.putInt("sss",seekBar.getProgress());
                Navigation.findNavController(view).navigate(R.id.action_tourneerFirstFragment_to_tourneerSecondFragment,bundle);
            }
        });

        tourCube3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getSeek();
                bundle.putInt("flag",3);
                bundle1.putInt("sss",seekBar.getProgress());
                Navigation.findNavController(view).navigate(R.id.action_tourneerFirstFragment_to_tourneerSecondFragment,bundle);
            }
        });









        return view;
    }

    private void getSeek(){


        switch (seekBar.getProgress()){
            case 2:
                name.add(String.valueOf(editText_1.getText()));
                name.add(String.valueOf(editText_2.getText()));
                break;
            case 3:
                name.add(String.valueOf(editText_1.getText()));
                name.add(String.valueOf(editText_2.getText()));
                name.add(String.valueOf(editText_3.getText()));

                break;
            case 4:
                name.add(String.valueOf(editText_1.getText()));
                name.add(String.valueOf(editText_2.getText()));
                name.add(String.valueOf(editText_3.getText()));
                name.add(String.valueOf(editText_4.getText()));

        }
        System.out.println(name.toString());
        // вызов view model
        TourneerViewModel orderViewModel = new ViewModelProvider(requireActivity()).get(TourneerViewModel.class);
        List<String> ddd = generationRandom(name);
        System.out.println(ddd.toString());
        orderViewModel.set_users(ddd);


        //   fragmentPickupBinding.setViewModel(orderViewModel);
        //   fragmentPickupBinding.setLifecycleOwner(this);
    }

    private static List<String> generationRandom(List<String> name){
        String[] list = new String[name.size()];
        for(int v = 0; v < name.size();v++){
            list[v] = name.get(v);
        }
        name.clear();
        name = new ArrayList<>(Arrays.asList(list));
        Collections.shuffle(name);

        int g = name.size();
        for(int asas = 0; asas < 2; asas++) {
            for (int i = 0; i < g; i++) {
                name.add(name.get(i));
            }
        }

        return name;
    }



}