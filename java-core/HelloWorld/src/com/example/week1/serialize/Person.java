package com.example.week1.serialize;

import java.io.Serializable;

//Serialization allows you to turn an object into a serializable form to transfer over a network or stream

//The different types of interfaces

/*
 * MARKER Interface - an interface that has no methods, its goal is to flag a class 
 * 		for jvm for special meta data.
 * 
 * Functional Interface - it is an interface with a single method to implement.
 * 
 * everything else is a normal interface.
 */
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6556320442545174195L;
	
	private String name;
	private int age;
	
	//the "transient key word makes an individual field non-serializable
	
	transient private String ssn;
	
	public Person() {
		
	}

	public Person(String name, int age, String ssn) {
		super();
		this.name = name;
		this.age = age;
		this.ssn = ssn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", ssn=" + ssn + "]";
	}
	
	

}
