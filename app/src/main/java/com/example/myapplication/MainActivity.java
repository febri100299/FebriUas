package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.myapplication.R;

public class MainActivity extends AppCompatActivity {

    ImageView BtnIntro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BtnIntro=findViewById(R.id.btnIntro);
    }

    public void handleExplicit(View view) {
        Intent Explicit= new Intent(this,
                IntroActivity.class);
                startActivity(Explicit);
    }
}