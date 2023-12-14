package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tatli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tatli);
        setContentView(R.layout.activity_yemek);
        Button ana_button5;
        ana_button5 = findViewById(R.id.ana_button6);
        ana_button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent anamenuyedon = new Intent(tatli.this, MainActivity.class);
                finish();
                startActivity(anamenuyedon);
            }
        });
    }
}