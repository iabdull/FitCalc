package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalisthenticsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calisthentics);
    }
    public void toLungesActivity(View view){
        Intent intent = new Intent(this, LungesActivity.class);
        startActivity(intent);
    }

    public void toSitupsActivity(View view){
        Intent intent = new Intent(this, SitupsCalActivity.class);
        startActivity(intent);
    }

    public void toSquatsActivity(View view){
        Intent intent = new Intent(this, SquatsCalActivity.class);
        startActivity(intent);
    }

    public void toPlankActivity(View view){
        Intent intent = new Intent(this, PlankCalActivity.class);
        startActivity(intent);
    }

    public void toBurpeesActivity(View view){
        Intent intent = new Intent(this, BurpeesActivity.class);
        startActivity(intent);
    }

    public void toPullupsActivity(View view){
        Intent intent = new Intent(this, PullupsActivity.class);
        startActivity(intent);
    }
}