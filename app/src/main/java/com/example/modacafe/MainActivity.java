package com.example.modacafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.modacafe.login.loginActivity;

public class MainActivity extends AppCompatActivity {

    Button menu_button;
    Button hakkimizda_button;
    Button mvizyon_button;
    Button subeler_button;
    Button iletisim_button;
    Button internet_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        menu_button = findViewById(R.id.menu_button);
        hakkimizda_button = findViewById(R.id.hakkimizda_button);
        mvizyon_button =(Button)findViewById(R.id.mvizyon_button);
        subeler_button=(Button)findViewById(R.id.subeler_button);
        iletisim_button=(Button)findViewById(R.id.iletisim_button);
       internet_button = findViewById(R.id.internet_button);

        menu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this, MainActivity2.class);
                finish();
                startActivity(sayfaiki);
            }
        });

        hakkimizda_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this, hakkimizda.class);
                finish();
                startActivity(sayfaiki);
            }
        });

        mvizyon_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this, mvizyon.class);
                finish();
                startActivity(sayfaiki);
            }
        });

        subeler_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this, subeler.class);
                finish();
                startActivity(sayfaiki);
            }
        });

        iletisim_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(MainActivity.this, iletisim.class);
                finish();
                startActivity(sayfaiki);
            }
        });

        internet_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginegit = new Intent(MainActivity.this, login2.class);
                finish();
                startActivity(loginegit);
            }
        });

    }
}




