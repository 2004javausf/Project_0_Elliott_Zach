package com.revature.bankapp;

import java.util.Scanner;

public class AdminScreen implements BankScreen {
	
	String typAdmin;
	@Override
	public BankScreen render(Scanner scan) {
	System.out.println("Welcome Administrator"); 
	System.out.println("==========================");
	System.out.println("What would you like to do?");
	System.out.println("1: Create new Admin");
	System.out.println("2: View Admin Information");
	System.out.println("3: Create new Employee");
	System.out.println("4: View Employee Information");
	System.out.println("5: Approve/Deny New Accounts");
	System.out.println("6: Deposit/Withdraw/Transer Funds");
	System.out.println("7: Cancel Account");
	System.out.println("8: Return to Main Menu");
	System.out.println("9: Exit Application");
	
	typAdmin = scan.nextLine();
	if(typAdmin.equals("1")) {
		return new CreateAdmin().render(scan);
	}else if (typAdmin.equals("2")) {
		return new ViewAdmin().render(scan);
	}else if (typAdmin.equals("3")) {
		return new CreateEmp().render(scan);
	}else if (typAdmin.equals("4")) {
		return new ViewEmp().render(scan);
	}else if (typAdmin.equals("5")) {
		return new AppDenEmpAccess().render(scan);
	}else if (typAdmin.equals("6")) {
		return new AdminDWT().render(scan);
	}else if (typAdmin.equals("7")) {
		return new CloseAccount().render(scan);
	}else if (typAdmin.equals("8")) {
		return new MainBankScreen().render(scan);
	}else if (typAdmin.equals("9")) {
		BankApp.isRunning = false;
		return null;
	}else {
		System.out.println("Invalid Entry");
		return new AdminScreen().render(scan);
	}
	
	}

}
