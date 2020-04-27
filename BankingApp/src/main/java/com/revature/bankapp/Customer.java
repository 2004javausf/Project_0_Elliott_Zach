package com.revature.bankapp;

import java.io.Serializable;

public class Customer implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6587735379263816661L;
	
	private String fName;
	private String lName;
	private String uName;
	private String pass;
	private boolean isValid = false;
	
	public Customer() {
		super();
	}

	public Customer(String fName, String lName, String uName, String pass, boolean isValid) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.uName = uName;
		this.pass = pass;
		this.isValid = isValid;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public boolean isValid() {
		return isValid;
	}
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}

	@Override
	public String toString() {
		return "Customer [fName=" + fName + ", lName=" + lName + ", uName=" + uName + ", pass=" + pass + ", isValid="
				+ isValid + "]";
	}
	
	

}
