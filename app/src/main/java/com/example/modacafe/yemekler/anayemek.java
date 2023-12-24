package com.example.modacafe.yemekler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.modacafe.MainActivity;
import com.example.modacafe.R;
import com.example.modacafe.yemek;

public class anayemek extends AppCompatActivity {

    Button aymenu_button;
    Button geri15;
    ImageView pide_imageView;
    ImageView bonfile_imageView;
    ImageView somon_imageView;
    ImageView kori_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anayemek);

        aymenu_button=(Button)findViewById(R.id.aymenu_button);
        geri15=(Button)findViewById(R.id.geri15);
        pide_imageView = (ImageView)findViewById(R.id.pide_imageView);
        bonfile_imageView = (ImageView)findViewById(R.id.bonfile_imageView);
        somon_imageView = (ImageView)findViewById(R.id.somon_imageView);
        kori_imageView = (ImageView)findViewById(R.id.kori_imageView);


        aymenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(anayemek.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        geri15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(anayemek.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        pide_imageView.setImageResource(R.drawable.pide);
        bonfile_imageView.setImageResource(R.drawable.bonfile);
        somon_imageView.setImageResource(R.drawable.somon);
        kori_imageView.setImageResource(R.drawable.kori);

    }
}