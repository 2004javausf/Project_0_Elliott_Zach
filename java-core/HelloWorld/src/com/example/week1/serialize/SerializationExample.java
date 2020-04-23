package com.example.week1.serialize;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		
		String filename = "./sampleObjectFile.txt";
		
		Person person = new Person("Jacob", 70, "555-55-5555");
		Person person2 = new Person("Elliott", 28, "554-55-5555");
		System.out.println(person.getClass());
		writeObject(filename,person2);
		readObject(filename);
	
	}
	
	static void readObject(String filename) {
		
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
			
			Object obj = ois.readObject();
			Person person = (Person) obj;
			System.out.println(person.getAge());
			System.out.println(obj);
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		} 
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	static void writeObject(String filename, Object obj) {
		
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
			oos.writeObject(obj);
		} 
		catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
