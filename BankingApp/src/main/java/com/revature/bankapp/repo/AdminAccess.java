package com.revature.bankapp.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;

import com.revature.bankapp.AdminCommand;
import com.revature.bankapp.AdministratorFinal;

public class AdminAccess implements AdminDao {
	
	public static void writeAdminFile(List<AdministratorFinal> a) {
		try {
			ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(adminFile));
			objectOut.writeObject(a);
			objectOut.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public static void readAdminFile() {
		try {
			ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(adminFile));
			AdminCommand.AdminListFinal = ((ArrayList<AdministratorFinal>) objectIn.readObject());
			objectIn.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public Map<String, AdministratorFinal> viewAdmin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateAdmin(Map<String, AdministratorFinal> adminMap) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public AdministratorFinal getUsername(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public static Map<String, AdministratorFinal> readObject(String adminfile) {
		// TODO Auto-generated method stub
		return null;
	}

}
