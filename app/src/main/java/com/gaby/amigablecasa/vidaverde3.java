package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class vidaverde3 extends AppCompatActivity {
    ImageView img_regresarpl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidaverde3);
        ImageSlider Sliderr=findViewById(R.id.Slider2);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.p1,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.p2,"Anturio: Esta planta procesa el xileno y el tolueno y los convierte en compuestos seguros para el organismo.", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.p3,"Margaritas: Lindas y coloridas, además de darle vida a cualquier espacio ayudan a eliminar  del aire el tricloroetileno, benceno y formaldehído.", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.p4,"Hiedra: Es perfecta para eliminar el moho de cualquier ambiente, además crece muy rápido y es de bajo mantenimiento.", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.p5,"Helecho: El helecho humedece y purifica el aire. Le gusta la sombra y que lo rieguen con abundante agua.", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.p6,"Orquídea: La orquídea es perfecta para eliminar del aire el xileno, un contaminante presente en los plásticos de las computadoras y en la mayoría de los pequeños electrodomésticos que usamos en nuestro hogar.", ScaleTypes.CENTER_INSIDE));
        Sliderr.setImageList(slideModels);

        img_regresarpl=findViewById(R.id.img_regresarpl);
        img_regresarpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
}