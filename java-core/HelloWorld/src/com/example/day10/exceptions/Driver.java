package com.example.day10.exceptions;

public class Driver {

	public static void main(String[] args) {
		
		MyCustomException myEx = new MyCustomException("This is an Exception");
		MyCustomException myEx2 = new MyCustomException("Pineapples on pizza", myEx);
		MyCustomException myEx3 = new MyCustomException("Toilet paper in the wrong direction", myEx2);
		
		MyCustomRuntimeException myRex = new MyCustomRuntimeException("Javascript", myEx3);
		
//		try {
//			throw myEx3;
//		}
//		catch(MyCustomException e) {
//			e.printStackTrace();
//		}
		
		throw myRex;

	}

}
