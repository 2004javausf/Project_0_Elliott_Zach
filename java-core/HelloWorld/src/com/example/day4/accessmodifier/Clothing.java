package com.example.day4.accessmodifier;

public class Clothing {

	protected String type = "Hoodie";
	String material = "Cotton"; //This is an example of a default access modifier
	public int cost = 10;
	private String color = "Grey";
	
	void wrinkle() {
		System.out.println(this.color);
		System.out.println("in wrinkle method");
	}
	
	public void getColor() {
		System.out.println(this.color);
	}
}
