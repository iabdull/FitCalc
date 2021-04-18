package com.hackathon.health;

import java.util.*;

public class Food 
{
	protected String name;
	protected int caloriesConsumed;
	protected int quantity;
	
	public Food(String name, int caloriesConsumed, int quantity)
	{
		this.name = name;
		this.caloriesConsumed = caloriesConsumed;
		this.quantity = quantity;
	}

	public int getQuantity() {return this.quantity;}
	
	public String getName()
	{
		return this.name;
	}
	
	public int getCaloriesConsumed()
	{
		return this.caloriesConsumed;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setCaloriesConsumed(int caloriesConsumed)
	{
		this.caloriesConsumed = caloriesConsumed;
	}

	public String toString() {
		return "Name: " + this.name + "\n" + "Calories: " + this.caloriesConsumed + "\n" + " Quantity: " + this.quantity;
	}
}
