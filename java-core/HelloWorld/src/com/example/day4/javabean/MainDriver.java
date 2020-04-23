package com.example.day4.javabean;

public class MainDriver {

	public static void main(String[] args) {
		
		FoodJavaBean food = new FoodJavaBean();
		System.out.println(food.getName());
		food.setName("Pizza");
		System.out.println(food.getName());
		food.setCalories(500);
		System.out.println(food.getCalories());

	}

}
