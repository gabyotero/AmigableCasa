package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class idea_botes extends AppCompatActivity {
    ViewFlipper v_flipper;
    ImageView img_reg_carrusel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_idea_botes);
        img_reg_carrusel=(ImageView)findViewById(R.id.img_reg_carrusel);

        img_reg_carrusel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int images[]= {R.drawable.bote1, R.drawable.bote2, R.drawable.bote3, R.drawable.bote4, R.drawable.bote5,
                R.drawable.bote6,R.drawable.bote7, R.drawable.bote8,R.drawable.bote9, R.drawable.bote10};

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