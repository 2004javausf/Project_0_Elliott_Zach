package com.revature.bankapp;

import java.io.Serializable;

import com.revature.bankapp.repo.AdminAccess;

public class AdministratorFinal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4140022154205887755L;

	private String NameFirst;
	private String NameLast;
	private String Username;
	private String Password;
	
	public AdministratorFinal() {
		super();
		AdminCommand.AdminListFinal.add(this);
		AdminAccess.writeAdminFile(AdminCommand.AdminListFinal);
	}
	
	public AdministratorFinal(String nameFirst, String nameLast, String username, String password) {
		super();
		NameFirst = nameFirst;
		NameLast = nameLast;
		Username = username;
		Password = password;
		AdminCommand.AdminListFinal.add(this);
		AdminAccess.writeAdminFile(AdminCommand.AdminListFinal);
	}

	public String getNameFirst() {
		return NameFirst;
	}
	public void setNameFirst(String nameFirst) {
		NameFirst = nameFirst;
	}
	public String getNameLast() {
		return NameLast;
	}
	public void setNameLast(String nameLast) {
		NameLast = nameLast;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "AdministratorFinal [NameFirst=" + NameFirst + ", NameLast=" + NameLast + ", Username=" + Username
				+ ", Password=" + Password + "]";
	}
	
}
