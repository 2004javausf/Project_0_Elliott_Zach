package com.example.day3.inheritance;

public class InheritanceExample {
	
	public static void main(String[] args) {
		
		Animal ani = new Animal();
		
		Monkey mon = new Monkey();
		
		//System.out.println("Animal: " + ani.height);
		//System.out.println("Monkey: " +mon.height);
		mon.eatBanana();
		Chimp chim = new Chimp();
		
		chim.eatBanana();
		
		//Turtle tur = new Turtle();
		//tur.walk();
		
		//chim.varArgsExample(7, 5);
		
		System.out.println(((Animal)mon).weight);
		
	}

}
