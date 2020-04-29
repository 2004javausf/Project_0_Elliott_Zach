package com.revature.bankapp;

import java.io.Serializable;

import com.revature.bankapp.repo.EmpAccess;

public class EmployeeFinal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4335510043417865583L;
	
	private String username;
	private String password;
	private String nameFirst;
	private String nameLast;
	
	
	public EmployeeFinal() {
		super();
		EmployeeArmy.EmployeeListFinal.add(this);
		EmpAccess.writeEmployeeFile(EmployeeArmy.EmployeeListFinal);
	}
	
	public EmployeeFinal(String username, String password, String nameFirst, String nameLast) {
		super();
		this.username = username;
		this.password = password;
		this.nameFirst = nameFirst;
		this.nameLast = nameLast;
		EmployeeArmy.EmployeeListFinal.add(this);
		EmpAccess.writeEmployeeFile(EmployeeArmy.EmployeeListFinal);
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
