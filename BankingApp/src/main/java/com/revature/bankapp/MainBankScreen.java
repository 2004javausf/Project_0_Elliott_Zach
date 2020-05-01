package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class MainBankScreen implements BankScreen {
	
	String typePerson;
	CustDaoImpl cDI = new CustDaoImpl();
	AcctDaoImpl aDI = new AcctDaoImpl();
	
	@Override
	public BankScreen render(Scanner scan) {
		
		System.out.println("Welcome to Kool Kidz Only Bank");
		System.out.println("What type of user are you? Please type in corresponding number.");
		System.out.println("1: Admin");
		System.out.println("2: Employee");
		System.out.println("3: Customer");
		System.out.println("4: Exit Application");
		typePerson = scan.nextLine();
		
		if(typePerson.equals("1")) {
			return new AdminLogin().render(scan);
		}
		
		else if(typePerson.equals("2")) {
			return new EmpLogin().render(scan);
		}
		
		else if(typePerson.equals("3")) {
			return new CustScreen().render(scan);
		}
		
		else if(typePerson.equals("4")) {
			BankApp.isRunning = false;
			return null;
		}
		
		else if(typePerson.equals("5")) {
			System.out.println(cDI.viewCust());
			return new MainBankScreen().render(scan);
		}
		
		else if(typePerson.equals("6")) {
			System.out.println(aDI.viewAcct());
			return new MainBankScreen().render(scan);
		}
		
		else {
			System.out.println("Invalid Entry");
			return new MainBankScreen().render(scan);
		}
		
	}


}
