package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ViewFlipper;

public class manualidad_papel extends AppCompatActivity {
    ViewFlipper v_flipper;
    ImageView img_reg_papel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manualidad_papel);

        img_reg_papel=(ImageView)findViewById(R.id.img_reg_papel);

        img_reg_papel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        int images[]= {R.drawable.papel, R.drawable.papel1, R.drawable.papel2, R.drawable.papel3,
                R.drawable.papel4,R.drawable.papel5, R.drawable.papel6,R.drawable.papel7};

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