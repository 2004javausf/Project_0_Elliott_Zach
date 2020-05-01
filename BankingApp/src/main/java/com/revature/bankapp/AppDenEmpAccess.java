package com.revature.bankapp;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class AppDenEmpAccess implements BankScreen {

	CustDaoImpl cDI = new CustDaoImpl();
	AcctDaoImpl aDI = new AcctDaoImpl();
	AccountInfo acct;
	Customer cust;
	String typApD;
	String nameU;
	String dec;
	int counter = 1;
	Scanner sc = new Scanner(System.in);
	public AppDenEmpAccess() {
		this.acct = new AccountInfo();
		this.cust = new Customer();
	}
	
	public BankScreen render(Scanner scan) {
		System.out.println("==================================");
		System.out.println("Welcome to Application Approve/Deny");
		System.out.println("What action would you like to implement?");
		System.out.println("1: Approve/Deny");
		System.out.println("2: Return to Main Menu");
		System.out.println("3: Exit Application");
		System.out.println("==================================");
		
		typApD = scan.nextLine();
		if (typApD.equals("1")) {
			System.out.println("Enter the username of the account you wish to view.");
			nameU = scan.nextLine();
			System.out.println("Account Number: " + cDI.getUsername(nameU).getAcctNum() + " First Name: " + cDI.getUsername(nameU).getfName() +
					" Last Name: " + cDI.getUsername(nameU).getlName());
			System.out.println("Would you like to approve or deny the account?");
			System.out.println("Type A or D");
			dec = scan.nextLine();
			if(dec.equalsIgnoreCase("A")) {
				acct.setAcctNum(cDI.getUsername(nameU).getAcctNum());
				acct.setAmount(100);
				Map<Integer, AccountInfo> db = aDI.viewAcct();
				db.put(acct.getAcctNum(), acct);
				aDI.updateAcct(db);
				while(counter == 1) {
					System.out.println("Please re-enter first name.");
					cust.setfName(scan.nextLine());
					System.out.println("Please re-enter last name.");
					cust.setlName(scan.nextLine());
					System.out.println("Please re-enter username.");
					cust.setuName(scan.nextLine());
					System.out.println("Please re-enter password.");
					cust.setPass(scan.nextLine());
					System.out.println("Please re-enter account number.");
					cust.setAcctNum(sc.nextInt());
					cust.setAcctNum2(0);
					cust.setuName(nameU);
					cust.setValid(true);
					TreeMap<String, Customer> db3 = cDI.viewCust();
					db3.put(cust.getuName(), cust);
					cDI.updateCust(db3);
					counter ++;
				}
				return new AppDenEmpAccess().render(scan);
			}
			else if(dec.equalsIgnoreCase("D")) {
				TreeMap<String, Customer> db2 = cDI.viewCust();
				db2.remove(nameU);
				cDI.updateCust(db2);
				
				return new AppDenEmpAccess().render(scan);
			}
			else {
				System.out.println("Invalid Entry");
				return new AppDenEmpAccess().render(scan);
			}
		}
		
		else if (typApD.equals("2")) {
			return new MainBankScreen().render(scan);
		}
		else if (typApD.equals("3")) {
			BankApp.isRunning = false;
			return null;
		}else {
			System.out.println("Invalid Entry");
			return new AppDenEmpAccess().render(scan);
		}

	}

}
