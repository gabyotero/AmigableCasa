package com.gaby.amigablecasa.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;


import com.gaby.amigablecasa.R;
import com.gaby.amigablecasa.vidaverde3;
import com.gaby.amigablecasa.vidaverde2;
import com.gaby.amigablecasa.vidaverde1;
public class HomeFragment extends Fragment {
    ImageView img_sustent, img_sabias, img_plantas;
    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        img_sustent=root.findViewById(R.id.img_sustent);
        img_sustent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), vidaverde1.class);
                startActivity(i);
            }
        });
        img_sabias=root.findViewById(R.id.img_sabias);
        img_sabias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), vidaverde2.class);
                startActivity(i);
            }
        });
        img_plantas=root.findViewById(R.id.img_plantas);
        img_plantas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), vidaverde3.class);
                startActivity(i);
            }
        });

        return root;
    }
}