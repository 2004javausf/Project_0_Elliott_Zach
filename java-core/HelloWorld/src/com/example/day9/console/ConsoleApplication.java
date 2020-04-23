package com.example.day9.console;

import java.util.Scanner;

public class ConsoleApplication {
	
	public static boolean isRunning = true;
	public static void main(String[] args) {
		
		
		
		Scanner conScan = new Scanner(System.in);
		
		Screen presentScreen = new MenuScreen();
		
		while(isRunning) {
			presentScreen = presentScreen.render(conScan);
		}
		
		

	}

}
