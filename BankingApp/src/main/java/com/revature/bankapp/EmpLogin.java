package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.EmpAccess;

public class EmpLogin implements BankScreen {

	@Override
	public BankScreen render(Scanner scan) {
		EmpAccess.readEmployeeFile();
		//EmployeeArmy.empLoginMenu();
		System.out.println("Employee Login Screen");
		System.out.println("Please Enter Employee Username:");
		String nameU = scan.nextLine();
		System.out.println("Please Enter Employee Password:");
		String pass = scan.nextLine();
		EmployeeFinal a = EmployeeArmy.empLogin(nameU, pass);
		try {
		if (a.getUsername().equals(nameU)) {
			return new EmpScreen().render(scan);
		}else {
			System.out.println("Why are you like this?");
			return new MainBankScreen().render(scan);
		}
	} catch(NullPointerException n) {
		System.out.println("Invalid Login");
		return new EmpLogin().render(scan);
	}
	}

}
