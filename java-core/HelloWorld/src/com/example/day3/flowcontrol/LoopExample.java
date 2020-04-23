package com.example.day3.flowcontrol;

public class LoopExample {
	
	public static void main(String[] args) {
		
		int i = 0;
		boolean bool = true;
		
//		while(bool) {
//			
//		System.out.println(i++);
//		if(i>100) {
//			break;
//		}
//		}
//		
//		System.out.println("done");
		
		
		//do while loop
//		boolean bool2 = false;
		
//		do {
//			System.out.println("in the do");
//		}
//		while(bool2);
		
		//for loops
		
		//for(initialize; condition; assignment) {
		//LOGIC
	  //   }
		
//		String s = "what";
//		
//		for(int j = 0; j<=7; s="oh, yeah") {
//			
//			j++;
//			
//			System.out.println(s);
//		}
//		
//		for(; ;) {
//			this is an infinite loop
//		}
//		
//		for(int k = 0; k<=3; k++) {
//			for(int y = 0; y<=99; y++) {
//				if (y==5) {
//					break;
//				}
//				System.out.println("y: " + y);
//			}
//			System.out.println("k: " + k);
//		}
		
		//enhanced for loop(for each loop)
		
		int[] example = {7, 8, 9, 10, 11};
		
		//this allows us to easily iterate through each element in an iterable object
		
	for(int temp: example) {
		
		System.out.println(temp);
	}	
		//this would be an alternative way to accomplish an enhanced for loop with a normal for loop
		//for( int w=0; w<=example.length-1; w++) {
			//System.out.println(example[w]);
		//}
		
		String[] strAry = {"Jacob", "Trashcan", "Coffee"};
		
		for(String temp:strAry) {
			System.out.println(temp);
		}
		
		for(int h=0; h<=5; h++) {
			
			if(h==3) {
				System.out.println("in continue");
				//the continue keyword stops this current iteration's logic and starts the loop 
				//at the next iteration
				continue;
			}
			System.out.println(h);
		}
		
		}

	}


