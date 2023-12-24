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

public class burger extends AppCompatActivity {

    Button hmenu_button;
    Button ggeri;
    ImageView cheeseburger_imageView;
    ImageView mantar_imageView;
    ImageView tburger_imageView;
    ImageView vegan_imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burger);

        hmenu_button=(Button)findViewById(R.id.hmenu_button);
        ggeri=(Button)findViewById(R.id.ggeri);
        cheeseburger_imageView = (ImageView)findViewById(R.id.cheese_imageView);
        mantar_imageView = (ImageView)findViewById(R.id.mantar_imageView);
        tburger_imageView = (ImageView)findViewById(R.id.tburger_imageView);
        vegan_imageView = (ImageView)findViewById(R.id.vegan_imageView);


        hmenu_button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(burger.this, MainActivity.class);
                finish();
                startActivity(intent);
            }
        });

        ggeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(burger.this, yemek.class);
                finish();
                startActivity(intent);
            }
        });

        cheeseburger_imageView.setImageResource(R.drawable.cheeseburger);
        mantar_imageView.setImageResource(R.drawable.mushroom);
        tburger_imageView.setImageResource(R.drawable.tavukburger);
        vegan_imageView.setImageResource(R.drawable.veganburger);

    }
}