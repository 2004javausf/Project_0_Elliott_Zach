package com.revature.bankapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class BankApp {
	
	static boolean isRunning = true;
	static CustDaoImpl cDI = new CustDaoImpl();
	static Customer cust = new Customer();
	static AccountInfo acct = new AccountInfo();
	static AcctDaoImpl aDI = new AcctDaoImpl();
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BankScreen presentScreen = new MainBankScreen();
		
		while(isRunning) {
			presentScreen = presentScreen.render(scan);
		}
		
	}

}
