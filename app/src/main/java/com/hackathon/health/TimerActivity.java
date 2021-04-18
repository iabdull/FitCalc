package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class TimerActivity extends AppCompatActivity {

    private TextView textView;
    private int timeInt;
    private CountDownTimer countDownTimer;
    private boolean timerOn;
    private String minutes,seconds;
    private long hour, min, sec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String level = bundle.getString("levelType");
        String time = bundle.getString("timeValue");

         timeInt = Integer.valueOf(time);


        TextView levelType = (TextView) findViewById(R.id.textLevel);
        levelType.setText(level);



        textView = findViewById(R.id.textView);

        textView.setText(((timeInt/3600000)%60)+":"+((timeInt/60000)%60)+":"+((timeInt/1000) % 60));

        countDownTimer =  new CountDownTimer(timeInt, 1000) {
            public void onTick(long millisUntilFinished) {
                // Used for formatting digit to be in 2 digits only
                NumberFormat f = new DecimalFormat("00");
                 hour = (millisUntilFinished / 3600000) % 24;
                 min = (millisUntilFinished / 60000) % 60;
                 sec = (millisUntilFinished / 1000) % 60;
                textView.setText(f.format(hour) + ":" + f.format(min) + ":" + f.format(sec));

            }

            @Override
            public void onFinish() {
                finish();
            }

        };

    }

    public void finish() {
        textView.setText("00:00:00");
        Intent intent1 = new Intent(this, MainActivity.class);
        startActivity(intent1);
    }

    public void startTimer(View view){
        if(timerOn==false) {
            countDownTimer.start();
            timerOn = true;
        }
    }

    public void pauseTimer(View view){


        if(timerOn==true) {
            countDownTimer.cancel();
            timerOn = false;
        }

    }


}