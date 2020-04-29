package com.revature.bankapp;

import java.io.Serializable;

public class AccountInfo implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5337047338247397053L;
	
	private int acctNum;
	private int amount = 0;
	
	

	public AccountInfo() {
		super();
	}
	
	public AccountInfo(int acctNum, int amount) {
		super();
		this.acctNum = acctNum;
		this.amount = amount;
	}

	public Integer getAcctNum() {
		return acctNum;
	}

	public void setAcctNum(int acctNum) {
		this.acctNum = acctNum;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "AccountInfo [acctNum=" + acctNum + ", amount=" + amount + "]";
	}


}
