package com.example.day4.abstraction;

public class Chicken extends Food implements Chewable{

	public Chicken() {
		System.out.println("in Chicken Constructor");
		this.name = "Chkn";
	}
	@Override
	void goBad() {
		System.out.println("This is now stinky");
	}

	@Override
	public void digest() {
		System.out.println("Stomach Acid");
		
	}
	@Override
	public void anotherMethod() {
		// TODO Auto-generated method stub
		
	}
	
}
