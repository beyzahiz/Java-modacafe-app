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

public class baslangic extends AppCompatActivity {


    Button bmenu_button;
    Button geri2;
    ImageView corba_imageView;
    ImageView sarma_imageView;
    ImageView bt_imageView;
    ImageView pk_imageView;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baslangic);


        bmenu_button=(Button)findViewById(R.id.bmenu_button2);
        geri2=(Button)findViewById(R.id.geri10);
        corba_imageView = (ImageView)findViewById(R.id.corba_imageView);
        sarma_imageView = (ImageView)findViewById(R.id.sarma_imageView);
        pk_imageView = (ImageView)findViewById(R.id.pk_imageView);
        bt_imageView = (ImageView)findViewById(R.id.bt_imageView);


        bmenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(baslangic.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

       geri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(baslangic.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        corba_imageView.setImageResource(R.drawable.corba);
        sarma_imageView.setImageResource(R.drawable.sarma);
        pk_imageView.setImageResource(R.drawable.patates);
        bt_imageView.setImageResource(R.drawable.tavuk);

    }
}