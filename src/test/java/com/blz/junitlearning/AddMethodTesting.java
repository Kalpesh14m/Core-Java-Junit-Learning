package com.blz.junitlearning;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddMethodTesting {
	static Calculator calci;

	// @Before -> every time when Test case then method gets called
	@BeforeClass // -> Only when Call gets loaded in JVM then method gets called
	public static void createCalculatorObj() {
		calci = new Calculator();
		System.out.println("In Add Test Before Class");
	}

	// @After -> every time when Test case executed then method gets called
	@AfterClass // -> Only when Test gets terminated from JVM then method gets called
	public static void nullObj() {
		calci = null;
		System.out.println("In Add Test After Class");
	}

	@Test
	public void testAddMethodWhenTwoPositiveNumbers_thenAssertionHappy() {
		System.out.println("In Test : 1");
		assertEquals(30, calci.add(20, 10));
	}

	@Test
	public void testAddMethodWhenTwoNegNumbers_thenAssertionHappy() {
		System.out.println("In Test : 2");
		assertEquals(-30, calci.add(-20, -10));
	}

	@Test
	public void testAddMethodWhenOnePositiveNumberAndOneZero_thenAssertionSad() {
		System.out.println("In Test : 3");
		assertEquals(20, calci.add(50, 0));
	}

	@Test
	public void testAddMethodWhenOnePositiveOneNegNumber_thenAssertionHappy() {
		System.out.println("In Test : 4");
		assertEquals(10, calci.add(20, -10));
	}

	@Test
	public void testAddMethodWhenTwoPositiveNumbers_thenAssertionSad() {
		assertEquals(20, calci.add(20, 10));
	}

	@Test
	public void testAddMethodWhenOnePositiveOneNegNumber_thenAssertionSad() {
		assertEquals(10, calci.add(50, -30));
	}

	@Test
	public void testAddMethodWhenOnePositiveNumberAndOneZero_thenAssertionHappy() {
		assertEquals(20, calci.add(20, 0));
	}

}
