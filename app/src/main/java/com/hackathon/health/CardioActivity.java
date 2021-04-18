package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CardioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardio);
    }

    public void toJumpRopeActivity(View view){
        Intent intent = new Intent(this, JumpRopeActivity.class);
        startActivity(intent);
    }

    public void toJogInPlaceActivity(View view){
        Intent intent = new Intent(this, JogInPlaceActivity.class);
        startActivity(intent);
    }

    public void toJumpingJacksActivity(View view){
        Intent intent = new Intent(this, JumpingJacksActivity.class);
        startActivity(intent);
    }

    public void toSquatJumpActivity(View view){
        Intent intent = new Intent(this, SquatJumpActivity.class);
        startActivity(intent);
    }

    public void toStairClimbActivity(View view){
        Intent intent = new Intent(this, StairClimbActivity.class);
        startActivity(intent);
    }

    public void toMountainClimbersActivity(View view){
        Intent intent = new Intent(this, MountainClimbersActivity.class);
        startActivity(intent);
    }


}