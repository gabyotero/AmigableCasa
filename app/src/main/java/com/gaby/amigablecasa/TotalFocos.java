package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TotalFocos extends AppCompatActivity {

    EditText EditText_R;
    Button btn_totalf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total_focos);

        btn_totalf = (Button) findViewById(R.id.btn_totalf);
        //EditTexts
        EditText_R=(EditText) findViewById(R.id.EditText_R);

    }


    public void Enviar(View view) {
        new Restful(this, "enviar",
                EditText_R.getText().toString()).execute();
    }
    public void formOk(){
        mensaje("Tu registro ha sido guardado");
        Intent i = new Intent(this,MenuPrincipal.class);
        startActivity(i);      //Abrir una actividad nueva
    }
    public void mensaje(String s){
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}