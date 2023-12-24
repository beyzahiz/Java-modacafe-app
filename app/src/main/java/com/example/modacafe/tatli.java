package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.modacafe.yemekler.baslangic;

public class tatli extends AppCompatActivity {

    Button tmenu_button;
    Button back;
    ImageView limon_imageView;
    ImageView pasta_imageView;
    ImageView brovni_imageView;
    ImageView sufle_imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);
        setContentView(R.layout.activity_yemek);

        tmenu_button=(Button)findViewById(R.id.tmenu_button);
        back=(Button)findViewById(R.id.back);
        limon_imageView= (ImageView)findViewById(R.id.limon_imageView);
        pasta_imageView = (ImageView)findViewById(R.id.pasta_imageView);
        brovni_imageView = (ImageView)findViewById(R.id.brovni_imageView);
        sufle_imageView = (ImageView)findViewById(R.id.sufle_imageView);


        tmenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(tatli.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(tatli.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        limon_imageView.setImageResource(R.drawable.limon);
        brovni_imageView.setImageResource(R.drawable.brovni);
        pasta_imageView.setImageResource(R.drawable.pasta);
        sufle_imageView.setImageResource(R.drawable.sufle);

    }
}