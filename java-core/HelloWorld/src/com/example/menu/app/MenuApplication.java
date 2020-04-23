package com.example.menu.app;

import java.util.Scanner;

public class MenuApplication {

	static boolean isRunning = true;
	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		
		Screen presentScreen = new MainMenu();
		
		while(isRunning) {
			presentScreen = presentScreen.render(scan);
			
		}
		

	}

}
