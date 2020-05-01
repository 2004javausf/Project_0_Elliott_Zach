package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.EmployeeFinal;

public interface EmpDao {
	public static final String employeeFile = "daoEmp.txt";
	
	public Map<String, EmployeeFinal> viewEmp();
	
	public void updateEmp(Map<String, EmployeeFinal> EmpMap);
	
	public EmployeeFinal getUsername(String name);
	
}
