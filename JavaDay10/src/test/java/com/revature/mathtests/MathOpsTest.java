package com.revature.mathtests;

// * means we are importing all of the dependencies from that class
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.revature.testexample.MathOps;

public class MathOpsTest {
	
	// runs once before all the tests....
	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("Before Class....");
	}
	
	// runs once after all of the tests.....
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("\nAfter class....");
	}
	
	// runs before every single test....
	@Before
	public void setUp() {
		System.out.println("\nBefore......");
	}
	
	// runs after every single test....
	@After
	public void tearDown() {
		System.out.println("After......");
	}

	// add() - TEST
	@Test
	public void addTest() {
		System.out.println("Running add test.....");
		assertEquals(10, MathOps.add(5, 5));
		
		
	}
	
	// divide() - TEST
	@Test(expected = ArithmeticException.class)
	public void divideTest() {
		System.out.println("Running Divide Test.... ");
		MathOps.divide(1, 0);
	}

}
