package com.example.day4.abstraction;

public interface Chewable extends Edible {
	
	void digest();
	
	//Interfaces cannot have constructors
//	public Chewable() {
//		
//	}
	
	int teeth = 32;
	
	static void testMethod() {
		System.out.println("this is in the static scope");
	}
	
	//the default keyword is how you can concrete methods in an interface
//	default void defaultMethod() {
//		
//	}

}
