package com.example.day8.covariance;

public class Turtle extends Animal {
	public int numOfLegs;
	
	public String species;
	
	public Turtle () {
		
	}
	
	public Turtle(int numOfLegs) {
		
		this.numOfLegs = numOfLegs;
		this.species = "Turtle";
	}
	
	@Override
	public void walk() {
		System.out.println("Turtle is walking on " + numOfLegs + " legs");
	}
	
	//this is an example of overriding of covariant types, the overridden type must be more specific
	//(i.e. Child object) than the original return type.
	@Override
	//You can change access modifiers as long as they are not more restrictive in access
	public String getSpecies() {
		return this.species;
	}
	
	@Override
	public Integer test() {
		return new Integer(5);
	}
}
