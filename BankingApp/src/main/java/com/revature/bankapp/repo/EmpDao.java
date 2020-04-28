package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.Employee;

public interface EmpDao {
	String filename1 = "daoEmp.txt";
	
	public Map<String, Employee> viewEmp();
	
	public void updateEmp(Map<String, Employee> EmpMap);
	
	public Employee getUsername(String name);
	
}
