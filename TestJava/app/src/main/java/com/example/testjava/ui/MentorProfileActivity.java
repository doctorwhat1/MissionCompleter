package com.example.testjava.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.testjava.R;

public class MentorProfileActivity extends AppCompatActivity {

    ImageView mainImageView;
    TextView title, description, category;

    String data1,data2,data3;
    int myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor_profile);

        mainImageView = findViewById(R.id.myImageView);
        title = findViewById(R.id.title);
        description  = findViewById(R.id.description);
        category = findViewById(R.id.category);

        getData();
        setData();
    }

    private void getData(){
        data1 = getIntent().getStringExtra("data1");
        data2 = getIntent().getStringExtra("data2");
        data3 = getIntent().getStringExtra("data3");
        // myImage = R.drawable.person_100;
    }
    private void setData(){
        title.setText(data1);
        description.setText(data2);
        category.setText(data3);
        //mainImageView.setImageResource(R.drawable.person_100);
    }
}