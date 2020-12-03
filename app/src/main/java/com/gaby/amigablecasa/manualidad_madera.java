package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class manualidad_madera extends AppCompatActivity {
    ViewFlipper v_flipper;
    ImageView img_reg_madera;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualidad_madera);
        img_reg_madera=(ImageView)findViewById(R.id.img_reg_madera);

        img_reg_madera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int images[]= {R.drawable.madera1, R.drawable.madera2, R.drawable.madera3, R.drawable.madera4,
                R.drawable.madera5,R.drawable.madera6,R.drawable.madera7};

        v_flipper = findViewById(R.id.carrusel);

        //sentencia de validacion
        for(int image:images){
            flipperImages(image);
        }
    }

    public void flipperImages(int image){
        ImageView imageView = new ImageView(this);
        imageView.setBackgroundResource(image);

        v_flipper.addView(imageView);
        v_flipper.setFlipInterval(2000);
        v_flipper.setAutoStart(true);

        //animacion
        v_flipper.setInAnimation(this, android.R.anim.slide_in_left);
        v_flipper.setOutAnimation(this, android.R.anim.slide_out_right);
    }
}