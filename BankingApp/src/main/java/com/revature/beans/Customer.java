package com.revature.beans;

import java.util.ArrayList;
import java.util.Arrays;

public class Customer {
	private ArrayList [] AccountInformation;
	private ArrayList [] accountBalances;
	private ArrayList [] personalInformation;
	public ArrayList[] getAccountInformation() {
		return AccountInformation;
	}
	public void setAccountInformation(ArrayList[] accountInformation) {
		this.AccountInformation = accountInformation;
	}
	public ArrayList[] getAccountBalances() {
		return accountBalances;
	}
	public void setAccountBalances(ArrayList[] accountBalances) {
		this.accountBalances = accountBalances;
	}
	public ArrayList[] getPersonalInformation() {
		return personalInformation;
	}
	public void setPersonalInformation(ArrayList[] personalInformation) {
		this.personalInformation = personalInformation;
	}
	@Override
	public String toString() {
		return "Customer [accountInformation=" + Arrays.toString(AccountInformation) + ", accountBalances="
				+ Arrays.toString(accountBalances) + ", personalInformation=" + Arrays.toString(personalInformation)
				+ "]";
	}
	
}
