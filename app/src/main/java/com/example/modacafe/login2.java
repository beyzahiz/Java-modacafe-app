package com.example.modacafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login2 extends AppCompatActivity {

    EditText user, pass;
    Button login, cancel;
    Context context = this;

    Button geri10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);

        user = findViewById(R.id.Kullanici);
        pass = findViewById(R.id.Sifre);
        login = findViewById(R.id.Gonder1);
        cancel = findViewById(R.id.Temizle1);
        geri10 = findViewById(R.id.geri10);

        geri10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bironceyegit = new Intent(login2.this, MainActivity.class);
                finish();
                startActivity(bironceyegit);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (user.getText().toString().equalsIgnoreCase("admin") && pass.getText().toString().equals("1234")) {
                    Toast.makeText(context, "Giriş başarılı", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(context, "Tekrar deneyin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                user.setText("");
                pass.setText("");
            }
        });

    }
}
