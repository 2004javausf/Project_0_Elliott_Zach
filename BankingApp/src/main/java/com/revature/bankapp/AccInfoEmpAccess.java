package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class AccInfoEmpAccess implements BankScreen {

	CustDaoImpl cDI = new CustDaoImpl();
	AcctDaoImpl aDI = new AcctDaoImpl();
	
	String uName;
	int actNum;
	String typAcc;
	String secTypAcc;
	Scanner sc = new Scanner(System.in);
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to the Account Information");
		System.out.println("What would you like to view?");
		System.out.println("1: Account Number");
		System.out.println("2: Account Balance");
		System.out.println("3: Return to Employee Screen");
		System.out.println("4: Exit Application");
		System.out.println("==================================");
		
		typAcc = scan.nextLine();
		
		if (typAcc.equals("1")) {
			System.out.println("What is the user name of the client whose account number you want to see");
			uName = scan.nextLine();
			System.out.println("The account number is: " + cDI.getUsername(uName).getAcctNum());
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
			System.out.println("What is the account number of the balance you wish to view?");
			actNum = sc.nextInt();
			System.out.println("The balance of that is $" + aDI.getAcct(actNum).getAmount());
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
