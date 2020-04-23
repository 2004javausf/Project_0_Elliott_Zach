package com.example.day8.covariance;

public class CovarianceHelper {
	
	public static void main(String[] args) {
		Animal ani = new Turtle(4);
		
		//the variable of ani has the methods of turtle (aka the child class) 
		//but it holds the fields of Animal (aka the parent class)
		//So when we call walk it will print the turtles walk method with 
		//the initialized leg value of 4
		ani.walk();
		
		//But when we call the field itself it will be the uninitialized value in animal
		System.out.println(ani.species);
		System.out.println(ani.numOfLegs);
		System.out.println(((Turtle)ani).getSpecies());
	}

}
