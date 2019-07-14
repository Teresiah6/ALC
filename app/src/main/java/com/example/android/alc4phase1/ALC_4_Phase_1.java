package com.example.android.alc4phase1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URI;
import java.net.URL;

public class ALC_4_Phase_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alc_4__phase_1);


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
