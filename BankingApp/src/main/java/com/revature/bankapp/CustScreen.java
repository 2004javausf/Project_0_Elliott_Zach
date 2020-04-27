package com.revature.bankapp;

import java.util.Scanner;

public class CustScreen implements BankScreen {
	
	String choice;
	
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Hello Customer");
		System.out.println("What would you like to do? Please type corresponding number.");
		System.out.println("1: Create new account");
		System.out.println("2: Access your account");
		System.out.println("3: Exit");
		choice = scan.nextLine();
		
		if(choice.equals("1")) {
			return new CustApplyScreen().render(scan);
		}
		
		else if(choice.equals("2")) {
			return new CustAccountScreen().render(scan);
		}
		
		else if(choice.equals("3")) {
			return new MainBankScreen().render(scan);
		}
		
		else {
			System.out.println("Invalid Entry");
			return new CustScreen().render(scan);
		}
	}

}
