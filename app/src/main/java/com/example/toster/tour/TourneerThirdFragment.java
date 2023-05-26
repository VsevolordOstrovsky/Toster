package com.example.toster.tour;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.toster.GetResults;
import com.example.toster.R;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TourneerThirdFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TourneerThirdFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public TourneerThirdFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment TourneerThirdFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static TourneerThirdFragment newInstance(String param1, String param2) {
        TourneerThirdFragment fragment = new TourneerThirdFragment();
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
    GetResults getResults = new GetResults();
    LinearLayout layout;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tourneer_third, container, false);


        layout = view.findViewById(R.id.frame);
        layout.setGravity(Gravity.CENTER | Gravity.TOP);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        Button tourneerCube = view.findViewById(R.id.tourneer);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);
        ImageButton openMenu = view.findViewById(R.id.openMenu);
        ScrollView menuScroll = view.findViewById(R.id.menuScroll);

        List<Map.Entry<String, Integer>> list = new LinkedList<>(getResults.map.entrySet());

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
                Navigation.findNavController(view).navigate(R.id.action_tourneerThirdFragment_to_cubeFragment);
            }
        });
        cubeThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerThirdFragment_to_cubeTreeFragment);
            }
        });
        tourneerCube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_tourneerThirdFragment_to_tourneerFirstFragment);
            }
        });

        int counter = 0;
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });


        for (Map.Entry<String, Integer> entry : list) {
            map.put(entry.getKey(), entry.getValue());
        }

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            counter++;
            create(String.format("%s. %s",counter,getResults.sredPer(pair.getKey(),pair.getValue())));
        }






        return view;
    }
    private void create(String text){
        TextView dynamicTextView = new TextView(getContext());

        dynamicTextView.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT));
        dynamicTextView.setTextSize(32);
        dynamicTextView.setTextColor(Color.WHITE);
        dynamicTextView.setText(text);
        layout.addView(dynamicTextView);
    }
}