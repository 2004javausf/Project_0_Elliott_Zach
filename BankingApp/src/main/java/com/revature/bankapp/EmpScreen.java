package com.revature.bankapp;

import java.util.Scanner;

public class EmpScreen implements BankScreen {
	
	String typEmp;
	
	@Override
	public BankScreen render (Scanner scan) {
		System.out.println("Welcome Employee");
		System.out.println("What action would you like to implement?");
		System.out.println("========================================");
		System.out.println("1: View account information");
		System.out.println("2: View personal information");
		System.out.println("3: Approve/Deny open applications");
		System.out.println("4: Return to Main Screen");
		System.out.println("5: Exit Application");
		System.out.println("========================================");
		
		typEmp = scan.nextLine();
		if (typEmp.equals("1")) {
			return new AccInfo().render(scan);
		}else if (typEmp.equals("2")) {
			return new PerInfo().render(scan);
		}else if (typEmp.equals("3")) {
			return new AppDen().render(scan);
		}else if (typEmp.equals("4")) {
			return new MainBankScreen().render(scan);
		}else if (typEmp.equals("5")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry \n");
			return new EmpScreen().render(scan);
		}
	}

}

