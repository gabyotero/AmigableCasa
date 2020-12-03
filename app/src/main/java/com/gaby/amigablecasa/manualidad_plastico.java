package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class manualidad_plastico extends AppCompatActivity {
    ViewFlipper v_flipper;
    ImageView img_reg_plastico;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualidad_plastico);

        img_reg_plastico=(ImageView)findViewById(R.id.img_reg_plastico);

        img_reg_plastico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int images[]= {R.drawable.plastico1, R.drawable.plastico2, R.drawable.plastico3, R.drawable.plastico4,
                R.drawable.plastico5,R.drawable.plastico6, R.drawable.plastico7,R.drawable.plastico8};

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