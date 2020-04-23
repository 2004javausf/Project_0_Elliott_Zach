package com.example.day3.inheritance;

public class Monkey extends Animal{
	
	/*
	 * This variable overrides the weight variable inside of animal
	 * this is the concept of shadowing where you have two variable with the same name
	 * exists in scopes that overlap
	 * 
	 * You can still access the shadowed variable (aka the parent variable) via casting
	 */
	int weight = 15;
	
	public Monkey() {
		//System.out.println("in monkey no-args");
	}
	
	void eatBanana() {
		//System.out.println("nom nom");
	}

}
