package com.revature.bankapp;

import java.util.Scanner;

public class BankApp {
	
	static boolean isRunning = true;
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		BankScreen presentScreen = new MainBankScreen();
		
		while(isRunning) {
			presentScreen = presentScreen.render(scan);
		}
		
	}

}
