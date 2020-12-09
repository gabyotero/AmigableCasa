package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
public class menuRecetas extends AppCompatActivity {
    Button btn_r1, btn_r2, btn_r3;
    ImageView img_regresarRecetas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_recetas);
        btn_r1=findViewById(R.id.btn_r1);
        btn_r2=findViewById(R.id.btn_r2);
        btn_r3=findViewById(R.id.btn_r3);
        img_regresarRecetas=findViewById(R.id.img_regresarRecetas);
        btn_r1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), receta1.class);
                startActivity(i);
            }
        });
        btn_r2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), receta2.class);
                startActivity(i);
            }
        });
        btn_r3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), receta3.class);
                startActivity(i);
            }
        });
        img_regresarRecetas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}