package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.AdministratorFinal;

public class AdminDaoImpl implements AdminDao{

	@Override
	public Map<String, AdministratorFinal> viewAdmin() {
		Map<String, AdministratorFinal> adminMap = (Map<String, AdministratorFinal>) AdminAccess.readObject(adminFile);
		return adminMap;
	}

	@Override
	public void updateAdmin(Map<String, AdministratorFinal> adminMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdministratorFinal getUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
