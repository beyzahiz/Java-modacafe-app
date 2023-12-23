package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class subeler extends AppCompatActivity {

    Button sAnamenu_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subeler);

        sAnamenu_button=(Button)findViewById(R.id.sAnamenu_button);

        sAnamenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(subeler.this, MainActivity.class);
                finish();
                startActivity(sayfaiki);
            }
        });
    }
}