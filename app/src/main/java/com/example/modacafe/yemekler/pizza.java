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

public class pizza extends AppCompatActivity {

    Button pmenu_button;
    Button gerib;
    ImageView sucuk_imageView;
    ImageView sebze_imageView;
    ImageView karisik_imageView;
    ImageView dort_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        pmenu_button=(Button)findViewById(R.id.pmenu_button);
        gerib=(Button)findViewById(R.id.gerib);
        sucuk_imageView= (ImageView)findViewById(R.id.sucuk_imageView);
        sebze_imageView = (ImageView)findViewById(R.id.sebze_imageView);
        karisik_imageView = (ImageView)findViewById(R.id.karisik_imageView);
        dort_imageView= (ImageView)findViewById(R.id.dort_imageView);


        pmenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(pizza.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        gerib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(pizza.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        sucuk_imageView.setImageResource(R.drawable.sucuklu);
        sebze_imageView.setImageResource(R.drawable.sebzeli);
        karisik_imageView.setImageResource(R.drawable.karisik);
        dort_imageView.setImageResource(R.drawable.dort);

    }
}