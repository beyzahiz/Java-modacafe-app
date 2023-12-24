package com.example.modacafe.yemekler;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.modacafe.MainActivity;
import com.example.modacafe.R;
import com.example.modacafe.yemek;

public class salata extends AppCompatActivity {

    Button geri2;
    Button bmenu_button2;

    ImageView akdeniz_imageView;
    ImageView sezar_imageView;
    ImageView tavuklu_imageView;
    ImageView tonbalik_imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salata);

        geri2 = findViewById(R.id.geri10);
        bmenu_button2=(Button)findViewById(R.id.bmenu_button2);
        akdeniz_imageView= (ImageView)findViewById(R.id.akdeniz_imageView);
        sezar_imageView = (ImageView)findViewById(R.id.sezar_imageView);
        tavuklu_imageView= (ImageView)findViewById(R.id.tavuklu_imageView);
        tonbalik_imageView= (ImageView)findViewById(R.id.tonbalik_imageView);


        geri2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(salata.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        bmenu_button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(salata.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        akdeniz_imageView.setImageResource(R.drawable.akdeniz);
        sezar_imageView.setImageResource(R.drawable.sezar);
        tavuklu_imageView.setImageResource(R.drawable.tavuklu);
        tonbalik_imageView.setImageResource(R.drawable.tonbalik);

    }
}