package com.example.android.alc4phase1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class myProfile extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
