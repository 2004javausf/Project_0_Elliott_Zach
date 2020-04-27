package com.revature.bankapp;

import java.util.Scanner;

public class AppDen implements BankScreen {

	@Override
	public BankScreen render(Scanner scan) {
		BankApp.isRunning = false;
		return null;
	}

}
