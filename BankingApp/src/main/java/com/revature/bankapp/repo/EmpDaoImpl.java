package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.EmployeeFinal;

public class EmpDaoImpl implements EmpDao {

	@Override
	public Map<String, EmployeeFinal> viewEmp() {
		Map<String, EmployeeFinal> empMap = (Map<String, EmployeeFinal>) EmpAccess.readObject(employeeFile);
		return empMap;
	}

	@Override
	public void updateEmp(Map<String, EmployeeFinal> empMap) {
		EmpAccess.writeObject(employeeFile, empMap);
		
	}

	@Override
	public EmployeeFinal getUsername(String name) {
		Map<String, EmployeeFinal> empMap = viewEmp();
			for (String i:empMap.keySet()) {
				if (empMap.get(i).getUsername().equals(name)) {
					return empMap.get(i);
				}
			}
		return null;
	}
	

}
