package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class vidaverde1 extends AppCompatActivity {
    ImageView img_sustent, img_regresarv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidaverde1);

        img_regresarv1=findViewById(R.id.img_regresarv1);
        img_regresarv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}