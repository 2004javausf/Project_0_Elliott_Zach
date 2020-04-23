package com.example.day5.scanner;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		//We have been using the System.out to print to the console
		//Now we will be using system.in to read to the console
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Please enter your name:");
		String s = in.nextLine();
		System.out.println("Your name is " + s);
		
		System.out.println("Please enter your age:");
		int age = in.nextInt();
		System.out.println("Your age is " + age);
		
		System.out.println("Write a random decimal");
		float b = in.nextFloat();
		System.out.println("That number was " + b);
		
		in.close();

	}

}
