package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
            Button ana_button3;
            ana_button3 = findViewById(R.id.ana_button3);
            ana_button3.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent anamenuyedon = new Intent(MainActivity3.this, MainActivity.class);
                    finish();
                    startActivity(anamenuyedon);
                }
            });
        }
    }
