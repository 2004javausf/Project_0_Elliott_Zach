package com.revature.bankapp.test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.revature.bankapp.allthemtests.*;

 

class MathTest{
	
	private static final YoItsMath mathTime = new YoItsMath();
	
	@Test
	@DisplayName("Testing Addition Normal Conditions")
	public void TestAddtionNormal() {
		int a = 5;
		int b = 10;
		int expected = 15;
		assertEquals(expected, mathTime.Addition(a, b));
	}
	
	@Test
	@DisplayName("Testing Addition Variable A is negative")
	public void TestAdditionANegative() {
		int a = -2;
		int b = 5;
		int expected = -1;
		assertEquals(expected, mathTime.Addition(a, b));
	}
	
	@Test
	@DisplayName("Testing Addition Variable B is negative")
	public void TestAdditionBNegative() {
		int a = 2;
		int b = -5;
		int expected = -1;
		assertEquals(expected, mathTime.Addition(a, b));
	}
	
	@Test
	@DisplayName("Testing Subtraction Normal")
	public void TestNormalSub() {
		int a = 12;
		int b = 5;
		int expected = 7;
		assertEquals(expected, mathTime.Subtraction(a, b));
	}
	
	@Test
	@DisplayName("Testing Subtraction Variable A is negative")
	public void TestSubANegative() {
		int a = -2;
		int b = 5;
		int expected = -1;
		assertEquals(expected, mathTime.Subtraction(a, b));
	}
	
	@Test
	@DisplayName("Testing Subtraction Variable B is negative")
	public void TestSubBNegative() {
		int a = 2;
		int b = -5;
		int expected = -1;
		assertEquals(expected, mathTime.Subtraction(a, b));
	}
	
	@Test
	@DisplayName("Testing Subtraction Where Output is negative")
	public void TestSubNegativeOut() {
		int a = 2;
		int b = 10;
		int expected = -1;
		assertEquals(expected, mathTime.Subtraction(a, b));
	}

}
