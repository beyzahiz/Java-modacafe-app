package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    Button ana_button;
    Button sicak;
    Button soguk;
    Button yemek;
    Button tatli;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ana_button = findViewById(R.id.ana_button);
        sicak = findViewById(R.id.sicak);
        soguk = findViewById(R.id.soguk);
        yemek = findViewById(R.id.yemek);
        tatli = findViewById(R.id.tatli);

        ana_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(MainActivity2.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });


        sicak.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent ikincibuttonIntent = new Intent(MainActivity2.this, MainActivity3.class);
                finish();
                startActivity(ikincibuttonIntent);
            }
        });

        soguk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Add the code to navigate to the third page (MainActivity3)
                Intent sogugagec = new Intent(MainActivity2.this, MainActivity3.class);
                finish();
                startActivity(sogugagec);
            }
        });

        yemek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent yemegegec = new Intent(MainActivity2.this, yemek.class);
                finish();
                startActivity(yemegegec);
            }
        });

        tatli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent tatliyagec = new Intent(MainActivity2.this, tatli.class);
                finish();
                startActivity(tatliyagec);
            }
        });
    }
}
