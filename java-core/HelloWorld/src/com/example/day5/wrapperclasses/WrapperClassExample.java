package com.example.day5.wrapperclasses;

public class WrapperClassExample {
	
	public int integerMethod(Integer i) {
		System.out.println("Wrapper Method");
		return i;
	}
	
	public Integer integerMethod(int i) {
		System.out.println("Primative Method");
		return i;
	}

}
