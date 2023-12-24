package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class soguk extends AppCompatActivity {

    ImageView frozen_imageView;
    ImageView skahve_imageView;
    ImageView mesrubat_imageView;
    ImageView msuyu_imageView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soguk);

        frozen_imageView = (ImageView)findViewById(R.id.frozen_imageView);
        skahve_imageView = (ImageView)findViewById(R.id.skahve_imageView);
        mesrubat_imageView = (ImageView)findViewById(R.id.mesrubat_imageView);
        msuyu_imageView = (ImageView)findViewById(R.id.msuyu_imageView);

        Button ana_button4;
        Button geri2;
        ana_button4 = findViewById(R.id.ana_button6);
        geri2 = findViewById(R.id.geri10);
        ana_button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(soguk.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });

        geri2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent bironceyedon = new Intent(soguk.this, MainActivity2.class);
                finish();
                startActivity(bironceyedon);
            }
        });

        frozen_imageView.setImageResource(R.drawable.frozen);
        skahve_imageView.setImageResource(R.drawable.skahve);
        mesrubat_imageView.setImageResource(R.drawable.mesrubat);
        msuyu_imageView.setImageResource(R.drawable.msuyu);

    }
}
