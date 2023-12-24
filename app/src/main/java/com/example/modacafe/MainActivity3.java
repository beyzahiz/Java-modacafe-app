package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {

    ImageView tkahve_imageView;
    ImageView latte_imageView;
    ImageView cay_imageView;
    ImageView salep_imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        tkahve_imageView = (ImageView)findViewById(R.id.tkahve_imageView);
        latte_imageView= (ImageView)findViewById(R.id.latte_imageView);
        cay_imageView = (ImageView)findViewById(R.id.cay_imageView);
        salep_imageView = (ImageView)findViewById(R.id.salep_imageView);

            Button ana_button3;
            Button geri2;
            ana_button3 = findViewById(R.id.ana_button3);
            geri2 = findViewById(R.id.geri10);
            ana_button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent anamenuyedon = new Intent(MainActivity3.this, MainActivity.class);
                    finish();
                    startActivity(anamenuyedon);
                }
            });

        geri2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent birgeriyedon = new Intent(MainActivity3.this, MainActivity2.class);
                finish();
                startActivity(birgeriyedon);
            }
        });

        tkahve_imageView.setImageResource(R.drawable.tkahve);
        latte_imageView.setImageResource(R.drawable.latte);
        cay_imageView.setImageResource(R.drawable.cay);
        salep_imageView.setImageResource(R.drawable.salep);

        }
    }
