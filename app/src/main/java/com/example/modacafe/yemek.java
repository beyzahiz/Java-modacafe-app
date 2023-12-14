package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class yemek extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek);
        Button ana_button6;
        ana_button6 = findViewById(R.id.ana_button6);
        ana_button6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(yemek.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });
    }
}