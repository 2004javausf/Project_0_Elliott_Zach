package com.example.day9.console;

import java.util.Scanner;

public class MenuScreen implements Screen{
	
	static String name;

	@Override
	public Screen render(Scanner conScan) {
		
		System.out.println("Welcome to fake Store");
		System.out.println("Enter your name");
		//static String name = conScan.nextLine();
		name = conScan.nextLine();
		
		return new NextScreen().render(conScan);
	}

}
