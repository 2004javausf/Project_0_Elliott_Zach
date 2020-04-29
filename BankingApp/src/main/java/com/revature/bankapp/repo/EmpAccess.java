package com.revature.bankapp.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;


import com.revature.bankapp.EmployeeArmy;
import com.revature.bankapp.EmployeeFinal;

public class EmpAccess implements EmpDao {

		@SuppressWarnings("unchecked")
		public static void readEmployeeFile() {
			try {
				ObjectInputStream objectIn = new ObjectInputStream(new FileInputStream(employeeFile));
				EmployeeArmy.EmployeeListFinal = ((ArrayList<EmployeeFinal>) objectIn.readObject());
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
		
		public static void writeEmployeeFile(List<EmployeeFinal> a) {
			try {
				ObjectOutputStream objectOut = new ObjectOutputStream(new FileOutputStream(employeeFile));
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

		@Override
		public Map<String, EmployeeFinal> viewEmp() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void updateEmp(Map<String, EmployeeFinal> EmpMap) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public EmployeeFinal getUsername(String name) {
			// TODO Auto-generated method stub
			return null;
		}

		public static void writeObject(String employeefile, Map<String, EmployeeFinal> empMap) {
			// TODO Auto-generated method stub
			
		}

		public static Map<String, EmployeeFinal> readObject(String employeefile) {
			// TODO Auto-generated method stub
			return null;
		}

}
