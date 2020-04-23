package com.example.lambda;

public interface MyInterface {
	
	public static final int i = 6;
	
	public static void method1() {
		System.out.println("static");
	}
	
	public default void method2() {
		System.out.println("default");
	}
	
	public abstract void printer(String s);
	
	//functional interfaces are ones with only one abstract method

}
