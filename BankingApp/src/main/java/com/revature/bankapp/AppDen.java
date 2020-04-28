package com.revature.bankapp;

import java.util.Scanner;

public class AppDen implements BankScreen {

	String typApD;
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to Application Approve/Deny");
		System.out.println("What action would you like to implement?");
		System.out.println("1: Approve");
		System.out.println("2: Deny");
		System.out.println("3: Exit Application");
		System.out.println("==================================");
		
		typApD = scan.nextLine();
		if (typApD.equals("1")) {
			System.out.println("Approve"); //Placeholder
		}else if (typApD.equals("2")){
			System.out.println("Deny");//Placeholder
		}else if (typApD.equals("3")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AccInfo().render(scan);
		}
		return null;
	}

}
