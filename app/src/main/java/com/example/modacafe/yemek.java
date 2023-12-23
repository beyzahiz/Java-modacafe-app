package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.modacafe.yemekler.anayemek;
import com.example.modacafe.yemekler.baslangic;
import com.example.modacafe.yemekler.burger;
import com.example.modacafe.yemekler.makarna;
import com.example.modacafe.yemekler.pizza;
import com.example.modacafe.yemekler.salata;

public class yemek extends AppCompatActivity {

    Button ana_button6;
    Button baslangic_button;
    Button salata_button;
    Button burger_button;
    Button makarna_button;
    Button pizza_button;
    Button anayemek_button;
    Button geri2;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);

        ana_button6 = findViewById(R.id.ana_button6);
        baslangic_button=(Button)findViewById(R.id.baslangic_button);
        salata_button=(Button)findViewById(R.id.salata_button);
        burger_button=(Button)findViewById(R.id.burger_button);
        makarna_button=(Button)findViewById(R.id.makarna_button);
        pizza_button=(Button)findViewById(R.id.pizza_button);
        anayemek_button=(Button)findViewById(R.id.anayemek_button);
        geri2=(Button)findViewById(R.id.geri10);



        ana_button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(yemek.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });

        geri2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, MainActivity2.class);
                finish();
                startActivity(intent);
            }
        });

        baslangic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, baslangic.class);
                finish();
                startActivity(intent);
            }
        });

        salata_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, salata.class);
                finish();
                startActivity(intent);
            }
        });

        burger_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, burger.class);
                finish();
                startActivity(intent);
            }
        });

        makarna_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, makarna.class);
                finish();
                startActivity(intent);
            }
        });

        pizza_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, pizza.class);
                finish();
                startActivity(intent);
            }
        });

        anayemek_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(yemek.this, anayemek.class);
                finish();
                startActivity(intent);
            }
        });

    }
}