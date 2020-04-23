package com.example.day3.arrays;

public class ArrayExample {

	public static void main(String[] args) {
		
		//what is an array 
		//a sequential list of like data types of an immutable size
		//arrays are sequential in memory
		//this allows fast accessing of arrays indices 
		
		//what are the two ways to create an array 
		
		int[] arry1 = {2, 54, 60 ,7};
		int[] arry2 = new int[4];
		//int arry2[] = new int [4]; //same way to initiate an array as the one above it
		
		//to grab the size of an array you cal the .length method
		//this method acts like a property therefore you do not need the () after it
		for(int i=0; i<arry2.length; i++) {
			arry2[i]=5;
		}
		
		
		for(int temp:arry2) {
			System.out.println(temp);
		}
		
		//2D arrays 
		int[][]arry2D = {{1,2,3},{4,5,6},{7,8,9,5,7,8}};
		int[][]arry2D2 = new int[3][4];
		System.out.println(arry2D[2].length);
		
		for(int i=0; i<arry2D.length;i++) {
			for(int j=0; j<arry2D[i].length;j++) {
				System.out.print(arry2D[i][j]);
			}
			System.out.print(":");
		}
		
		System.out.println("");
		
		for(int[]tempAry: arry2D) {
			for(int temp:tempAry) {
				System.out.print(temp);
			}
			System.out.print(":");
		}
 
	}

}
