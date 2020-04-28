package com.revature.bankapp;

import java.io.Serializable;

public class AccountInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5337047338247397053L;
	
	private String fName2;
	private String lname2;
	private String uName2;
	private int acctNum;
	private double amount = 0.0;
	
	public AccountInfo() {
		
	}

	public AccountInfo(String fName2, String lname2, String uName2, int acctNum, double amount) {
		super();
		this.fName2 = fName2;
		this.lname2 = lname2;
		this.uName2 = uName2;
		this.acctNum = acctNum;
		this.amount = amount;
	}

	public String getfName2() {
		return fName2;
	}

	public void setfName2(String fName2) {
		this.fName2 = fName2;
	}

	public String getLname2() {
		return lname2;
	}

	public void setLname2(String lname2) {
		this.lname2 = lname2;
	}

	public String getuName2() {
		return uName2;
	}

	public void setuName2(String uName2) {
		this.uName2 = uName2;
	}

	public int getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AccountInfo [fName2=" + fName2 + ", lname2=" + lname2 + ", uName2=" + uName2 + ", acctNum=" + acctNum
				+ ", amount=" + amount + "]";
	}

}
