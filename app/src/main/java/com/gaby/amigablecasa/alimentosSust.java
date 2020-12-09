package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class alimentosSust extends AppCompatActivity {
    ImageView img_regresaras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentos_sust);
        img_regresaras=(ImageView)findViewById(R.id.img_regresaras);

        img_regresaras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}