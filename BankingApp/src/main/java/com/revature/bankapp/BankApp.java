package com.revature.bankapp;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		
		
//		Map<String, Customer> custMap = new HashMap<>();
//		cust.setfName("John");
//		cust.setlName("Smith");
//		cust.setuName("JSmith");
//		cust.setPass("pass");
//		//db.put(cust.getuName(), cust);
//		cDI.updateCust(custMap);
//		
//		//Map<String, Customer> custMap = new HashMap<>();
//		//db.put(cust.getuName(), acct);
////		cDI.updateCust(custMap);
//	Map<Integer, AccountInfo> acctMap = new HashMap<>();
//		acct.setAcctNum(555);
//		acct.setAmount(100);
//	aDI.updateAcct(acctMap);
		
		BankScreen presentScreen = new MainBankScreen();
		
		while(isRunning) {
			presentScreen = presentScreen.render(scan);
		}
		
	}

}
