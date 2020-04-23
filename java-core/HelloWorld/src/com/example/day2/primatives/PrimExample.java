package com.example.day2.primatives;

public class PrimExample {

	public static void main(String[] args) {
		/*
		 * what is a bit
		 * a bit is a 0 or a 1, on off. 
		 * 
		 * what is a nibble
		 * 4 bits, half a byte
		 * 
		 * what is a byte 
		 * 8 bits
		 * 8 0 or 1 values
		 * 
		 * kilobyte 1024 bytes
		 * mega 1 million bytes
		 * giga 1 billion bytes
		 *
		 *what are the primative data types in Java
		 *boolean- 1 bit 
		 *byte- 8 bits
		 *char- 2 bytes
		 *short- 2 bytes
		 *int- 4 bytes
		 *float- 4 bytes
		 *long- 8 bytes
		 *double- 8 bytes
		 */
		
		//this is how you declare a variable
		int x;
		
		//this is how you declare and assign a variable in Java
		int x2 = 16;
		
		//there are no truthy or falseys values besides true or false keywords in Java
		boolean bool = true;
		
		
		byte by = 7;
		byte by2 = 5;
		/*
		 * When operations are done on datatypes less than an int, Java auto-promotes 
		 * those values to int. 
		 */
		byte by3 = (byte)(by + by2);
		
		char c = 'T';
		int y = c;
		//System.out.println(y);
		
		int y2 = 60;
		char c2 = (char)y2;
		//System.out.println(y2);
		//if you set a variable to char and make an int equal char as stated above the int will equal the ASCII of the char and vice versa
		
		double d = 8654.1234;
		float f = 3245.23452f;
		long l1 = 123L;
		/*
		 * With long float and double you can explicitly denote
		 * the value with l,f, or d respectively 
		 * floats HAVE to be denoted by f
		 */
		
		int i2 = (int) 34.54;
		//System.out.println(i2);
		
		long l3 = 2_232_132_254_564_684_645L;
		//you can use underscores to separate numbers for readability
		//but you cannot lead with them or put them beside non-numbers
		
		int temp = 0;
		System.out.println(temp++);//post increment
		System.out.println(temp);
		System.out.println(++temp);
		
		/*
		 * temp++ is the same as temp = temp + 1
		 */
	}
}
