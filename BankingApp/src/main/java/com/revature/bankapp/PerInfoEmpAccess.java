package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.CustDaoImpl;

public class PerInfoEmpAccess implements BankScreen {

	Customer cust;
	String typPer;
	String secTypPer;
	String actName;
	
	CustDaoImpl cDI = new CustDaoImpl();
	
	public PerInfoEmpAccess() {
		this.cust = new Customer();
	}
	
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to the Personal Information");
		System.out.println("What would you like to view?");
		System.out.println("1: Client Names");
		System.out.println("2: Application status");
		System.out.println("3: Return to Employee Screen");
		System.out.println("4: Exit Application");
		System.out.println("==================================");
		
		typPer = scan.nextLine();
		if (typPer.equals("1")) {
			System.out.println("What is the user name of the client you are trying to access?");
			actName = scan.nextLine();
			System.out.println(cDI.getUsername(actName).getfName() + " " + cDI.getUsername(actName).getlName());
			System.out.println("==================");
			System.out.println("Would you like to perform another action?  (y/n)");
			secTypPer = scan.nextLine();
			if (secTypPer.equalsIgnoreCase("y")) {
				return new PerInfoEmpAccess().render(scan);
			}else if (secTypPer.equalsIgnoreCase("n")) {
				BankApp.isRunning = false;
				return null;
			}
		}else if (typPer.equals("2")){
			System.out.println("What is the user name of the client you are trying to access?");
			actName = scan.nextLine();
			System.out.println(cDI.getUsername(actName).isValid());
			System.out.println("==================");
			System.out.println("Would you like to perform another action?  (y/n)");
			secTypPer = scan.nextLine();
			if (secTypPer.equalsIgnoreCase("y")) {
				return new PerInfoEmpAccess().render(scan);
			}else if (secTypPer.equalsIgnoreCase("n")) {
				BankApp.isRunning = false;
				return null;
			}
		}else if (typPer.equals("3")) {
			return new EmpScreen().render(scan);
		}else if (typPer.equals("4")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AccInfoEmpAccess().render(scan);
		}
		return null;
	}

}
