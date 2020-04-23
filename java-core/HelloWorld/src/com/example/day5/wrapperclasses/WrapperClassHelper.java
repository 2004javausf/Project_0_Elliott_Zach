package com.example.day5.wrapperclasses;

public class WrapperClassHelper {

	public static void main(String[] args) {
		
		Integer i = new Integer(10);
		//this will store "hi" into the string pool 
		String s4 = "hi";
		String s = "10";
		Integer i3 = new Integer(10);
		Integer i2 = Integer.parseInt(s);
		//this will store "10" into the string pool and the create an object in the heap
		String s2 = new String ("10");
		//this wont store ten in the string pool due to it already existing and it will 
		//create an object in the heap
		String s3 = new String ("10");
		System.out.println(i2);
		//== compares the hashcode memory reference, this does not work with 2 different objects
		System.out.println(i == i2);
		System.out.println(s == s2);
		
		//When dealing with object you must use the .equals method for comparisons if it is a custom class 
		//you must provide implementation to the .equals method
		//By default the object class's .equals is the same as ==
		System.out.println(i.equals(i3));
		System.out.println(s.equals(s2));
		
		WrapperClassExample wrap = new WrapperClassExample();
		int x = 20;
		System.out.println(wrap.integerMethod(x));

	}

}
