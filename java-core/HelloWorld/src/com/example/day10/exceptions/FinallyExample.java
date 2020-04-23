package com.example.day10.exceptions;

import java.io.IOException;

public class FinallyExample {
	
	@SuppressWarnings("finally")
	public static String finallyReturn() {
		try {
			throw new Exception();
		}
		catch(Exception e) {
			return "in catch";
			//finally logic will always run even if there is a return in the catch
			//it will just run the finally logic before the return expression
			//System.exit(0);
		}
		finally {
			return "in finally";
		}
	}
	
	public static void main(String[] args) {
		
	System.out.println(finallyReturn());
//		try {
//			throw new IOException();
//		}
//		catch(IOException ioe) {
//			System.out.println("In IO Block");
//		}
//		catch(Error er) {
//			System.out.println("Why would you do this?");
//		}
//		catch(Throwable th) {
//			System.out.println("In th Block");
//		}
//		finally {
//			System.out.println("In finally");
//		}
//		
//		System.out.println("done!");
	}

}
