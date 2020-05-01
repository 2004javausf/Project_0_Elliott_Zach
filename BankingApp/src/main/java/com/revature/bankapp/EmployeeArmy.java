package com.revature.bankapp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeArmy {
	public static List<EmployeeTemp> EmployeeListTemp= new ArrayList<EmployeeTemp>();
	
	public static List<EmployeeFinal> EmployeeListFinal = new ArrayList<EmployeeFinal>();
	
	public static EmployeeFinal empLogin (String inputUsername, String inputPassword) {
		for (int i = 0; i < EmployeeListFinal.size(); i++) {
			String username = EmployeeListFinal.get(i).getUsername();
			String Password = EmployeeListFinal.get(i).getPassword();
			if(inputUsername.equals(username) && inputPassword.equals(Password)) {
				return EmployeeListFinal.get(i);
			}
		}
		System.out.println("asdf");
		BankApp.isRunning = false;
		return null;
	}
}
