package com.revature.bankapp;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import com.revature.bankapp.AdminCommand;
import com.revature.bankapp.repo.AdminAccess; 

public class AdminLogin implements BankScreen {
	
	
	
	@Override
	public BankScreen render(Scanner scan) {
		AdminAccess.readAdminFile();
	//	AdminCommand.adminLoginMenu();
		System.out.println("Admin Login Screen");
		System.out.println("Please Enter Admin Username:");
		String nameU = scan.nextLine();
		System.out.println("Please Enter Admin Password:");
		String pass = scan.nextLine();
		AdministratorFinal a = AdminCommand.adminLogin(nameU, pass);
		try {
		if (a.getUsername().equals(nameU)) {
			return new AdminScreen().render(scan);
		}else {
			System.out.println("Why are you like this?");
			return new MainBankScreen().render(scan);
		}
	} catch(NullPointerException n) {
		System.out.println("Invalid Login");
		return new AdminLogin().render(scan);
	}
}
}

