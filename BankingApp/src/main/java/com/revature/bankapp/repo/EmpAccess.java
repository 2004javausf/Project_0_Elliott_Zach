package com.revature.bankapp.repo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmpAccess {

		public static Object readObject(String filename1) {
			try(ObjectInputStream ois1 = new ObjectInputStream(new FileInputStream(filename1))){
				Object obj1 = ois1.readObject();
				return obj1;
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
				return null;
		}
		
		public static void writeObject(String filename1, Object obj1) {
			try(ObjectOutputStream oos1 = new ObjectOutputStream(new FileOutputStream(filename1))) {
				oos1.writeObject(obj1); 
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
