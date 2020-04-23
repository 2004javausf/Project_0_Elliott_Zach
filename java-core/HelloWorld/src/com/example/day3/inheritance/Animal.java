package com.example.day3.inheritance;

public class Animal {
	
	boolean isAlive = true;
	int height = 10;
	int weight = 11;
	String color;
	public static int numOfLegs = 4;
	
	public Animal() {
		
		//System.out.println("in Animal no-args");
		
	}
	
	public Animal(int weight) {
		
		this.weight = weight;
	}
	
	void walk() {
		//System.out.println("Walking Along");
	}

}
