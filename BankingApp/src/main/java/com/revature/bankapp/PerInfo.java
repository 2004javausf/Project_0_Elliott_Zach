package com.revature.bankapp;

import java.util.Scanner;

public class PerInfo implements BankScreen {

	@Override
	public BankScreen render(Scanner scan) {
		BankApp.isRunning = false;
		return null;
	}

}
