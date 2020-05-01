package com.revature.bankapp;

import java.util.Map;
import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;

public class AdminDWT implements BankScreen {
	
	AccountInfo acct;
	AcctDaoImpl aDI = new AcctDaoImpl();
	CustDaoImpl cDI = new CustDaoImpl();
	String nameU;
	String typADWT;
	String secTypADWT;
	int num;
	int num2;
	Scanner sc = new Scanner(System.in);
	public AdminDWT() {
		this.acct = new AccountInfo();
	}
	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Admin Level D/W/T Screen");
		System.out.println("How would you like to proceed?");
		System.out.println("1: D/W/T for Client");
		System.out.println("2: Return to Admin Screen");
		System.out.println("3: Return to Main Menu");
		System.out.println("4: Exit Application");
		
		typADWT=scan.nextLine();
		if (typADWT.equals("1")) {
			System.out.println("Please enter the Username of the client ");
			System.out.println("you wish to alter.");
			nameU = scan.nextLine();
			num = cDI.getUsername(nameU).getAcctNum();
			System.out.println("This client's balance is: " + aDI.getAcct(num).getAmount());
			System.out.println("=================================");
			System.out.println("What would you like to do?");
			System.out.println("1: Deposit");
			System.out.println("2: Withdraw");
			System.out.println("3: Transfer");
			System.out.println("4: Return to top");
			System.out.println("5: Return to Admin Screen");
			System.out.println("6: Return to Main Menu");
			System.out.println("7: Exit Application");
			secTypADWT=scan.nextLine();
			if (secTypADWT.equals("1")) {
				System.out.println("How much would you like to deposit?");
				int amt = sc.nextInt();
				if(amt > 0) {
					int money = aDI.getAcct(num).getAmount();
					money = money + amt;
					acct.setAcctNum(num);
					acct.setAmount(money);
					Map<Integer, AccountInfo> db = aDI.viewAcct();
					db.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db);
					System.out.println("Your new balance is $" + aDI.getAcct(num).getAmount());
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}else if (amt == 0) {
					System.out.println("You cannot deposit a null amount.");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}else {
					System.out.println("Invalid Entry or Negative Number");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}
			}else if (secTypADWT.equals("2")) {
				System.out.println("How much would you like to withdraw?");
				int amt = sc.nextInt();
				if(amt > 0) {
					int money = aDI.getAcct(num).getAmount();
					money = money - amt;
					acct.setAcctNum(num);
					acct.setAmount(money);
					Map<Integer, AccountInfo> db2 = aDI.viewAcct();
					db2.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db2);
					System.out.println("Your new balance is $" + aDI.getAcct(num).getAmount());
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}else if (amt == 0) {
					System.out.println("You cannot withdraw a null amount.");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}else {
					System.out.println("Invalid Entry or Negative Number");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}	
			}else if (secTypADWT.equals("3")) {
				System.out.println("How much would you like to transfer");
				int tAmt = sc.nextInt();
				int tMoney = aDI.getAcct(num).getAmount();
				int tTotal = tMoney - tAmt;
				if(tTotal >= 0) {
					acct.setAcctNum(num);
					acct.setAmount(tTotal);
					Map<Integer, AccountInfo> db3 = aDI.viewAcct();
					db3.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db3);
					System.out.println("Your new balance is $" + aDI.getAcct(num).getAmount());
						if(tTotal == tTotal) {
							System.out.println("Which account are you transferring to?");
							num2 = sc.nextInt();
							int rMoney = aDI.getAcct(num2).getAmount();
							int moneyMoves = rMoney + tAmt;
							acct.setAcctNum(num2);
							acct.setAmount(moneyMoves);
							Map<Integer, AccountInfo> db4 = aDI.viewAcct();
							db4.put(acct.getAcctNum(), acct);
							aDI.updateAcct(db4);
							System.out.println("Your new balance is $" + aDI.getAcct(num2).getAmount());
							return new AdminDWT().render(scan);
						}else {
							return null;
						}
				}else if (tAmt == 0) {
					System.out.println("You cannot withdraw a null amount.");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}else {
					System.out.println("Invalid Entry or Negative Number");
					System.out.println("Returning to Admin DWT Screen");
					return new AdminDWT().render(scan);
				}
			}else if(secTypADWT.equals("4")) {
				System.out.println("Returning to Admin DWT Screen");
				return new AdminDWT().render(scan);
			}else if(secTypADWT.equals("5")) {
				System.out.println("Returning to Admin Screen");
				return new AdminScreen().render(scan);
			}else if(secTypADWT.equals("6")) {
				System.out.println("Returning to Main Menu");
				return new MainBankScreen().render(scan);
			}else if (secTypADWT.equals("7")) {
				System.out.println("Exiting Application");
				BankApp.isRunning = false;
			}else {
				System.out.println("Invalid Entry");
				System.out.println("Returning to Admin DWT Screen");
				return new AdminDWT().render(scan);
			}
		return null;
	}else if(typADWT.equals("2")) {
		System.out.println("Returning to Admin Screen");
		return new AdminScreen().render(scan);
	}else if(typADWT.equals("3")) {
		System.out.println("Returning to Main Menu");
		return new MainBankScreen().render(scan);
	}else if(typADWT.equals("4")) {
		System.out.println("Exiting Application");
		BankApp.isRunning = false;
	}else {
		System.out.println("Invalid Entry");
		System.out.println("Returning to Admin DWT Screen");
		return new AdminDWT().render(scan);
	}
		return null;
	}
}
