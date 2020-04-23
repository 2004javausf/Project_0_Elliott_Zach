package com.example.day3.classes;

public class Animal {
	
	//This variable is in the static scope due to the static keyword
	static int age = 0;
	
	//here we are in the object/instance scope
	String species;
	int numOfLegs;
	boolean isSleep = true;
	int speed =5; 
	int eyes = 10;
	
	//you can overload constructors(aka compile time polymorphism)
	//different argument types, order, number of arguments
	public Animal() {
		
		//super();
		this.numOfLegs = 4;
		
	}
	public Animal (int x) {
		this.numOfLegs=x;
	}
	
	public Animal (int x,int age) {
		this.numOfLegs=x;
		this.age=age;
	}
	
	public Animal (int x, String s) {
		this.numOfLegs=x;
		this.species=s;
	}
	
	static void walking() {
		System.out.println("walking");
	}
	
	void setSleepingState() {
		isSleep = !isSleep;
	}
	
	//speedUp is in method scope, it cannot be accessed outside of its scope
	void runFaster(int speedUp) {
		//this is an example of block scope k and i only exist in block scope and cannot be accessed outside of it
		for(int i=0;i<10;i++) {
			int k = 10;
			speedUp++;
		}
		speed = speed + speedUp;
	}

}
