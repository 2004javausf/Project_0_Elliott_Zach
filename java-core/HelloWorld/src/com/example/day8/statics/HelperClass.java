package com.example.day8.statics;

public class HelperClass {
	
	//instance scope
	public String name;
	//static scope variable
	public static int value;
	
	//This is constructor chaining , this() keyword
	//calls the no args constructor of the same name of this object, it has to be the first line of the constructor
	//as it replaces the super() call
	public HelperClass() {
		
		System.out.println("in no args");
		
	}
	
	public HelperClass(int x) {
		this();
		System.out.println("in 1 args constructor");
		value = x;
	}
	
	public HelperClass(int x, String name) {
		this(x);
		System.out.println("in 2 args constructor");
		value = x;
		this.name = name;
	}
	
	public void getMain() {
		//StaticExample stat = new StaticExample();
		//String[]sAry = {"Hello", "World"};
		//StaticExample.main(sAry);
	}
	
	public static void doStaticAgain(){
		
		//System.out.println("Static Helper Class");
		
	}

}
