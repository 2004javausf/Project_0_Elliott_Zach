package com.example.day2.flowcontrol;

public class BranchExample {
public static void main(String[] args) {
	//if statements
	//conditional operators: &&, ||, !, <, >, >=, <=, ==
	
	int tempNum = 38;
	
	if (tempNum <= 37) {
		System.out.println("checkpoint 1");
	}
	
	else if (tempNum >38) {
		System.out.println("checkpoint 2");
	}
	
	else if (tempNum >= 38) {
		//System.out.println("checkpoint 3");
	}
	
	else {
		System.out.println("i give up");
	}

	//ternary statement
	int x = (tempNum >=800)? 7:99;
	int x3 = (tempNum < 700)? (tempNum > 500)? 50:60:50; //avoid this (nested ternary) just use an if else or switch statement.
	//System.out.println(x);
	//System.out.println(x3);
	
	/*
	 * Switch Case
	 * switch cases ONLY allow int, char, string, enum, short, and byte
	 * excluding string and enum it will allow data types of 4 bytes and under
	 */
	
	int num = 1;
	
	switch (num) {
	
	case 1:
		//System.out.println("first");
		break;
	
	case 3:
		System.out.println("third");
		break;
		
	case 6:
		System.out.println("sixth");
		break;
		
	default:
		System.out.println("default");
		break;
		
	}
		
	//break will break out (exit) of the control flow entirely 
	//without the break it'll cascade through all other cases
	
	/*
	 * the switch and the if else if statement can be virtually the same and usually is a matter of personal choice
	 * or if you wanted it to cascade.
	 */
	if(method1()) {
		System.out.println("here");
	}
	
	}
public static boolean method1() {
	return true;
  }
}
