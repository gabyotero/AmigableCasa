package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class receta1 extends AppCompatActivity {
    Dialog dialogr1;
    Button btn_ingr1, btn_prep1;
    ImageView img_regresarr1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta1);
        btn_ingr1=findViewById(R.id.btn_ingr1);
        btn_ingr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta1.this).setView (R.layout.dialogor1).show();
            }
        });
        btn_prep1=findViewById(R.id.btn_prep1);
        btn_prep1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta1.this).setView (R.layout.dialogrp1).show();
            }
        });
        img_regresarr1=findViewById(R.id.img_regresarr1);
        img_regresarr1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}