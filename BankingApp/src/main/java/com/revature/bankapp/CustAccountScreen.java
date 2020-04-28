package com.revature.bankapp;

import java.util.Map;
import java.util.Scanner;

import com.revature.bankapp.repo.AcctDaoImpl;
import com.revature.bankapp.repo.CustDaoImpl;


public class CustAccountScreen implements BankScreen {

	AccountInfo acct;
	
	AcctDaoImpl aDI = new AcctDaoImpl();
	
	CustDaoImpl cDI = new CustDaoImpl();
	
	
	
	int aNum;
	String nameU;
	String word;
	String choice;
	
	public CustAccountScreen() {
		this.acct = new AccountInfo();
	}

	@Override
	public BankScreen render(Scanner scan) {
		System.out.println("Welcome Customer!");
		System.out.println("Please enter your acct number.");
		aNum = scan.nextInt();
		System.out.println("Please enter your username.");
		nameU = scan.next();
		System.out.println("Please enter your password.");
		word = scan.next();
		
		if(cDI.getUsername(nameU).getPass().equals(word) && aDI.getAcct(aNum).getuName2().equals(nameU)) {
			System.out.println("Welcome " + nameU + ".");
			System.out.println("What would you like to do?");
			System.out.println("1: Check Balance");
			System.out.println("2: Make Deposit");
			System.out.println("3: Withdraw Money");
			System.out.println("4: Return to Main Menu");
			choice = scan.next();
			
			if(choice.equals("1")) {
				System.out.println(aDI.getAcct(aNum).getAmount());
				
			}
			if(choice.equals("2")) {
				String stop;
				System.out.println("How much would you like to deposit?");
				double amt = scan.nextDouble();
				if(amt > 0) {
					Map<Integer, AccountInfo> db = aDI.viewAcct();
					double money = aDI.getAcct(aNum).getAmount();
					System.out.println(money);
					money = money + amt;
					System.out.println(money);
					aDI.getAcct(aNum).setAmount(money);
					aDI.updateAcct(db);
					System.out.println(aDI.getAcct(aNum).getAmount());
					System.out.println("WAIT");
					stop = scan.next();
					
				}
				else {
					System.out.println("Nope");
				}
			}
			
		}
		
		else {
			System.out.println("That doesn't match any records.");
			return new CustAccountScreen().render(scan);
		}
		
		
		return new MainBankScreen().render(scan);
	}
		
}


