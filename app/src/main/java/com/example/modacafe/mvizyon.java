package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mvizyon extends AppCompatActivity {

    Button mvAnamenu_button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mvizyon);

        mvAnamenu_button=(Button)findViewById(R.id.mvAnamenu_button);

        mvAnamenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(mvizyon.this, MainActivity.class);
                finish();
                startActivity(sayfaiki);
            }
        });

    }
}