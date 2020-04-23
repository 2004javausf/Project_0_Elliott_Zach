package com.example.test;

public class Testing {
	
	public static void main(String[] args) {
		int x = (int) (Math.random() * 100) + 1;
	
	if (x%3 == 0 && x%5 == 0) {
		System.out.println(x);
		System.out.println("Fizz Buzz");
	}
	
	else if(x%3 == 0) {
		System.out.println(x);
		System.out.println("Fizz");
	}
	
	else if (x%5 == 0) {
		System.out.println(x);
		System.out.println("Buzz");
	}
	
	else if (x%3 !=0 && x%5!=0){
		System.out.println(x);
	}
	
	
	}

}
