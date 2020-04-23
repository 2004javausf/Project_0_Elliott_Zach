package com.example.day10.compare;

import java.time.LocalDate;

public class Student implements Comparable<Student> {
	
	private int studentId;
	private String name;
	private double gpa;
	private LocalDate dob;
	
	public Student() {
		
	}

	public Student(int studentId, String name, double gpa, LocalDate dob) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.gpa = gpa;
		this.dob = dob;
	}
	

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", gpa=" + gpa + ", dob=" + dob + "]";
	}

	@Override
	public int compareTo(Student o) {
		/*
		 * CompareTo() will return a negative number, 0, or a positive number 
		 * based off of the passed parameter versus this instance
		 * 
		 * collections.sort will use this value to order the elements
		 */
		//return (int)(this.getGpa()*100-o.getGpa()*100);
		return this.getStudentId()-o.getStudentId();
	}


}