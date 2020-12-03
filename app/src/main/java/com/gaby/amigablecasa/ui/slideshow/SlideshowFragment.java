package com.gaby.amigablecasa.ui.slideshow;

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

import com.gaby.amigablecasa.avance_basura;
import com.gaby.amigablecasa.idea_botes;
import com.gaby.amigablecasa.basura_organica;
import com.gaby.amigablecasa.basura_inorganica;
import com.gaby.amigablecasa.R;

public class SlideshowFragment extends Fragment {
    Button btn_idea, btn_avance;
    ImageView img_organica, img_inorganica;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        final TextView textView = root.findViewById(R.id.text_slideshow);
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        btn_idea=(Button)root.findViewById(R.id.btn_idea);
        btn_idea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), idea_botes.class);
                startActivity(i);
            }
        });

        btn_avance=(Button)root.findViewById(R.id.btn_avance);
        btn_avance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), avance_basura.class);
                startActivity(i);
            }
        });

        img_organica=(ImageView) root.findViewById(R.id.img_organica);
        img_organica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), basura_organica.class);
                startActivity(i);
            }
        });

        img_inorganica=(ImageView) root.findViewById(R.id.img_inorganica);
        img_inorganica.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getContext(), basura_inorganica.class);
                startActivity(i);
            }
        });
        return root;
    }
}