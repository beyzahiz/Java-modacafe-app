package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hakkimizda extends AppCompatActivity {

    Button ana_button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_hakkimizda);

        ana_button2 = findViewById(R.id.ana_button2);
            ana_button2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    Intent anamenuyedon = new Intent(hakkimizda.this, MainActivity.class);
                    finish();
                    startActivity(anamenuyedon);
                }
            });

    }
}