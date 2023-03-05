package com.example.toster;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link cubeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class cubeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public cubeFragment() {
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
    public static cubeFragment newInstance(String param1, String param2) {
        cubeFragment fragment = new cubeFragment();
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

        View view = inflater.inflate(R.layout.fragment_cube, container, false);
        Button btnScramble = view.findViewById(R.id.buttonScramble);
        Button btnResult = view.findViewById(R.id.buttonResult);
        ImageGen imageGen = new ImageGen();
        View v = new MyCanvas(view.getContext());
        Bitmap bitmap = Bitmap.createBitmap(160/*width*/, 120/*height*/, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        imageGen.strok = "";
        ImageView iv = (ImageView) view.findViewById(R.id.imageView3);
        v.draw(canvas);
        iv.setImageBitmap(bitmap);

        btnScramble.setText(imageGen.strok);

        btnScramble.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageGen.strok = "";
                v.draw(canvas);
                iv.setImageBitmap(bitmap);
                btnScramble.setText(imageGen.strok);

            }
        });

        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Navigation.findNavController(view).navigate(R.id.action_cubeFragment_to_statisticFragment,bundle);
            }
        });


        return view;
    }
}