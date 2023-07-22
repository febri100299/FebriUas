package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class DetailActivity3 extends AppCompatActivity {
    ImageView BackBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail3);
        BackBtn = findViewById(R.id.backBtn);
    }

    public void handleExplicit(View view) {
            Intent Explicit= new Intent(this,
                    IntroActivity.class);
            startActivity(Explicit);

    }
}