package com.example.menu.app;

import java.util.Scanner;

public class FoodOrder implements Screen{
	
	 static String foodNumber;
	

	@Override
	public Screen render(Scanner scan) {
		System.out.println("What food item would you like " + MainMenu.name + "?");
		System.out.println("Bagel");
		System.out.println("Pancakes");
		System.out.println("Waffles");
		foodNumber = scan.nextLine();
		return new DrinkOrder().render(scan);
	}
	
	

}
