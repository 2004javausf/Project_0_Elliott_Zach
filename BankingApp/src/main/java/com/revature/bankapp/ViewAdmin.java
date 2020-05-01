package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.AdminAccess;

public class ViewAdmin implements BankScreen {
	String typVA;
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Admin Information:");
		AdminAccess.readAdminFile();
		System.out.println(AdminCommand.AdminListFinal.toString()); 
		
		System.out.println("Return to Admin Screen? (y/n)");
		typVA = scan.nextLine();
		if (typVA.equalsIgnoreCase("y")) {
			return new AdminScreen().render(scan);
		}else if (typVA.equalsIgnoreCase("n")) {
			BankApp.isRunning=false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			System.out.println("Program Closing");
			BankApp.isRunning=false;
			return null;
		}
	}

}
