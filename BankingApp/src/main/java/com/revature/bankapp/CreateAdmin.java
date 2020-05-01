package com.revature.bankapp;

import java.util.Scanner;

public class CreateAdmin implements BankScreen {

	String typCA;
	String secTypCA;
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("");
		System.out.println("==============");
		System.out.println("Welcome to the Create New Admin Menu");
		System.out.println("Do you wish to proceed? (y/n)");
		System.out.println("Exit Application (Q)");
		
		typCA=scan.nextLine();
		if(typCA.equalsIgnoreCase("y")) {
			System.out.println("Please Enter the Adminastrator's First Name");
			String administratorNameFirst = scan.nextLine();
			System.out.println("Please Enter the Adminastrator's Last Name");
			String administratorNameLast = scan.nextLine();
			System.out.println("Please Enter the Adminastrator's *UNIQUE* Username");
			String administratorUsername = scan.nextLine();
			System.out.println("Please Enter the Adminastrator's Password");
			String administratorPassword = scan.nextLine();
			new AdministratorTemp(administratorNameFirst, administratorNameLast, administratorUsername, administratorPassword);
			System.out.println("Is this information correct? (y/n)");
			System.out.println(AdminCommand.AdminListTemp.toString());
			secTypCA = scan.nextLine();
			if (secTypCA.equalsIgnoreCase("y")) {
				System.out.println("Thank You for Creating a New Administrator");
				new AdministratorFinal(administratorNameFirst, administratorNameLast, administratorUsername, administratorPassword);
				System.out.println(AdminCommand.AdminListFinal.toString());
				BankApp.isRunning = false;
			}else if (secTypCA.equalsIgnoreCase("n")){
				System.out.println("Restarting Create Admin Page");
				AdminCommand.AdminListTemp.remove(0);
				return new CreateAdmin().render(scan);
			}else {
				System.out.println("Invalid Entry, Restarting Create Employee");
				AdminCommand.AdminListTemp.remove(0);
				return new CreateAdmin().render(scan);
			}
		}else if (typCA.equalsIgnoreCase("n")) {
			System.out.println("Returning to Admin Screen");
			return new AdminScreen().render(scan);
		}else if (typCA.equalsIgnoreCase("q")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry, Restarting Create Employee");
			return new CreateAdmin().render(scan);
		}
		return null;
		
	}

}
