package com.example.toster.tour;

import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.os.TestLooperManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.toster.R;

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
    private String mParam1;
    private String mParam2;

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
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tourneer_first, container, false);



        ImageButton closeMenu = view.findViewById(R.id.closeMenu);
        ImageButton openMenu = view.findViewById(R.id.openMenu);
        ScrollView menuScroll = view.findViewById(R.id.menuScroll);
        Button cubeTwo = view.findViewById(R.id.cube_2);
        Button cubeThree = view.findViewById(R.id.cube_3);
        SeekBar seekBar = view.findViewById(R.id.seekBar);
        TextView mTextView = view.findViewById(R.id.colChel2);



        Button button = view.findViewById(R.id.button);
        ConstraintLayout con = view.findViewById(R.id.con);


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

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


        EditText editText = new EditText(getContext());
        final float scale = getContext().getResources().getDisplayMetrics().density;
        int pixelsWidth = (int) (200 * scale + 0.5f);
        int pixelsHeight = (int) (40 * scale + 0.5f);
        int pixelsWidthSc = (int) (100 * scale + 0.5f);
        int pixelsHeightSc = (int) (408 * scale + 0.5f);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setY(pixelsHeightSc);
                editText.setX(pixelsWidthSc);
                editText.setWidth(pixelsWidth);
                editText.setHeight(pixelsHeight);
                con.addView(editText);
            }
        });




        return view;
    }
}