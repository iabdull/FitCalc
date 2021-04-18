package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class StrengthActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strength);
    }
    public void toPushupsActivity(View view){
        Intent intent = new Intent(this, PushupsActivity.class);
        startActivity(intent);
    }

    public void toSitupsActivity(View view){
        Intent intent = new Intent(this, SitupsActivity.class);
        startActivity(intent);
    }

    public void toSquatsActivity(View view){
        Intent intent = new Intent(this, SquatsActivity.class);
        startActivity(intent);
    }

    public void toPlankActivity(View view){
        Intent intent = new Intent(this, PlankActivity.class);
        startActivity(intent);
    }

    public void toBicepsCurlActivity(View view){
        Intent intent = new Intent(this, BicepsCurlActivity.class);
        startActivity(intent);
    }

    public void toDeadLiftActivity(View view){
        Intent intent = new Intent(this, DeadliftActivity.class);
        startActivity(intent);
    }
}