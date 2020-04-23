package com.example.day4.abstraction;

/*
 * You may have an abstract class with no abstract methods.
 * BUT an abstract method needs to be in an abstract class
 * you may also have a concrete method inside an abstract class
 */
public abstract class Food {
	
	/*
	 * The final keyword makes:
	 * variables constant
	 * class non-extendable
	 * prevents methods from being overriden
	 */
	
	public String name;
	//to surround text in a comment block is ctrl+shift+/
	/* abstract */ boolean cooked;//cannot have an abstract field
	private int cost;
	
	public /*abstract*/ Food() {
		//no abstract constructors, it must have implementation
		//to have the super()
		cost = 0;
		System.out.println("in abstract food constructor");
	}
	
	//The final keyword prevents methods from being overriden, therefore it cannot be used on an abstract class.
	/* final */ abstract void goBad();
	
	void concreteMethod() {
		System.out.println("This is fine");
	}
	
	/* abstract*/static void method2() {
		//cannot have an abstract static method. Abstract forces
		//the method to be overridden, but static methods cannot be overridden in the first place 
		
	}

}
