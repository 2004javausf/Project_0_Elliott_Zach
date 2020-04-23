package com.example.menu.app;

import java.util.Scanner;

public class MainMenu implements Screen {
	
	static String name;
	

	@Override
	public Screen render(Scanner scan) {
		
		System.out.println("Welcome to Our Cafe");
		System.out.println("Enter your name");
		name = scan.nextLine();
		return new FoodOrder().render(scan);
		
		}
		
	}


