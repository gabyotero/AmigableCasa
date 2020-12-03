package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class avance_basura extends AppCompatActivity {
    EditText edt_r1, edt_r2, edt_r3, edt_r4, edt_r5;
    TextView tv_p1, tv_p2, tv_p3, tv_p4, tv_p5;
    Button  enviar;
    LinearLayout layout_p1, layout_p2, layout_p3, layout_p4, layout_p5;
    ImageView img_reg_avance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_avance_basura);
        img_reg_avance=(ImageView)findViewById(R.id.img_reg_avance);

        img_reg_avance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        //EditTexts
        edt_r1=(EditText) findViewById(R.id.edt_r1);
        edt_r2=(EditText) findViewById(R.id.edt_r2);
        edt_r3=(EditText) findViewById(R.id.edt_r3);
        edt_r4=(EditText) findViewById(R.id.edt_r4);
        edt_r5=(EditText) findViewById(R.id.edt_r5);

        //TextViews
        tv_p1=(TextView) findViewById(R.id.tv_p1);
        tv_p2=(TextView) findViewById(R.id.tv_p2);
        tv_p3=(TextView) findViewById(R.id.tv_p3);
        tv_p4=(TextView) findViewById(R.id.tv_p4);
        tv_p5=(TextView) findViewById(R.id.tv_p5);

        //Layouts
        layout_p1=findViewById(R.id.layout_p1);
        layout_p2=findViewById(R.id.layout_p2);
        layout_p3=findViewById(R.id.layout_p3);
        layout_p4=findViewById(R.id.layout_p4);
        layout_p5=findViewById(R.id.layout_p5);

        //Buttons
        enviar=(Button) findViewById(R.id.enviar);
    }
}