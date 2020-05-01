package com.revature.bankapp;

import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class ViewAllCustInfo implements BankScreen {
	
	String backToMenu;
	CustDaoImpl cDI = new CustDaoImpl();
	AcctDaoImpl aDI = new AcctDaoImpl();

	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Customer Info: " + cDI.viewCust());
		System.out.println("Account Info: " + aDI.viewAcct());
		System.out.println("Press any key to return to Admin Menu");
		backToMenu = scan.nextLine();
		return new AdminScreen().render(scan);
	}

}
