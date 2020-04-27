package com.revature.bankapp.repo;

import java.util.Map;

import com.revature.bankapp.Customer;

public interface CustDao {
	
	String filename = "daoCust.txt";
	
	public Map<String, Customer> viewCust();
	
	public void updateCust(Map<String, Customer> custMap);
	
	public Customer getUsername(String name);
	
	

}
