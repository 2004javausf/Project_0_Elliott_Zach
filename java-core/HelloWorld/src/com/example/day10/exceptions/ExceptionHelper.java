package com.example.day10.exceptions;

import java.util.InputMismatchException;

public class ExceptionHelper {
	
	public static void howToDuckResponsibility() throws Exception {
		throw new Exception();
	}
	
	public static void triggerException() {
//		Throwable th = new Throwable();
//		RuntimeException re = new RuntimeException();
		
		try {
			throw new InputMismatchException();
		}
		catch(RuntimeException re ) {
			re.printStackTrace();
			System.out.println("in re catch");
		}
		catch(Throwable th) {
			th.printStackTrace();
			System.out.println("in th catch");
		}
	}

}
