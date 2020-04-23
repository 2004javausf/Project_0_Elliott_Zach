package com.example.day7.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Generics_Example {
	
	

	public static void main(String...args) {
		
		/*
		 * What are generics?
		 * 
		 * Generics use angle brackets <> to create a placeholder for a future 
		 * datatype. When instantiating a generic object you must provide a datatype
		 * from that point that specific object will always work with that datatype.
		 * But other instances from the same generic class can work with other datatypes
		 * A single instance of the generic class never changes the datatype it will be 
		 * working with 
		 */
		
		ArrayList<Integer> aList = new ArrayList<Integer>();
		aList.add(5);
		
		GenericClass<String> myClass = new GenericClass<String>("Hello");
		//System.out.println(myClass.getValue());
		
		method1(new String("me"));
		
		List<Integer> iList = Arrays.asList(1,2,3,4,5);
		add(iList);
		
		List<Double> dList = Arrays.asList(1.0,2.0,3.5,4.5,5.0);
		add(dList);
		
		printLower(iList);
		
		List<Number>nList = Arrays.asList(1,2,3,4,5);
		add(nList);
		
		//DONT DO THIS. defeats purpose of generics
		//List<Object> oList;

	}
	
	public static <Y> void method1 (Y var) {
		
		//System.out.println(var);
	}
	
	//Upper bounds wildcard	
	//We have created a method that ensures the type safety of the list 
	//datatype to be only of numbers
	public static void add(List<? extends Number> list) {
		
		double sum = 0.0;
		for(Number i: list) {
			sum += i.doubleValue();
		}
		System.out.println(sum);
		
	}
	
	//Lower bounds wildcard
	//This will only accept lists of type Integer and superclasses of integer
	public static void printLower(List<? super Integer> list) {
		
		System.out.println(list);
		

	}
	



}
class GenericClass<T> {
	private T value;
	
	public GenericClass(T value) {
		this.value = value;
	}
	public T getValue() {
		return this.value;
	}
	public void setValue(T value) {
		this.value = value;
	}
}

