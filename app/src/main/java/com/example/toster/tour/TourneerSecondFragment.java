package com.example.toster.tour;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.toster.R;

import java.util.ArrayList;

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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourneer_second, container, false);
        String arg1Value = getArguments().getString("arg1");
        String arg2Value = getArguments().getString("arg2");
        String arg3Value = getArguments().getString("arg3");
        String arg4Value = getArguments().getString("arg4");
        String[] players = {arg4Value,arg1Value,arg3Value,arg2Value};
        ArrayList<String> final_pl = new ArrayList<>();
        for(int i = 0; i < players.length;i++){
            if(players[i] != null){
                final_pl.add(players[i]);
            }
        }
        ArrayList<String> chelov = new ArrayList<>();
//        for(int f = 0; f < 3;f++) {
//            for (int i = 0; i < final_pl.size(); i++) {
//                int g = random(final_pl.size() - 1, 0);
//                chelov.add(final_pl.get(g));
//                final_pl.remove(g);
//            }
//        }
        System.out.println(chelov.toString()+" "+final_pl.size());


        return view;
    }
    static int random(int max, int min){

        double x = (Math.random() * (max - min)) + min;
        int i = (int) x;
        return i;
    }
}