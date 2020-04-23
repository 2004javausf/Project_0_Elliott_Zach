package com.example.day4.accessmodifier;

public class AccessExample {
	
	/*
	 * What is an Access Modifier 
	 * they are keywords that control who/what has access to a specific object/class member
	 * 
	 * Access Modifiers are NOT the same as scopes
	 * 		scopes define where member exist (lifespan)
	 * 		Access modifiers define who has access to that member (permissions)
	 * 
	 * Access Modifier in Java are:
	 * 		Public - Everyone has access
	 * 		Protected - In the Class, in the Package, and in Child classes
	 * 		Default - In the class, and in the Package 
	 * 		Private - In the class
	 */

	public static void main(String[] args) {
		Clothing cloth = new Clothing();
		System.out.println(cloth.type);
		System.out.println(cloth.material);
		System.out.println(cloth.cost);
		cloth.getColor();
	}

}
