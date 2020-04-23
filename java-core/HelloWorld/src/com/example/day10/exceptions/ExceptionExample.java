package com.example.day10.exceptions;


//If the JVM ever sees an exception the program will terminate

/*
 * Checked vs Unchecked
 * 
 * Checked exceptions are forced to be handled by the complier, whether that be by
 * try/catch blocks or the throws keyword. It will give you a syntax error if you don't
 * 
 * Unchecked can have a try/catch or can be thrown with the throws keyword, but the complier does not force you to do so. 
 * You will not get syntax errors 
 * 
 * 
 */

public class ExceptionExample {
	
	public static void main(String[] args) throws Exception {
		//checked Exception, we are forced to handle
		//throw new Exception();
		
		//Unchecked Exception we are not forced to handle 
		//throw new RuntimeException();
		//System.out.println("Here");
		
		//Can only throw subclasses of throwable
		//throw new Object();
		
		Throwable th = new Throwable();
		
//		try {
//			
//			throw th;
//			
//			/*
//			 * the try block is wrapped around risky behavior the COULD possibly throw an exception
//			 */
//			
//		}
//		catch(Exception e){
//			//The catch block is like an if statement that has a true condition
//			//When the specific exception or throwable object is caught
//			e.printStackTrace();
//			System.out.println("Inside exception Catch");
//		}
//		catch(Throwable th2) {
//			th2.printStackTrace();
//			System.out.println("In Throwable Catch");
//		}
		
		ExceptionHelper.triggerException();
		ExceptionHelper.howToDuckResponsibility();
		
		System.out.println("Here");
	
	}

}
