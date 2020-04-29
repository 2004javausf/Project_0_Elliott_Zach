package com.revature.bankapp.repo;

//import java.math.BigDecimal;
import java.util.Map;

import com.revature.bankapp.AccountInfo;

public class AcctDaoImpl implements AcctDao {

	@Override
	public Map<Integer, AccountInfo> viewAcct() {
		Map<Integer, AccountInfo> acctMap = (Map<Integer, AccountInfo>) AcctAccess.readObject(filename);
		return acctMap;	
	}

	@Override
	public void updateAcct(Map<Integer, AccountInfo> acctMap) {
		AcctAccess.writeObject(filename, acctMap);
		
	}

	@Override
	public AccountInfo getAcct(int num) {
		Map<Integer, AccountInfo> acctMap = viewAcct();
		for(int i:acctMap.keySet()) {
			if(acctMap.get(i).getAcctNum() == num) {
				return acctMap.get(i);
			}
		}
		return null;
	}

//	@Override
//	public void updateAcct(Map<Integer, Double> acctMap) {
//		AcctAccess.writeObject(filename, acctMap);
//		
//	}
		
}





