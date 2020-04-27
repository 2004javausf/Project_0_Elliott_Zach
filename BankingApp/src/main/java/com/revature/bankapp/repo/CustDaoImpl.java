package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.Customer;

public class CustDaoImpl implements CustDao {

	@Override
	public Map<String, Customer> viewCust() {
		Map<String, Customer> custMap = (Map<String, Customer>) CustAccess.readObject(filename);
		return custMap;
	}

	@Override
	public void updateCust(Map<String, Customer> custMap) {
		CustAccess.writeObject(filename, custMap);
		
	}

	@Override
	public Customer getUsername(String name) {
		Map<String, Customer> custMap = viewCust();
		for(String i:custMap.keySet()) {
			if(custMap.get(i).getuName().equals(name)) {
				return custMap.get(i);
			}
		}
		return null;
	}

}
