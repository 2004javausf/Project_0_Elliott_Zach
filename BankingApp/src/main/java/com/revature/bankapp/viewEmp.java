package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.EmpAccess;

public class viewEmp implements BankScreen {
	String typVE;
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Employee Information:");
		EmpAccess.readEmployeeFile();
		System.out.println(EmployeeArmy.EmployeeListFinal.toString());
		
		System.out.println("Return to Admin Screen? (y/n)");
		typVE = scan.nextLine();
		if (typVE.equalsIgnoreCase("y")) {
			return new AdminScreen().render(scan);
		}else if (typVE.equalsIgnoreCase("n")) {
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
