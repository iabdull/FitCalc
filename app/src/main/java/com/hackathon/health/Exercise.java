package com.hackathon.health;

import java.util.*;

public class Exercise 
{
	protected String exercise;
	protected int levelIntensity;
	protected int reps;
	protected List<Integer> caloryTracker;
	protected int totalCalories;
	public Exercise(String exercise, int levelIntensity, int reps)
	{
		this.exercise = exercise;
		this.levelIntensity = levelIntensity; 
		this.reps = reps * levelIntensity;
		caloryTracker = new ArrayList<Integer>();
	}

	public String getExercise() {
		return this.exercise;
	}

	public int getLevelIntensity() {
		return this.levelIntensity;
	}

	public int getReps() {
		return this.reps;
	}
	
	public void run(int timer)
	{
		while(timer >= 0)
		{
			String time = String.format("%02d:%02d", timer / 60, timer % 60);
			System.out.println(time);
			timer--;
		}
	}
	
	public int caloriesBurned(String exercise, int levelIntensity, int reps)
	{
		switch(exercise)
		{
		case "Jumprope":
			switch(levelIntensity)
			{
			case 1:
				caloryTracker.add(10);
				return 10;
				
			case 2:
				caloryTracker.add(20);
				return 20;
				
			case 3:
				caloryTracker.add(30);
				return 30;
				
			default:
				System.out.println("Sorry you selected an invalid level intensity. Please try again.");
			}
		case "Jogging":
			switch(levelIntensity)
			{
			case 1:
				caloryTracker.add(3);
				return 3;
				
			case 2:
				caloryTracker.add(6);
				return 6;
				
			case 3:
				caloryTracker.add(9);
				return 9;
				
			default:
				System.out.println("Sorry you selected an invalid level intensity. Please try again.");
			}
		case "Jumping Jacks":
			int caloryCounter = (int)(0.2 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Squat Jumps":
			caloryCounter = (int)(3.0 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Stair Climb":
			caloryCounter = (int)(4 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Mountain Climbers":
			caloryCounter = (int)(0.5 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Side Lunge Stretch":
		case "Calf Stretch":
		case "Butterfly Stretch":
		case "Sideways Neck Stretch":
		case "Standing Hamstring Stretch":
		case "Seated Shoulder Squeeze":
		case "Triceps Stretch":
			switch(levelIntensity)
				{
				case 1:
					caloryCounter = 2;
					caloryTracker.add(caloryCounter);
					return caloryCounter;
				
				case 2:
					caloryCounter = 4;
					caloryTracker.add(caloryCounter);
					return caloryCounter;
				
				case 3:
					caloryCounter = 6;
					caloryTracker.add(caloryCounter);
					return caloryCounter;
				
				default:
					System.out.println("Sorry you selected an invalid level intensity. Please try again.");
				}
		case "Push Ups":
			caloryCounter = (int)(0.29 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Sit Ups":
			caloryCounter = (int)(0.2 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Squats":
			caloryCounter = (int)(0.32 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Plank":
			switch(levelIntensity)
				{
				case 1:
					caloryTracker.add(1);
					return 1;
				
				case 2:
					caloryTracker.add(3);
					return 3;
				
				case 3:
					caloryTracker.add(4);
					return 4;
				
				default:
					System.out.println("Sorry you selected an invalid level intensity. Please try again.");
				}
		case "Bicep Curls":
			caloryCounter = (int)(0.32 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Deadlift":
			caloryCounter = (int)(3.0 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Lunges":
			caloryCounter = (int)(0.3 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		case "Crunches":
			caloryCounter = (int)(0.25 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;

		case "Burpees":
			caloryCounter = (int)(0.5 * reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;

		case "Pull Ups":
			caloryCounter = (int)(reps);
			caloryTracker.add(caloryCounter);
			return caloryCounter;
		}
	return 0;
	}
	
	public void exerciseTask()
	{
		Timer timer = new Timer();
		switch(this.levelIntensity)
		{
		case 1:
			run(30);
			System.out.println("The amount of calories you burned by doing the " + this.exercise + " exercise was: " + caloriesBurned(this.exercise, this.levelIntensity, this.reps));
			break;

		case 2:
			run(60);
			System.out.println("The amount of calories you burned by doing the " + this.exercise + " exercise was: " + caloriesBurned(this.exercise, this.levelIntensity, this.reps));
			break;
			
		case 3:
			run(90);
			System.out.println("The amount of calories you burned by doing the " + this.exercise + " exercise was: " + caloriesBurned(this.exercise, this.levelIntensity, this.reps));
			break;
			
		default: 
			System.out.println("The level intensity that you selected is invalid. Please try again.");
		}	
	}
}