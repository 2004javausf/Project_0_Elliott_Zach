package com.example.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class CalculatorTest {
	
	static Calculator myCalc;
	
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("-----------Before Class-----------");
	}
	
	@AfterClass 
	public static void tearDownAfterClass() {
		System.out.println("-----------After Class------------");
	}
	
	@Before 
	public void setUp() {
		myCalc = new Calculator();
		myCalc.i=0;
		System.out.println("-----------Before Method------------");
		
	}
	
	@After
	public void tearDown() {
		System.out.println("------------After Method------------");
	}
	
	@Test
	public void multiplyPositiveNumbersTest() {
		System.out.println("In multiply test");
		myCalc.i = 444444451;
		//assertEquals(String message, int expected, int actual)
		assertEquals("This is the 2*5 Test", 10, myCalc.multiply(2, 5));
		assertEquals("This is the 5*2 Test", 10, myCalc.multiply(5, 2));
		assertEquals("This is the 5*5 Test", 25, myCalc.multiply(5, 5));
	}
	
	@Test
	public void additionPositiveNumbersTest() {
		System.out.println("In add test");
		myCalc.i = 444444451;
		//assertEquals(String message, int expected, int actual)
		assertEquals("This is the 2+5 Test", 7, myCalc.add(2, 5));
		assertEquals("This is the 5+2 Test", 7, myCalc.add(5, 2));
		assertEquals("This is the 5+5 Test", 10, myCalc.add(5, 5));
	}
	
	@Test
	public void addNegativeNumberTest() {
		System.out.println("In  negative add test");
		System.out.println(myCalc.i);
		assertEquals("This is the -3 + -4 test", -7, myCalc.add(-3, -4));
		assertEquals("This is the -4 + -3 test", -7, myCalc.add(-4, -3));
		assertEquals("This is the 10 + -10 test", 0, myCalc.add(10, -10));
	}
	
	//@Ignore()
	@Test(expected=IllegalArgumentException.class)
	//@Test(timeout=4000)
	public void xyzTest() {
		System.out.println("In xyz test");
		myCalc.xyzMethod();
	}
	
//	@Test
//	public void testOne() {
//		System.out.println("test one");
//		fail("not yet implemented");
//	}
//	
//	@Test 
//	public void testTwo() {
//		System.out.println("test two");
//		fail("not yet implemented");	
//		}
//	
//	@Test 
//	public void testThree() {
//		System.out.println("test three");
//		fail("not yet implemented");	
//		}

}
