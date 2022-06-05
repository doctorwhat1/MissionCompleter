package com.example.testjava.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testjava.MainActivity;
import com.example.testjava.R;

public class LoginActivity extends AppCompatActivity {
    //public Button loginbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button loginBTN = (Button)findViewById(R.id.loginBTN);
        Button registryBTN = (Button)findViewById(R.id.registryBTN);

        loginBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });

        registryBTN.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(LoginActivity.this, RegistryActivity.class);
                startActivity(intent2);
            }
        });
    }


}