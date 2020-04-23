package com.example.day4.abstraction;

/*
 * hiding the implementation details from the user while showing functionality
 * aka revealing what something without showing how it does it
 * 
 *  In Java we use the abstract keyword, abstract classes, and interfaces
 *  
 *  In the case of abstract methods(or classes) we conceptually
 *  know what the method is supposed to do AND the parameter it will have BUT we dont 
 *  yet know how it will be implemented
 *  
 *  Abstract classes and concrete classes have more similarities than they do differences
 *  Some differences include:
 *  Abstract classes(AC) cannot be instantiated
 *  AC can have abstract methods
 *  	-Abstract methods must be overrided
 *  Beyond these differences, the inheritance works the same
 *  
 *  Differences between interfaces and abstract classes:
 *  
 *   interfaces							abstract classes
 *   ----------							----------------
 *   -you can impliment multiple		-you can only inherit on AC or concrete class
 *   		interfaces
 *   -uses the implements keyword		-uses the extends keyword
 *(interfaces extends other interfaces)
 *	 -methods are implicitly:			-no implicit modifiers
 *	 abstract and public
 *	 -Variables are implicitly:			-you can have constructors in AC
 *	 static, final, public
 *	 -NO constructor in an interface
 *							BOTH MAY HAVE STATIC METHODS
 *
 *Why would we use one or the other?
 *- AC used as a foundation for a class hierarchy
 *-interface we are allowed to have multiple interfaces we dont have to use our single inheritance spot
 *
 *Naming conventions
 *AC- nouns
 *interfaces - adjectives
 */

public class AbstractionExample {
	int i;
	//initializer block, runs once and cannot be called again due to not having a reference name
	{
	i = 0;
	}
	
	//you cannot have an abstract method in a concrete class
	//public abstract void method1();
	
	public static void main(String[] args) {
		
	}

}
