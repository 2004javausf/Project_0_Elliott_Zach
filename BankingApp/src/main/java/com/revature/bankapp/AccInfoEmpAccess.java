package com.revature.bankapp;

import java.util.Scanner;

public class AccInfoEmpAccess implements BankScreen {

	String typAcc;
	String secTypAcc;
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to the Account Information");
		System.out.println("What would you like to view?");
		System.out.println("1: Account IDs");
		System.out.println("2: Account Balance");
		System.out.println("3: Return to Employee Screen");
		System.out.println("4: Exit Application");
		System.out.println("==================================");
		
		typAcc = scan.nextLine();
		
		if (typAcc.equals("1")) {
			System.out.println("Account IDs");//placeholder
			System.out.println("==================");
			System.out.println("Would you like to perform another action?  (y/n)");
			secTypAcc = scan.nextLine();
			if (secTypAcc.equalsIgnoreCase("y")) {
				return new AccInfoEmpAccess().render(scan);
			}else if (secTypAcc.equalsIgnoreCase("n")) {
				BankApp.isRunning = false;
				return null;
			}
		}else if(typAcc.equals("2")) {
			System.out.println("Account Balance");//placeholder
			System.out.println("==================");
			System.out.println("Would you like to perform another action?  (y/n)");
			secTypAcc = scan.nextLine();
			if (secTypAcc.equalsIgnoreCase("y")) {
				return new AccInfoEmpAccess().render(scan);
			}else if (secTypAcc.equalsIgnoreCase("n")) {
				BankApp.isRunning = false;
				return null;
			}
		}else if (typAcc.equals("3")) {
			return new EmpScreen().render(scan);
		}else if (typAcc.equals("4")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AccInfoEmpAccess().render(scan);
		}
		return null;
	}
	
}
