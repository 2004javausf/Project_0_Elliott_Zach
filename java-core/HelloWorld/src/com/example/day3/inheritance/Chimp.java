package com.example.day3.inheritance;


/*
 *There is no multiple inheritance in Java
 *
 * Right now the family line is something like:
 * 
 * 
 * 			Object
 * 			  |
 * 			Animal
 * 			 /  \
 * 		Monkey   Turtle
 * 		  /
 * 	 Chimp
 */

public class Chimp extends Monkey{
	
	//this is a form of polymorphism, this is method overriding(runtime polymorphism)
	@Override   //This is annotation, it adds meta data to whatever it is placed over
	//This override annotation forces the method it is above to be spelled correctly and it is actually an inherited method. 
	//this aids in reducing error
	//@Deprecated
	void eatBanana() {
		//System.out.println("nom nom im a chimp");
	}
	
	//This is also polymorphism, this is method overloading (compile time polymorphism)
	//we can accomplish this via a different datatypes as the parameters,
	//different number of parameters, and a different oder of parameters
	void eatBanana(int x) {
		
	}
	
	void eatBanana(int... x) {
		
	}
	
	void eatBanana(String s) {
		
	}
	
	void eatBanana(int x, String s) {
		
	}
	
	void eatBanana(String s, int x) {
		
	}
	
	void eatBanana(int x, int y ) {
		
	}
	
	//The ... means variable arguments it allows that parameter to handle any number of given arguments
	//It must be at the end of a parameter list. You can also use varargs in the constructors.
	void varArgsExample(int ... x) {
		System.out.println(x[0]);
	}

}
