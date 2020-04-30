package com.revature.bankapp;

import java.util.Scanner;
import java.util.TreeMap;

import com.revature.bankapp.repo.CustDaoImpl;

public class CloseAccount implements BankScreen {
	
	CustDaoImpl cDI = new CustDaoImpl();
	String nameU;
	String typCA;
	String secTypCA;
	String triTypCA;
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to Close Account");
		System.out.println("What action would you like to implement?");
		System.out.println("1: Close Account");
		System.out.println("2: Return to Main Menu");
		System.out.println("3: Exit Application");
		System.out.println("==================================");
		
		typCA = scan.nextLine();
		if (typCA.equals("1")) {
			System.out.println("Enter the username of the account you wish to close");
			nameU = scan.nextLine();
			System.out.println(cDI.getUsername(nameU).getAcctNum() + " " + cDI.getUsername(nameU).getfName() +
					" " + cDI.getUsername(nameU).getlName());
			System.out.println("");
			System.out.println("Is this the correct account to close? Do you wish to proceed? y/n");
			secTypCA = scan.nextLine();
			if (secTypCA.equalsIgnoreCase("y")) {
				System.out.println("Are you sure? y/n");
				triTypCA = scan.nextLine();
				if(triTypCA.equalsIgnoreCase("y")) {
					TreeMap<String, Customer> db2 = cDI.viewCust();
					db2.remove(nameU);
					cDI.updateCust(db2);
					System.out.println("Account Closed, returning to Admin Screen");
					return new AdminScreen().render(scan);
				}else if (triTypCA.equalsIgnoreCase("n")) {
					System.out.println("Reloading Close Account Screen");
					return new CloseAccount().render(scan);
				}else {
					System.out.println("Invalid Entry. Reloading Account Screen");
					return new CloseAccount().render(scan);
				}
			}else if (secTypCA.equalsIgnoreCase("n")) {
				System.out.println("Reloading Close Account Screen");
				return new CloseAccount().render(scan);
			}else {
				System.out.println("Invalid Entry. Reloading Account Screen");
				return new CloseAccount().render(scan);
			}
		}else if (typCA.equals("2")) {
			return new MainBankScreen().render(scan);
		}
		else if (typCA.equals("3")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AppDenEmpAccess().render(scan);
		}
		
	}

}
