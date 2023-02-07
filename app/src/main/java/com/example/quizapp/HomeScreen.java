package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class HomeScreen extends AppCompatActivity {

    ImageView addIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        addIcon = findViewById(R.id.addIcon);
        addIcon.setOnClickListener(v -> {
            Intent intent = new Intent(HomeScreen.this, AddGrade.class);
            startActivity(intent);
        });


    }
}