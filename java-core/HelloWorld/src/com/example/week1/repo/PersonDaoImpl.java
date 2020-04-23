package com.example.week1.repo;

import java.util.Map;

import com.example.week1.dao.model.Person;

public class PersonDaoImpl implements PersonDao {
	
	@Override
	public Map<Integer, Person> getAllPeople() {
		Map<Integer, Person> pmap = (Map<Integer,Person>) ObjectAccess.readObject(filename);
		return pmap;
	}

	@Override
	public void updatePersonMap(Map<Integer, Person> pmap) {
		ObjectAccess.writeObject(filename, pmap);
		
	}

	@Override
	public Person getPerson(String name) {
		Map<Integer, Person> pmap = getAllPeople();
		for(int i:pmap.keySet()) {
			if(pmap.get(i).getName().equals(name)) {
				return pmap.get(i);
			}
		}
		return null;
	}

}
