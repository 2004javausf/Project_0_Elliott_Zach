package com.example.day10.compare;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Driver {

	public static void main(String[] args) {
		
		List<Student> myStList = new ArrayList<>();
		myStList.add(new Student(3, "David", 3.5, LocalDate.of(1992,12,12)));
		myStList.add(new Student(6, "Tyrese", 3.9, LocalDate.of(1997,7,06)));
		myStList.add(new Student(1, "Navneet", 3.6, LocalDate.of(1994,2,07)));
		myStList.add(new Student(14, "Timothy", 3.0, LocalDate.of(1998,10,31)));
		myStList.add(new Student(2, "Jacob", 2.3, LocalDate.of(1776,7,04)));
		
		System.out.println(myStList);
		
		//Comparable
		//will always use natural ordering
		Collections.sort(myStList);
		System.out.println(myStList);
		
		//Comparator
		//We can define unnatural ordering of our objects
		Collections.sort(myStList, new StudentGpaComparator());
		System.out.println(myStList);
		

	}

}
