package com.revature.bankapp;

import java.util.Map;
import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;
import com.revature.bankapp.Customer;

public class CustAccountScreen implements BankScreen {
	
	
	AccountInfo acct;
	
	AcctDaoImpl aDI = new AcctDaoImpl();
	
	CustDaoImpl cDI = new CustDaoImpl();
	
	int aNum;
	int aNum2;
	String nameU;
	String word;
	String choice;
	String exit;
	String stop;
	Scanner sc = new Scanner(System.in);
	
	public CustAccountScreen() {
		this.acct = new AccountInfo();
	}

	@Override
	public BankScreen render(Scanner scan){
				
		System.out.println("Welcome Customer!");
		System.out.println("Please enter your acct number.");
		aNum = scan.nextInt();
		System.out.println("Please enter your username.");
		nameU = sc.nextLine();
		System.out.println("Please enter your password.");
		word = sc.nextLine();
	try {	
		if(cDI.getUsername(nameU).getPass().equals(word) && cDI.getUsername(nameU).getAcctNum() == aNum
				&& cDI.getUsername(nameU).isValid() == true) {
			System.out.println("Welcome " + nameU + ".");
			System.out.println("What would you like to do?");
			System.out.println("1: Check Balance and View Personal Information");
			System.out.println("2: Make Deposit");
			System.out.println("3: Withdraw Money");
			System.out.println("4  Transfer Money");
			System.out.println("5: Return to Main Menu");
			choice = sc.nextLine();
			
			if(choice.equals("1")) {
				System.out.println("Your current balance is $" + aDI.getAcct(aNum).getAmount());
				System.out.println("Here is your personal info: " + "First Name: " + cDI.getUsername(nameU).getfName()
						+ " Last Name: " + cDI.getUsername(nameU).getlName() + " User Name: " + cDI.getUsername(nameU).getuName()
						+ " Account Number: " + cDI.getUsername(nameU).getAcctNum());
				System.out.println("Press any key to continue");
				stop = sc.nextLine();
				
			}
			if(choice.equals("2")) {
				System.out.println("How much would you like to deposit?");
				int amt = scan.nextInt();
				if(amt > 0) {
					int money = aDI.getAcct(aNum).getAmount();
					money = money + amt;
					acct.setAcctNum(aNum);
					acct.setAmount(money);
					Map<Integer, AccountInfo> db = aDI.viewAcct();
					db.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db);
					System.out.println("Your new balance is $" + aDI.getAcct(aNum).getAmount());
					return new CustAccountScreen().render(scan);
				}
				
				else {
					System.out.println("You cannot deposit a negative number.");
					System.out.println("Please log back in");
					return new CustAccountScreen().render(scan);
				}
			}
			
			else if(choice.equals("3")) {
				System.out.println("How much would you like to withdraw?");
				int wAmt = scan.nextInt();
				int wMoney = aDI.getAcct(aNum).getAmount();
				int wTotal = wMoney - wAmt;
				if(wTotal >= 0) {
					acct.setAcctNum(aNum);
					acct.setAmount(wTotal);
					Map<Integer, AccountInfo> db2 = aDI.viewAcct();
					db2.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db2);
					System.out.println("Your new balance is $" + aDI.getAcct(aNum).getAmount());
					return new CustAccountScreen().render(scan);
					
				}
				
				else {
					System.out.println("You cannot overdraw your account");
					System.out.println("Please log back in");
					return new CustAccountScreen().render(scan);
				}
				
			}
			
			else if (choice.equals("4")) {
				String stop2;
				System.out.println("How much would you like to transfer");
				int tAmt = scan.nextInt();
				int tMoney = aDI.getAcct(aNum).getAmount();
				int tTotal = tMoney - tAmt;
				if(tTotal >= 0) {
					acct.setAcctNum(aNum);
					acct.setAmount(tTotal);
					Map<Integer, AccountInfo> db2 = aDI.viewAcct();
					db2.put(acct.getAcctNum(), acct);
					aDI.updateAcct(db2);
					System.out.println("Your new balance is $" + aDI.getAcct(aNum).getAmount());
						if(tTotal == tTotal) {
							System.out.println("Which account are you transferring to?");
							aNum2 = scan.nextInt();
							int rMoney = aDI.getAcct(aNum2).getAmount();
							int moneyMoves = rMoney + tAmt;
							acct.setAcctNum(aNum2);
							acct.setAmount(moneyMoves);
							Map<Integer, AccountInfo> db3 = aDI.viewAcct();
							db3.put(acct.getAcctNum(), acct);
							aDI.updateAcct(db3);
							System.out.println("Your new balance is $" + aDI.getAcct(aNum2).getAmount());
							return new CustAccountScreen().render(scan);
						}
				
				}
				
				else {
					System.out.println("Invalid Input");
					System.out.println("Please log back in");
					return new CustAccountScreen().render(scan);
				}
			}
			
		}
		
		else if (!cDI.getUsername(nameU).getPass().equals(word) || cDI.getUsername(nameU).getuName().equals(null)
				|| cDI.getUsername(nameU).getAcctNum() != aNum || cDI.getUsername(nameU).isValid() == false){
			System.out.println("That combination does not match our records.");
			System.out.println("You might not have access to this area if you have not been approved.");
			System.out.println("");
			System.out.println("If you have not yet been approved please press E to return to main menu.");
			System.out.println("");
			System.out.println("Or press any other key to attempt to log in again.");
			exit = sc.nextLine();
				if(exit.equalsIgnoreCase("E")) {
					return new MainBankScreen().render(scan);
				}
				
				else {
				return new CustAccountScreen().render(scan);
				}
		}
		}
		catch(NullPointerException n) {
			System.out.println("Incorrect Login Info");
			return new CustAccountScreen().render(scan);
		}
		
		return new MainBankScreen().render(scan);
	}
		
}


