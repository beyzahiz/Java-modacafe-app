package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.modacafe.yemekler.baslangic;

public class MainActivity2 extends AppCompatActivity {

    Button ana_button;
    Button sicak;
    Button soguk;
    Button yemek;
    Button tatli_button;

    Button geri1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ana_button = findViewById(R.id.ana_button);
        sicak = findViewById(R.id.sicak);
        soguk = findViewById(R.id.soguk);
        yemek = findViewById(R.id.yemek);
        tatli_button = findViewById(R.id.tatli_button);
        geri1 = findViewById(R.id.geri10);


        ana_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(anamenuyedon);
                finish();
            }
        });


        sicak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ikincibuttonIntent = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(ikincibuttonIntent);
                finish();
            }
        });

        soguk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add the code to navigate to the third page (MainActivity3)
                Intent sogugagec = new Intent(MainActivity2.this, soguk.class);
                startActivity(sogugagec);
                finish();
            }
        });

        yemek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemegegec = new Intent(MainActivity2.this, com.example.modacafe.yemek.class);
                startActivity(yemegegec);
                finish();
            }
        });

        tatli_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity2.this, tatli.class);
                finish();
                startActivity(intent);
            }
        });

        geri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bironceyegec = new Intent(MainActivity2.this, MainActivity.class);
                startActivity(bironceyegec);
                finish();
            }
        });



    }
}
