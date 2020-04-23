package com.example.week1.repo;

import java.util.Map;

import com.example.week1.dao.model.Person;

public interface PersonDao {
	
	String filename = "./personDao.txt";
	
	//CRUD method live here, Create Read Update Delete
	
	public Map<Integer, Person> getAllPeople();
	
	public void updatePersonMap(Map<Integer, Person> pmap);
	
	public Person getPerson(String name);

}
