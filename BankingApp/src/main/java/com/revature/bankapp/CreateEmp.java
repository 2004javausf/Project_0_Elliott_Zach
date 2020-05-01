package com.revature.bankapp;

import java.util.Scanner;

public class CreateEmp implements BankScreen {
	
	String secTypCE;
	String typCE; 
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("");
		System.out.println("==============");
		System.out.println("Welcome to the Create New Employee Menu");
		System.out.println("Do you wish to proceed? (y/n)");
		System.out.println("Exit Application (Q)");
		
		typCE = scan.nextLine();
		if (typCE.equalsIgnoreCase("y")) {
			System.out.println("Please Enter the Employee's First Name");
			String employeeNameFirst = scan.nextLine();
			System.out.println("Please Enter the Employee's Last Name");
			String employeeNameLast = scan.nextLine();
			System.out.println("Please Enter the Employee's *UNIQUE* Username");
			String employeeUsername = scan.nextLine();
			System.out.println("Please Enter the Employee's Password");
			String employeePassword = scan.nextLine();
			new EmployeeTemp(employeeUsername, employeePassword, employeeNameFirst, employeeNameLast);
			System.out.println("Is this information correct? (y/n)");
			System.out.println(EmployeeArmy.EmployeeListTemp.toString());
			secTypCE = scan.nextLine();
			if (secTypCE.equalsIgnoreCase("y")) {
				System.out.println("Thank you for creating a new employee");
				new EmployeeFinal(employeeUsername, employeePassword, employeeNameFirst, employeeNameLast);
				System.out.println(EmployeeArmy.EmployeeListFinal.toString());
				BankApp.isRunning = false;
			}else if (secTypCE.equalsIgnoreCase("n")) {
				System.out.println("Restarting Create Employee");
				EmployeeArmy.EmployeeListTemp.remove(0);
				return new CreateEmp().render(scan);
			}else {
				System.out.println("Invalid Entry, Restarting Create Employee");
				EmployeeArmy.EmployeeListTemp.remove(0);
				return new CreateEmp().render(scan);
			}
		}else if (typCE.equalsIgnoreCase("n")) {
			System.out.println("Returning to Administration Screen");
			return new AdminScreen().render(scan);
		}else if (typCE.equalsIgnoreCase("Q")){
			System.out.println("Exiting Application");
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry, Restarting Create Employee");
			return new CreateEmp().render(scan);
		}
		return null;
	}

}
