package com.revature.bankapp;

import java.util.Scanner;

public class AppDenEmpAccess implements BankScreen {

	String typApD;
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to Application Approve/Deny");
		System.out.println("What action would you like to implement?");
		System.out.println("1: Approve");
		System.out.println("2: Deny");
		System.out.println("3: Return to Main Menu");
		System.out.println("4: Exit Application");
		System.out.println("==================================");
		
		typApD = scan.nextLine();
		if (typApD.equals("1")) {
			ApproveDeny.AD(); //Placeholder
		}else if (typApD.equals("2")){
			System.out.println("Deny");//Placeholder
		}else if (typApD.equals("3")) {
			return new MainBankScreen().render(scan);
		}else if (typApD.equals("4")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AppDenEmpAccess().render(scan);
		}
		return null;
	}

}
