package com.example.day4.javabean;

import java.io.Serializable;

/*
 * All java beans are POJOs but not all POJOs are Java Beans
 * Java Beans are Serializable i.e. they impliment the serializable interface
 * Fields must be private
 * Fields should have the proper getters and setters or both
 * They should have a no args constructor
 * The fields should only be accessed through the constructors or the getters and setters
 */

public class FoodJavaBean implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name = "Apples and Beans";
	private String recipe = "Why did you do this";
	private int calories = 250;
	
	public FoodJavaBean() {
		
	}
	
	//This is a getter
	public String getName() {
		return this.name;
	}
	
	//This is a setter
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRecipe() {
		return this.recipe;
	}
	
	public void setRecipe(String recipe) {
		this.recipe = recipe;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
