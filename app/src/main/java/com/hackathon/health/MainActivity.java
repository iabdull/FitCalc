package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toCardioActivity(View view){
        Intent intent = new Intent(this, CardioActivity.class);
        startActivity(intent);
    }
    public void toStretchingActivity(View view){
        Intent intent = new Intent(this, StretchingActivity.class);
        startActivity(intent);

    }

    public void toStrengthActivity(View view){
        Intent intent = new Intent(this, StrengthActivity.class);
        startActivity(intent);
    }

    public void toCalisthenicsActivity(View view){
        Intent intent = new Intent(this, CalisthenticsActivity.class);
        startActivity(intent);
    }

    public void toCalorieCounterActivity(View view){
        Intent intent = new Intent(this, CalorieCounterActivity.class);
        startActivity(intent);
    }

}