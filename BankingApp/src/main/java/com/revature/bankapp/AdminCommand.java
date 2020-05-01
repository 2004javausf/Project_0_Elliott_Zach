package com.revature.bankapp;

import java.util.ArrayList;
import java.util.List;

public class AdminCommand {
	
	public static List<AdministratorTemp> AdminListTemp = new ArrayList<AdministratorTemp>();
	
	public static List<AdministratorFinal> AdminListFinal = new ArrayList<AdministratorFinal>();
	public static AdministratorFinal adminLogin (String inputUsername, String inputPassword) {
		for (int i = 0; i < AdminListFinal.size(); i++) {
			String username = AdminListFinal.get(i).getUsername();
			String Password = AdminListFinal.get(i).getPassword();
			if(inputUsername.equals(username) && inputPassword.equals(Password)) {
				return AdminListFinal.get(i);
			}
		}
		System.out.println("asdf");
		BankApp.isRunning = false;
		return null;
	}
}
