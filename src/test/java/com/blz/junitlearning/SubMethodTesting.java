package com.blz.junitlearning;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class SubMethodTesting {
	static Calculator calci;

	// @Before -> every time when Test case then method gets called
	@BeforeClass // -> Only when Call gets loaded in JVM then method gets called
	public static void createCalculatorObj() {
		calci = new Calculator();
		System.out.println("In Sub Test Before Class");
	}

	// @After -> every time when Test case executed then method gets called
	@AfterClass // -> Only when Test gets terminated from JVM then method gets called
	public static void nullObj() {
		calci = null;
		System.out.println("In Sub Test After Class");
	}

	@Test
	public void testSubMethodWhenTwoPositiveNumbers_thenAssertionHappy() {
		assertEquals(10, calci.sub(20, 10));
		System.out.println("In Test : 1");
	}

	@Test
	public void testSubMethodWhenTwoNegNumbers_thenAssertionHappy() {
		assertEquals(-10, calci.sub(-20, -10));
		System.out.println("In Test : 2");
	}

	@Test
	public void testSubMethodWhenOnePositiveNumberAndOneZero_thenAssertionSad() {
		System.out.println("In Test : 3");
		assertEquals(20, calci.sub(50, 0));
	}

	@Test
	public void testSubMethodWhenTwoPositiveNumbers_thenAssertionSad() {
		System.out.println("In Test : 4");
		assertEquals(20, calci.sub(20, 10));
	}

}
