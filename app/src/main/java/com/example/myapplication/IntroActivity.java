package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


public class IntroActivity extends AppCompatActivity {

    private ImageView btnPopM;
    private ImageView btnPop2;
    private ImageView btnPOp3;
    private ImageView btnPOp4;
    private ImageView btnPOp5;
    private ImageView btnReko;

    private TextView btnMountain;
    private TextView btnBeach;
    private TextView btnWaduk;
    private TextView btnGoa;

    private TextView btnMonument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        btnPopM = findViewById(R.id.btnPopM);
        btnPop2 = findViewById(R.id.btnPop2);
        btnPOp3 = findViewById(R.id.btnPop3);
        btnPOp4 = findViewById(R.id.btnPop4);
        btnPOp5 = findViewById(R.id.btnPop5);
        btnReko = findViewById(R.id.btnRek);
        btnMountain = findViewById(R.id.btnmountain);
        btnBeach = findViewById(R.id.btnbeach);
        btnWaduk = findViewById(R.id.btnwaduk);
        btnGoa = findViewById(R.id.btngoa);
        btnMonument = findViewById(R.id.btnmonument);


        btnMonument.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, MonumentActivity.class);
                startActivity(intent);
            }
        });


        btnGoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, GoaActivity.class);
                startActivity(intent);
            }
        });


        btnWaduk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, WadukActivity.class);
                startActivity(intent);
            }
        });



        btnBeach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, BeachActivity.class);
                startActivity(intent);
            }
        });


        btnMountain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, MountainAcivity.class);
                startActivity(intent);
            }
        });


        btnReko.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, RekomActivity.class);
                startActivity(intent);
            }
        });



        btnPopM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, DetailActivity.class);
                startActivity(intent);
            }
        });

        btnPop2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, DetailActivity2.class);
                startActivity(intent);
            }
        });

        btnPOp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, DetailActivity3.class);
                startActivity(intent);
            }
        });

        btnPOp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, DetailActivity4.class);
                startActivity(intent);
            }
        });

        btnPOp5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(IntroActivity.this, DetailActivity5.class);
                startActivity(intent);
            }
        });




    }
    }