package com.revature.bankapp;

import java.io.Serializable;

public class EmployeeTemp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1385960066856718205L;
	
	private String username;
	private String password;
	private String nameFirst;
	private String nameLast;
	
	
	public EmployeeTemp() {
		super();
		EmployeeArmy.EmployeeListTemp.add(this);
	}
	
	public EmployeeTemp(String username, String password, String nameFirst, String nameLast) {
		super();
		this.username = username;
		this.password = password;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		EmployeeArmy.EmployeeListTemp.add(this);
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNameFirst() {
		return nameFirst;
	}
	public void setNameFirst(String nameFirst) {
		this.nameFirst = nameFirst;
	}
	public String getNameLast() {
		return nameLast;
	}
	public void setNameLast(String nameLast) {
		this.nameLast = nameLast;
	}
	
	@Override
	public String toString() {
		return "Employee [username=" + username + ", password=" + password + ", nameFirst=" + nameFirst + ", nameLast="
				+ nameLast + "]";
	}
}
