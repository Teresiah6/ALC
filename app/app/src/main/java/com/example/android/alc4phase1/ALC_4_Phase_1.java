package com.example.android.alc4phase1;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


import java.util.Objects;

public class ALC_4_Phase_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_4__phase_1);




            Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
            getSupportActionBar(). setElevation(0);
            getSupportActionBar().setHomeButtonEnabled(true);


        Button myProfile = findViewById(R.id.myProfile_btn);
        Button aboutALC = findViewById(R.id.btn_about);
        myProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ALC_4_Phase_1.this,myProfile.class);
                startActivity(intent);
            }
        });

        aboutALC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ALC_4_Phase_1.this, About_ALC.class);
                 startActivity(intent);
            }
        });
    }

}
