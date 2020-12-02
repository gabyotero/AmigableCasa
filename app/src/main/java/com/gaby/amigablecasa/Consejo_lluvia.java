package com.gaby.amigablecasa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;

public class Consejo_lluvia extends AppCompatActivity {
    ImageView img_recolectar,img_regresarlluvia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consejo_lluvia);
        img_recolectar=findViewById(R.id.img_recolectar);
        img_regresarlluvia=findViewById(R.id.img_regresarlluvia);
        img_recolectar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder=new AlertDialog.Builder(Consejo_lluvia.this);
                builder.setMessage("Al iniciar la lluvia, reúne todos los recipientes en los que recolectarás el agua; espera entre 10 o 15 minutos de que haya iniciado la lluvia y colócalos en diferentes partes. Lo recomendable es que esperes este tiempo, ya que así evitarás que los contaminantes caigan y el agua esté sucia.");
                builder.setTitle("Recolectando agua de lluvia");
                //builder.setIcon(R.drawable.aguawc);
                //builder.setView(R.drawable.basura);
                AlertDialog dialog=builder.create();
                dialog.show();

            }
        });
        img_regresarlluvia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}