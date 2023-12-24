package com.example.modacafe.yemekler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.modacafe.MainActivity;
import com.example.modacafe.R;
import com.example.modacafe.yemek;

public class makarna extends AppCompatActivity {

    Button mmenu_button;
    Button geri_button;
    ImageView manti_imageView;
    ImageView penne_imageView;
    ImageView peynir_imageView;
    ImageView spaghetti_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_makarna);

        mmenu_button=(Button)findViewById(R.id.mmenu_button);
        geri_button=(Button)findViewById(R.id.geri_button);
        manti_imageView = (ImageView)findViewById(R.id.manti_imageView);
        penne_imageView = (ImageView)findViewById(R.id.penne_imageView);
        peynir_imageView = (ImageView)findViewById(R.id.peynir_imageView);
        spaghetti_imageView = (ImageView)findViewById(R.id.spaghetti_imageView);

        mmenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(makarna.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        geri_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(makarna.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        manti_imageView.setImageResource(R.drawable.manti);
        penne_imageView.setImageResource(R.drawable.penne);
        peynir_imageView.setImageResource(R.drawable.peynirli);
        spaghetti_imageView.setImageResource(R.drawable.spaghetti);

    }
}