package com.gaby.amigablecasa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class vidaverde2 extends AppCompatActivity {
    ImageView img_regresarsq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vidaverde2);
        ImageSlider Sliderr=findViewById(R.id.Sliderr);

        List<SlideModel> slideModels=new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.s1,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.s2,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.s3,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.s4,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.s6,"", ScaleTypes.CENTER_INSIDE));
        slideModels.add(new SlideModel(R.drawable.s7,"", ScaleTypes.CENTER_INSIDE));
        Sliderr.setImageList(slideModels);

        img_regresarsq=findViewById(R.id.img_regresarsq);
        img_regresarsq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

    }
}