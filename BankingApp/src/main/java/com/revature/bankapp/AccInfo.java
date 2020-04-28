package com.revature.bankapp;

import java.util.Scanner;

public class AccInfo implements BankScreen {

	String typAcc;
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to the Account Information");
		System.out.println("What would you like to view?");
		System.out.println("1: Account IDs");
		System.out.println("2: Account Balance");
		System.out.println("3: Exit Application");
		System.out.println("==================================");
		
		typAcc = scan.nextLine();
		
		if (typAcc.equals("1")) {
			System.out.println("Account IDs"); //placeholder
		}else if(typAcc.equals("2")) {
			System.out.println("Account Balance");//placeholder
		}else if (typAcc.equals("3")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AccInfo().render(scan);
		}
		return null;
	}
	
}
