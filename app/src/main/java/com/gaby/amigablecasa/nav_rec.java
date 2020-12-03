package com.gaby.amigablecasa;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link nav_rec#newInstance} factory method to
 * create an instance of this fragment.
 */

public class nav_rec extends Fragment {

    ImageView img_carton, img_madera, img_botellas, img_papel, img_reg_rec;
    View vista;



    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public nav_rec() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment nav_rec.
     */
    // TODO: Rename and change types and number of parameters
    public static nav_rec newInstance(String param1, String param2) {
        nav_rec fragment = new nav_rec();
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
        // Inflate the layout for this fragment
        vista=inflater.inflate(R.layout.fragment_nav_rec, container, false);
        img_carton=(ImageView)vista.findViewById(R.id.img_carton);
        img_carton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), manualidad_carton.class);
                startActivity(i);
            }
        });
        img_papel=(ImageView)vista.findViewById(R.id.img_papel);
        img_papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), manualidad_papel.class);
                startActivity(i);
            }
        });
        img_madera=(ImageView)vista.findViewById(R.id.img_madera);
        img_madera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), manualidad_madera.class);
                startActivity(i);
            }
        });
        img_botellas=(ImageView)vista.findViewById(R.id.img_botellas);
        img_botellas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), manualidad_plastico.class);
                startActivity(i);
            }
        });
        img_reg_rec=(ImageView)vista.findViewById(R.id.img_reg_rec);
        img_reg_rec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // onBackPressed();
            }
        });
        return vista;
    }
}