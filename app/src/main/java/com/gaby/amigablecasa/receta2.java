package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class receta2 extends AppCompatActivity {
    Button btn_ingr2, btn_prep2;
    ImageView img_regresarr2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta2);
        btn_ingr2=findViewById(R.id.btn_ingr2);
        btn_ingr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta2.this).setView (R.layout.dialogr2).show();
            }
        });
        btn_prep2=findViewById(R.id.btn_prep2);
        btn_prep2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta2.this).setView (R.layout.dialogp2).show();
            }
        });
        img_regresarr2=findViewById(R.id.img_regresarr2);
        img_regresarr2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}