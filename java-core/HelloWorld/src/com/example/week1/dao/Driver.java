package com.example.week1.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.week1.dao.model.Person;
import com.example.week1.repo.PersonDaoImpl;

public class Driver {

	public static void main(String[] args) {
		PersonDaoImpl pDI = new PersonDaoImpl();
		
		Map<Integer, Person> pmap = new HashMap<Integer, Person>();
		
//		pmap.put(1, new Person("Jacob", 89));
//		pmap.put(2, new Person("Falzone", 25));
//		pmap.put(3, new Person("Jerett", 26));
//		pmap.put(4, new Person("Anthony", 21));
//		pmap.put(5, new Person("Jesus", 32));
//		
//		pDI.updatePersonMap(pmap);
		
		//System.out.println(pDI.getAllPeople());
		
		//System.out.println(pDI.getPerson("Jacob"));
		
		Person jacob = pDI.getPerson("Jacob");
		jacob.setAge(225);
		pmap = pDI.getAllPeople();
		pmap.put(1, jacob);
		pDI.updatePersonMap(pmap);
		System.out.println(pDI.getAllPeople());
		
	}

}
