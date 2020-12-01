package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuConsejos extends AppCompatActivity {
    ImageView img_regresar, img_wc, img_cocina, img_lluvia, img_lavado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_consejos);
        img_regresar=findViewById(R.id.img_regresar);
        img_wc=findViewById(R.id.img_wc);
        img_lluvia=findViewById(R.id.img_lluvia);
        img_lavado=findViewById(R.id.img_lavado);
        img_cocina=findViewById(R.id.img_cocina);
        img_regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
        img_wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Consejo_wc.class);
                startActivity(i);
            }
        });
        img_lavado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Consejo_lavado.class);
                startActivity(i);
            }
        });
        img_lluvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Consejo_lluvia.class);
                startActivity(i);
            }
        });
        img_cocina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getBaseContext(), Consejo_cocina.class);
                startActivity(i);
            }
        });
    }
}