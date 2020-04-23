package com.example.day5.passbyvalue;

public class PassByValueExample {

	public static void main(String[] args) {
		
		int x = 0;
		//in the main method we call method 1 and pass in a copy of x's value
		//therefore x in the main method will not reflect the change 
		method1(x);
		//System.out.println(x);
		
		Cat c = new Cat();
		c.setName("Hank");
		System.out.println(c.getName());
		catMethod(c);
		System.out.println(c.getName());
				
	}
	
	public static void method1(int x) {
		
		x += 5;
		//System.out.println(x);
		
	}
	
	public static void catMethod(Cat c) {
		
		c.setName("Bobby");
		
	}
	
	

}
