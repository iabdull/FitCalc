package com.hackathon.health;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.widget.TextView;


import java.util.ArrayList;

public class NetCaloriesActivity extends AppCompatActivity {


    ArrayList<Food> foods = CalorieCounterActivity.foods;
    ArrayList<Exercise> exercises = CalorieCounterActivity.exercises;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_net_calories);
        try {
            Log.d("foods", foods.get(0).toString());
        } catch (Exception e) {}

        TextView foodNames = (TextView) findViewById(R.id.textView28);
        TextView caloriesFood = (TextView) findViewById(R.id.calories);
        if(foods.size() <= 10) {
            for (int i = 0; i < foods.size(); i++) {
                if(foods.get(i).quantity == 1) {
                    foodNames.append(foods.get(i).getName());
                }
                else {
                    foodNames.append(foods.get(i).getName() + " (" + foods.get(i).getQuantity() + ")");
                }
                foodNames.append("\n");
            }

            for (int i = 0; i < foods.size(); i++) {
                caloriesFood.append("+" + Integer.toString(foods.get(i).getCaloriesConsumed()*foods.get(i).getQuantity()));
                caloriesFood.append("\n");
            }
        }
        else {
            for (int i = 0; i < 4; i++) {
                if(foods.get(i).quantity == 1) {
                    foodNames.append(foods.get(i).getName());
                }
                else {
                    foodNames.append(foods.get(i).getName() + " (" + foods.get(i).getQuantity() + ")");
                }
                foodNames.append("\n");
            }
            foodNames.append(".");
            foodNames.append("\n");
            foodNames.append(".");
            foodNames.append("\n");
            foodNames.append(".");
            foodNames.append("\n");
            for (int i = foods.size() - 3; i < foods.size(); i++) {
                if(foods.get(i).quantity == 1) {
                    foodNames.append(foods.get(i).getName());
                }
                else {
                    foodNames.append(foods.get(i).getName() + " (" + foods.get(i).getQuantity() + ")");
                }
                foodNames.append("\n");
            }

            for (int i = 0; i < 4; i++) {
                caloriesFood.append("+" + Integer.toString(foods.get(i).getCaloriesConsumed()*foods.get(i).getQuantity()));
                caloriesFood.append("\n");
            }
            caloriesFood.append(".");
            caloriesFood.append("\n");
            caloriesFood.append(".");
            caloriesFood.append("\n");
            caloriesFood.append(".");
            caloriesFood.append("\n");
            for (int i = foods.size() - 3; i < foods.size(); i++) {
                caloriesFood.append("+" + Integer.toString(foods.get(i).getCaloriesConsumed()*foods.get(i).getQuantity()));
                caloriesFood.append("\n");
            }
        }

        TextView exerciseNames = (TextView) findViewById(R.id.textView30);
        TextView caloriesExercise = (TextView) findViewById(R.id.textView31);

        if(exercises.size() <= 12) {
            for (int i = 0; i < exercises.size(); i++) {
                exerciseNames.append(exercises.get(i).getExercise());
                exerciseNames.append("\n");
            }
            for (int i = 0; i < exercises.size(); i++) {
                caloriesExercise.append("-" + Integer.toString(exercises.get(i).caloriesBurned(exercises.get(i).getExercise(),exercises.get(i).getLevelIntensity(),exercises.get(i).getReps())));
                caloriesExercise.append("\n");
            }
        }
        else {
            for (int i = 0; i < 4; i++) {
                exerciseNames.append(exercises.get(i).getExercise());
                exerciseNames.append("\n");
            }
            for (int i = 0; i < 4; i++) {
                caloriesExercise.append("-" + Integer.toString(exercises.get(i).caloriesBurned(exercises.get(i).getExercise(),exercises.get(i).getLevelIntensity(),exercises.get(i).getReps())));
                caloriesExercise.append("\n");
            }
            exerciseNames.append(".");
            exerciseNames.append("\n");
            exerciseNames.append(".");
            exerciseNames.append("\n");
            exerciseNames.append(".");
            exerciseNames.append("\n");

            caloriesExercise.append(".");
            caloriesExercise.append("\n");
            caloriesExercise.append(".");
            caloriesExercise.append("\n");
            caloriesExercise.append(".");
            caloriesExercise.append("\n");

            for (int i = exercises.size() - 5; i < exercises.size(); i++) {
                exerciseNames.append(exercises.get(i).getExercise());
                exerciseNames.append("\n");
            }
            for (int i = exercises.size() - 5; i < exercises.size(); i++) {
                caloriesExercise.append("-" + Integer.toString(exercises.get(i).caloriesBurned(exercises.get(i).getExercise(),exercises.get(i).getLevelIntensity(),exercises.get(i).getReps())));
                caloriesExercise.append("\n");
            }
        }

        TextView netCalories = (TextView) findViewById(R.id.textView32);
        int netCals = getNetCalories(foods, exercises);
        if(netCals > 0) {
            netCalories.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
            netCalories.append("+" + Integer.toString(getNetCalories(foods, exercises)));
        }
        else if (netCals < 0) {
            netCalories.setTextColor(getResources().getColor(android.R.color.holo_green_dark));
            netCalories.append(Integer.toString(getNetCalories(foods, exercises)));
        }
        else {
            netCalories.setTextColor(getResources().getColor(android.R.color.black));
            netCalories.append(Integer.toString(getNetCalories(foods, exercises)));
        }
    }

    public static int getNetCalories(ArrayList<Food> foods, ArrayList<Exercise> exercises) {
        int totalCaloriesGained = 0;
        int totalCaloriesBurned = 0;

        for (int i = 0; i < foods.size(); i++) {
            totalCaloriesGained = totalCaloriesGained + (foods.get(i).getCaloriesConsumed()*foods.get(i).getQuantity());
        }

        for (int i = 0; i < exercises.size(); i++) {
            totalCaloriesBurned += exercises.get(i).caloriesBurned(exercises.get(i).getExercise(),exercises.get(i).getLevelIntensity(),exercises.get(i).getReps());
        }

        return totalCaloriesGained - totalCaloriesBurned;
    }
}
