package com.revature.bankapp.repo;

import java.util.Map;
import java.util.TreeMap;

import com.revature.bankapp.Customer;

public class CustDaoImpl implements CustDao {

	@Override
	public TreeMap<String, Customer> viewCust() {
		TreeMap<String, Customer> custMap = (TreeMap<String, Customer>) CustAccess.readObject(filename);
		return custMap;
	}

	@Override
	public void updateCust(TreeMap<String, Customer> custMap) {
		CustAccess.writeObject(filename, custMap);
		
	}

	@Override
	public Customer getUsername(String name) {
		TreeMap<String, Customer> custMap = viewCust();
		for(String i:custMap.keySet()) {
			if(custMap.get(i).getuName().equals(name)) {
				return custMap.get(i);
			}
		}
		return null;
	}

}
