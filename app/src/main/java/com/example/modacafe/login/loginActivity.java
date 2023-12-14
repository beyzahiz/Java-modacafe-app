package com.example.modacafe.login;
import com.example.modacafe.R;


import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class loginActivity {


    public class MainActivity extends AppCompatActivity {

        EditText user, pass;
        Button login, cancel;
        Context context = this;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.login);

            user = findViewById(R.id.Kullanici);
            pass = findViewById(R.id.Sifre);
            login = findViewById(R.id.Gonder1);
            cancel = findViewById(R.id.Temizle1);

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
}
