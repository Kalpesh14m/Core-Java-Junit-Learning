package com.blz.junitlearning;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DivMethodTest {
	static Calculator calci;

	@BeforeClass
	public static void createCalculatorObj() {
		calci = new Calculator();
		System.out.println("In Div Test Before Class");
	}

	@AfterClass
	public static void nullObj() {
		calci = null;
		System.out.println("In Div Test After Class");
	}

	@Test
	public void testDivMethodWhenTwoPositiveNumbers_thenAssertionHappy() {
		try {
			System.out.println("In Test : 1");
			assertEquals(10, calci.div(20, 2));
		} catch (DivedeByZeroEx e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testDivMethodWhenTwoPositiveNumbers_thenAssertionSad() {
		try {
			assertEquals(20, calci.div(20, 10));
		} catch (DivedeByZeroEx e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void testDivMethodWhenOnePositiveOneNegNumber_thenAssertionSad() {
		try {
			assertEquals(-5, calci.div(10, -2));
		} catch (DivedeByZeroEx e) {
			System.out.println(e.getMessage());
		}
	}

	@Test(expected = DivedeByZeroEx.class)
	public void testDivMethodExceptionWhenOnePositiveNumberAndOneZero_thenAssertionHappy() throws DivedeByZeroEx {
		assertEquals(20, calci.div(20, 0));
	}

	@Test(expected = NumberFormatException.class)
	public void testDivMethodExWhenOnePositiveNumberAndOneZero_thenAssertionHappy() throws DivedeByZeroEx {
		String str = "abc";
		int a = Integer.parseInt(str);
		assertEquals(20, calci.div(20, a));
	}

}
