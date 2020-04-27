package com.revature.bankapp;

import java.util.Scanner;

public class MainBankScreen implements BankScreen {
	
	String typePerson;
	
	@Override
	public BankScreen render(Scanner scan) {
		
		System.out.println("Welcome to Kool Kidz Only Bank");
		System.out.println("What type of user are you? PLease type in corresponding number.");
		System.out.println("1: Admin");
		System.out.println("2: Employee");
		System.out.println("3: Customer");
		System.out.println("4: Exit Apllication");
		typePerson = scan.nextLine();
		
		if(typePerson.equals("1")) {
			return new AdminScreen().render(scan);
		}
		
		else if(typePerson.equals("2")) {
			return new EmpScreen().render(scan);
		}
		
		else if(typePerson.equals("3")) {
			return new CustScreen().render(scan);
		}
		
		else if(typePerson.equals("4")) {
			BankApp.isRunning = false;
			return null;
		}
		
		else {
			System.out.println("Invalid Entry");
			return new MainBankScreen().render(scan);
		}
		
	}


}
