package com.example.day9.console;

import java.util.Scanner;

public class NextScreen implements Screen {

	@Override
	public Screen render(Scanner conScan) {
		System.out.println("Next Screen");
		System.out.println(MenuScreen.name);
		System.out.println("exit?" + "y/n");
		String exit = conScan.nextLine();
		if(exit.equals("y")) {
			ConsoleApplication.isRunning = false;
			return null;
		}
		return new MenuScreen().render(conScan);
	}

}
