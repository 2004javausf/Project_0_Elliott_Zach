package com.revature.bankapp;

import java.util.Scanner;

public class AdminScreen implements BankScreen {
	
	String typAdmin;
	@Override
	public BankScreen render(Scanner scan) {
	System.out.println("Welcome Administrator"); //add admin name
	System.out.println("==========================");
	System.out.println("What would you like to do?");
	System.out.println("1: Create new Admin");
	System.out.println("2: Create new Employee");
	System.out.println("3: View Employee Information");
	System.out.println("4: Approve/Deny New Accounts");
	System.out.println("5: Deposit/Withdraw/Transer Funds");
	//add admin functionality
	
	typAdmin = scan.nextLine();
	if(typAdmin.equals("1")) {
		System.out.println("Construct admin page under development"); //create construct admin
	}else if (typAdmin.equals("2")) {
		return new CreateEmp().render(scan);
	}else if (typAdmin.equals("3")) {
		return new viewEmp().render(scan);
	}else if (typAdmin.equals("4")) {
		return new AppDenEmpAccess().render(scan);
	}
	BankApp.isRunning = false;
	return null;
	}

}
