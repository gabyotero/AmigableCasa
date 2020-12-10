package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class receta3 extends AppCompatActivity {
    Button btn_ingr3, btn_prep3;
    ImageView img_regresarr3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receta3);
        btn_ingr3=findViewById(R.id.btn_ingr3);
        btn_ingr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta3.this).setView (R.layout.dialogr3).show();
            }
        });
        btn_prep3=findViewById(R.id.btn_prep3);
        btn_prep3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new AlertDialog.Builder(receta3.this).setView (R.layout.dialogp3).show();
            }
        });
        img_regresarr3=findViewById(R.id.img_regresarr3);
        img_regresarr3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}