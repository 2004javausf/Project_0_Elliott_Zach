package com.revature.bankapp.repo;

import java.util.Map;
import java.util.TreeMap;

import com.revature.bankapp.Customer;

public interface CustDao {
	
	String filename = "daoCust.txt";
	
	public TreeMap<String, Customer> viewCust();
	
	public void updateCust(TreeMap<String, Customer> custMap);
	
	public Customer getUsername(String name);

}
