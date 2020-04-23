package com.example.day4.importing;

//import com.example.day3.inheritance.Animal;
//import com.example.day3.inheritance.Monkey;

//(*) this imports ALL classes from that package
//import com.example.day3.inheritance.*;

//you can import specifically static members from a class
import static com.example.day3.inheritance.Animal.*;

import com.example.day3.inheritance.Animal;


public class ImportingExample {

	public static void main(String[] args) {
		
		Animal ani = new Animal();
		//you can use the full package to access a class as well
		com.example.day3.inheritance.Monkey mon = new com.example.day3.inheritance.Monkey(); //ctrl+Shift+o will auto import the class (hotkey)
		
		Animal.numOfLegs = 0;
		

	}

}
