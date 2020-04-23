package com.example.day8.covariance;

public class Animal {
	
	public int numOfLegs;
	
	public String species;
	
	public Animal() {
		
		this .numOfLegs = 2;
		
	}
	
	public Animal (int numOfLegs, String species) {
		this.numOfLegs = numOfLegs;
		this.species = species;
	}
	
	public void walk() {
		System.out.println("Walking on " + this.numOfLegs + " legs");
	}
	
	protected Object getSpecies() {
		return this.species;
	}
	
	public Number test() {
		return 0;
	}

}
