package com.hackathon.health;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import java.lang.reflect.Array;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.lang.reflect.Array;
import java.util.ArrayList;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalorieCounterActivity extends AppCompatActivity {

    int quantity = 0;
    static ArrayList<Food> foods = new ArrayList<Food>();
    static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_counter);


        TextView textView = (TextView) findViewById(R.id.editTextTextMultiLine);
        textView.setText("You entered " + quantity + " food(s) so far.");

        next = (Button) findViewById(R.id.button4);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goNext();
            }
        });
    }

    public void handleText(View v) {
        TextView t = findViewById(R.id.editTextTextPersonName2);
        TextView textview = findViewById(R.id.editTextNumber);
        TextView text = findViewById(R.id.editTextNumber2);
        String nameInput = t.getText().toString();
        String numberInput = textview.getText().toString();
        String quantityInput = text.getText().toString();
        Log.d("Name", nameInput);
        Log.d("Calories", numberInput);
        Log.d("Quantity", quantityInput);
        try {
            Food newFood = new Food(nameInput, Integer.valueOf(numberInput), Integer.valueOf(quantityInput));
            foods.add(newFood);
            quantity += newFood.getQuantity();
            TextView textView = (TextView) findViewById(R.id.editTextTextMultiLine);
            textView.setText("You entered " + quantity + " food(s) so far.");


        } catch (Exception e) {
        }

    }

    public void goNext() {
        Intent intent = new Intent(this, NetCaloriesActivity.class);
        startActivity(intent);
    }
}