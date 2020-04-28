package com.revature.bankapp;

import java.util.Scanner;

public class PerInfo implements BankScreen {

	String typPer;
	
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to the Personal Information");
		System.out.println("What would you like to view?");
		System.out.println("1: Client Names");
		System.out.println("2: Application status");
		System.out.println("3: Exit Application");
		System.out.println("==================================");
		
		typPer = scan.nextLine();
		if (typPer.equals("1")) {
			System.out.println("Client name"); //Placeholder
		}else if (typPer.equals("2")){
			System.out.println("App status");//Placeholder
		}else if (typPer.equals("3")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AccInfo().render(scan);
		}
		return null;
	}

}
