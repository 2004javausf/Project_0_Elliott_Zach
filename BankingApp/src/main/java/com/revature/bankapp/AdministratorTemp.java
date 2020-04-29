package com.revature.bankapp;

import java.io.Serializable;

public class AdministratorTemp implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2082407333412109797L;

	private String NameFirst;
	private String NameLast;
	private String Username;
	private String Password;
	
	
	public AdministratorTemp() {
		super();
		AdminCommand.AdminListTemp.add(this);
	}
	
	
	public AdministratorTemp(String nameFirst, String nameLast, String username, String password) {
		super();
		NameFirst = nameFirst;
		NameLast = nameLast;
		Username = username;
		Password = password;
		AdminCommand.AdminListTemp.add(this);
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
		return "AdministratorTemp [NameFirst=" + NameFirst + ", NameLast=" + NameLast + ", Username=" + Username
				+ ", Password=" + Password + "]";
	}
	
	
}
