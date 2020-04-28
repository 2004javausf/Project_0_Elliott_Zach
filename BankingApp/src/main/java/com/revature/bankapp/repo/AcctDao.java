package com.revature.bankapp.repo;

import java.math.BigDecimal;
import java.util.Map;

import com.revature.bankapp.AccountInfo;

public interface AcctDao {
	
String filename = "daoAcct.txt";
	
	public Map<Integer, AccountInfo> viewAcct();
	
	public void updateAcct(Map<Integer, AccountInfo> acctMap);
	
	public AccountInfo getAcct(int num);

}
