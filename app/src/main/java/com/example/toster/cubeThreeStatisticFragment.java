package com.example.toster;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ScrollView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cubeThreeStatisticFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cubeThreeStatisticFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cubeThreeStatisticFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment cubeThreeStatisticFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static cubeThreeStatisticFragment newInstance(String param1, String param2) {
        cubeThreeStatisticFragment fragment = new cubeThreeStatisticFragment();
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
        View view = inflater.inflate(R.layout.fragment_cube_three_statistic, container, false);

        Button btnStopWatch = view.findViewById(R.id.buttonStopWathch);
        Button btnResult = view.findViewById(R.id.buttonResult);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        ImageButton closeMenu = view.findViewById(R.id.closeMenu);


        ImageButton openMenu = view.findViewById(R.id.openMenu);

        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Bundle bundle = new Bundle();

        btnStopWatch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ImageGen imageGen = new ImageGen();
                imageGen.strok = "";
                Navigation.findNavController(view).navigate(R.id.action_cubeThreeStatisticFragment_to_cubeTreeFragment,bundle);
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
                menuScroll.setX(-1000000);
            }
        });
        cubeTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(R.id.action_cubeThreeStatisticFragment_to_statisticFragment);
            }
        });



        return view;
    }
}