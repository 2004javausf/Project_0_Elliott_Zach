package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public Map<String, Employee> viewEmp() {
		Map<String, Employee> empMap = (Map<String, Employee>) EmpAccess.readObject(filename1);
		return empMap;
	}

	@Override
	public void updateEmp(Map<String, Employee> empMap) {
		EmpAccess.writeObject(filename1, empMap);
		
	}

	@Override
	public Employee getUsername(String name) {
		Map<String, Employee> empMap = viewEmp();
			for (String i:empMap.keySet()) {
				if (empMap.get(i).getUsername().equals(name)) {
					return empMap.get(i);
				}
			}
		return null;
	}
	

}
