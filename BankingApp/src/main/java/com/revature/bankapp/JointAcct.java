package com.revature.bankapp;

import java.util.Scanner;
import java.util.TreeMap;

import com.revature.bankapp.repo.CustDaoImpl;

public class JointAcct implements BankScreen {
	
	Customer cust;
	Customer cust2;
	
	CustDaoImpl cDI = new CustDaoImpl();
	
	int randNum = (int) (Math.random() * 1000) + 1;
	int randNum2 = (int) (Math.random() * 90) + 1;
	int number = randNum + randNum2;
	
	public JointAcct() {
		this.cust = new Customer();
		this.cust2 = new Customer();
	}

	@Override
	public BankScreen render(Scanner scan) {
		System.out.println(randNum + randNum2);
		System.out.println("We are happy you have decided to choose our bank!");
		System.out.println("Please enter some information for our records.");
		System.out.println("What is your first name of the first person on the account?");
		cust.setfName(scan.nextLine());
		System.out.println("What is your last name first person on the account??");
		cust.setlName(scan.nextLine());
		System.out.println(randNum + randNum2);
		System.out.println("What would you like your username of the first person to be?");
		cust.setuName(scan.nextLine());
		System.out.println("What would you like your password of the first person to be?");
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
			System.out.println("When approved your account number will be: " + number);
			if(randNum == randNum) {
				System.out.println("What is your first name of the second person on the account?");
				cust2.setfName(scan.nextLine());
				System.out.println("What is your last name second person on the account??");
				cust2.setlName(scan.nextLine());
				System.out.println("What would you like your username of the second person to be?");
				cust2.setuName(scan.nextLine());
				System.out.println("What would you like your password of the second person to be?");
				cust2.setPass(scan.nextLine());
				cust2.setAcctNum2(0);
				if(cDI.viewCust().containsKey(cust.getuName())) {
					System.out.println("I'm sorry that username exsits already.");
					System.out.println("Please enter another username");
					cust2.setuName(scan.nextLine());
					TreeMap<String, Customer> db2 = cDI.viewCust();
					db2.put(cust2.getuName(), cust2);
					cDI.updateCust(db2);
					System.out.println("Thank You!");
					System.out.println("Be aware you will not have access to an account until you are approved.");
					System.out.println("When approved your account number will be: " + number);
					return new MainBankScreen().render(scan);
				}
				
				else {
					TreeMap<String, Customer> db2 = cDI.viewCust();
					db2.put(cust2.getuName(), cust2);
					cDI.updateCust(db2);
					System.out.println("Thank You!");
					System.out.println("Be aware you will not have access to an account until you are approved.");
					System.out.println("When approved your account number will be: " + number);
					return new MainBankScreen().render(scan);
				}
				
			}
			return new MainBankScreen().render(scan);
		}
		
		else {
			TreeMap<String, Customer> db = cDI.viewCust();
			db.put(cust.getuName(), cust);
			cDI.updateCust(db);
			System.out.println("Thank You!");
			System.out.println("When approved your account number will be: " + number);
			if(randNum == randNum) {
				System.out.println("What is your first name of the second person on the account?");
				cust2.setfName(scan.nextLine());
				System.out.println("What is your last name second person on the account??");
				cust2.setlName(scan.nextLine());
				System.out.println(randNum + randNum2);
				System.out.println("What would you like your username of the second person to be?");
				cust2.setuName(scan.nextLine());
				System.out.println("What would you like your password of the second person to be?");
				cust2.setPass(scan.nextLine());
				cust2.setAcctNum(randNum + randNum2);
				cust2.setAcctNum2(0);
				if(cDI.viewCust().containsKey(cust2.getuName())) {
					System.out.println("I'm sorry that username exsits already.");
					System.out.println("Please enter another username");
					cust2.setuName(scan.nextLine());
					TreeMap<String, Customer> db2 = cDI.viewCust();
					db2.put(cust2.getuName(), cust2);
					cDI.updateCust(db2);
					System.out.println("Thank You!");
					System.out.println("Be aware you will not have access to an account until you are approved.");
					System.out.println("When approved your account number will be: " + number);
					return new MainBankScreen().render(scan);
				}
				
				else {
					TreeMap<String, Customer> db2 = cDI.viewCust();
					db2.put(cust2.getuName(), cust2);
					cDI.updateCust(db2);
					System.out.println("Thank You!");
					System.out.println("Be aware you will not have access to an account until you are approved.");
					System.out.println("When approved your account number will be: " + number);
					return new MainBankScreen().render(scan);
				}
			}
			return new MainBankScreen().render(scan);
		}
		
	}

}
