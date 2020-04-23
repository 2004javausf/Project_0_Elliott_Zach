package com.example.menu.app;

import java.util.Scanner;


public class DrinkOrder implements Screen {
	
	static String drinkNumber;
	static String Customer;

	@Override
	public Screen render(Scanner scan) {
		System.out.println("What drink do you want " + MainMenu.name + "?");
		System.out.println("Coffee");
		System.out.println("Orange Juice");
		System.out.println("Smoothie");
		drinkNumber = scan.nextLine();
		Customer = "Customer:" + MainMenu.name + " " + "Food:" + FoodOrder.foodNumber + " " + "Drink:" + drinkNumber;
		
		return new Order().render(scan);
	}

}
