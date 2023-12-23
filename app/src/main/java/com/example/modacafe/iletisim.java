package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class iletisim extends AppCompatActivity {

    Button iAnamenu_button;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_iletisim);

        iAnamenu_button=(Button)findViewById(R.id.iAnamenu_button);

        iAnamenu_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sayfaiki = new Intent(iletisim.this, MainActivity.class);
                finish();
                startActivity(sayfaiki);
            }
        });

    }
}