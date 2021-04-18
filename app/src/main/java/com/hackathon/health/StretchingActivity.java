package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StretchingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stretching);
    }

    public void toCalfStretchActivity(View view){
        Intent intent = new Intent(this, CalfStretchActivity.class);
        startActivity(intent);
    }

    public void toButterflyStretchActivity(View view){
        Intent intent = new Intent(this, ButterflyStretchActivity.class);
        startActivity(intent);
    }

    public void toSidewaysNeckStretchActivity(View view){
        Intent intent = new Intent(this, SidewaysNeckStretchActivity.class);
        startActivity(intent);
    }

    public void toStandingHamstringStretchActivity(View view){
        Intent intent = new Intent(this, StandingHamstringStretchActivity.class);
        startActivity(intent);
    }

    public void toSeatedShoulderSqueezeActivity(View view){
        Intent intent = new Intent(this, SeatedShoulderSqueezeActivity.class);
        startActivity(intent);
    }

    public void toTricepsStretchActivity(View view){
        Intent intent = new Intent(this, TricepsStretchActivity.class);
        startActivity(intent);
    }
}