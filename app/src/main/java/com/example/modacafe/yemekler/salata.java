package com.example.modacafe.yemekler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.modacafe.R;
import com.example.modacafe.yemek;

public class salata extends AppCompatActivity {

    Button geri2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salata);

        geri2 = findViewById(R.id.geri10);


        geri2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(salata.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });
    }
}