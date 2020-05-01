package com.revature.bankapp;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.revature.bankapp.repo.CustDaoImpl;

public class CustApplyScreen implements BankScreen {
	
	Customer cust;
	
	CustDaoImpl cDI = new CustDaoImpl();
	
	int randNum = (int) (Math.random() * 1000) + 1;
	int randNum2 = (int) (Math.random() * 90) + 1;
	
	public CustApplyScreen() {
		this.cust = new Customer();
	}

	@Override
	public BankScreen render(Scanner scan) {
		System.out.println(randNum);
		System.out.println("We are happy you have decided to choose our bank!");
		System.out.println("Please enter some information for our records.");
		System.out.println("What is your first name?");
		cust.setfName(scan.nextLine());
		System.out.println("What is your last name?");
		cust.setlName(scan.nextLine());
		System.out.println("What would you like your username to be?");
		cust.setuName(scan.nextLine());
		System.out.println("What would you like your password to be?");
		cust.setPass(scan.nextLine());
		cust.setAcctNum(randNum + randNum2);
		cust.setAcctNum2(0);
		
		if(cDI.viewCust().containsKey(cust.getuName())) {
			System.out.println("I'm sorry that username exsits already.");
			System.out.println("Please enter another username");
			cust.setuName(scan.nextLine());
			TreeMap<String, Customer> db = cDI.viewCust();
			db.put(cust.getuName(), cust);
			cDI.updateCust(db);
			System.out.println("Thank You!");
			System.out.println("Be aware you will not have access to an account until you are approved.");
			return new MainBankScreen().render(scan);
		}
		
		else {
			TreeMap<String, Customer> db = cDI.viewCust();
			db.put(cust.getuName(), cust);
			cDI.updateCust(db);
			System.out.println("Thank You!");
			System.out.println("Be aware you will not have access to an account until you are approved.");
			return new MainBankScreen().render(scan);
		}
		
	}

}
