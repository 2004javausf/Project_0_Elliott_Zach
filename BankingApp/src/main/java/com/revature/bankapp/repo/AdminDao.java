package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.AdministratorFinal;

public interface AdminDao {
public static final String adminFile = "daoAdmin.txt";
	
	public Map<String, AdministratorFinal> viewAdmin();
	
	public void updateAdmin(Map<String, AdministratorFinal> adminMap);
	
	public AdministratorFinal getUsername(String name);
}
