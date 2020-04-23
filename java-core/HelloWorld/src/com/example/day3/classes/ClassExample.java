package com.example.day3.classes;

public class ClassExample {
	
	/*
	 * What is a class? It is a blueprint for an object. 
	 * A class will define what TYPES of states and behaviors an object will have, NOT the values 
	 * of those states and behaviors
	 * 
	 * WHat is an object? It is an instance of a class. It is a group of states(variables and
	 * actions/behaviors(methods).
	 */

	public static void main(String[] args) {
		Animal.age = 0;
		
		//This is constructing an object off the no arg constructor
		Animal ani = new Animal();
		//this is constructing a new object off the constructor
		//with an int parameter
		ani.age = 0;
		Animal ani2 = new Animal(7);
		Animal ani3 = new Animal(7,3);
		Animal ani4 = new Animal(4,"Dinosaur");
		//This is accessing instance scope variables based of 
		//instantiating an object
		ani.species = "Monkey";
		System.out.println(ani.numOfLegs);
		System.out.println(ani2.numOfLegs);
		System.out.println(ani3.numOfLegs + " " + ani3.age);
		System.out.println(ani4.numOfLegs + " " + ani4.species);

	}

}
