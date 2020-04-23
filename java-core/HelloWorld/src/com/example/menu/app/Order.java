package com.example.menu.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Order implements Screen {

	static Map<String, String>hashMap = new HashMap<>();
	static int cust = 0;
	@Override
	public Screen render(Scanner scan) {
		
		++cust;
		hashMap.put("Customer" + cust, DrinkOrder.Customer +"\n");
		
		System.out.println(hashMap);
		System.out.println("Is there another order " + "y/n");
		String exit = scan.nextLine();
		if(exit.equals("n")) {
			MenuApplication.isRunning = false;
			return null;
		}
		return new MainMenu().render(scan);
		
	}

}
