package com.example.testjava.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.testjava.MainActivity;
import com.example.testjava.R;

public class RegistryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registry);


        Button createAccountBTN = (Button)findViewById(R.id.createAccountBTN);

        createAccountBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(RegistryActivity.this, MainActivity.class);
                startActivity(intent1);
            }
        });
    }
}