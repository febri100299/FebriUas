package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity2 extends AppCompatActivity {

    ImageView backBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail2);

        backBtn = findViewById(R.id.backBtn);
    }

    public void handleExplicit(View view) {
        Intent Explicit= new Intent(this,
                IntroActivity.class);
        startActivity(Explicit);
    }
}