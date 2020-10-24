package com.blz.junitlearning;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AdditionMethodTesting {
	private int numOne, numTwo, expected;
	private Calculator calci;

	@Before
	public void initialize() {
		calci = new Calculator();
	}

	public AdditionMethodTesting(int numOne, int numTwo, int expected) {
		this.numOne = numOne;
		this.numTwo = numTwo;
		this.expected = expected;
	}

	@Test
	public void testAddMethod() {
		assertEquals(expected, calci.add(numOne, numTwo));
	}

	@Parameters
	public static Collection addPara() {
		return Arrays.asList(new Object[][] { { 10, 20, 30 }, { 100, 200, 300 } });
	}
}
