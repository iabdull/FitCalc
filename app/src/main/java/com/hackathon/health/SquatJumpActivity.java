package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class SquatJumpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squat_jump);
    }

    public void toLevelOneActivity(View view){
        Intent intent = new Intent(this, TimerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("levelType", "Level 1");
        bundle.putString("timeValue", "30000");
        intent.putExtras(bundle);
        startActivity(intent);
        Exercise e = new Exercise("Squat Jumps", 1, 10);
        CalorieCounterActivity.exercises.add(e);
    }

    public void toLevelTwoActivity(View view){
        Intent intent = new Intent(this, TimerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("levelType", "Level 2");
        bundle.putString("timeValue", "60000");
        intent.putExtras(bundle);
        startActivity(intent);
        Exercise e = new Exercise("Squat Jumps", 2, 10);
        CalorieCounterActivity.exercises.add(e);
    }

    public void toLevelThreeActivity(View view){
        Intent intent = new Intent(this, TimerActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("levelType", "Level 3");
        bundle.putString("timeValue", "90000");
        intent.putExtras(bundle);
        startActivity(intent);
        Exercise e = new Exercise("Squat Jumps", 3, 10);
        CalorieCounterActivity.exercises.add(e);
    }
}