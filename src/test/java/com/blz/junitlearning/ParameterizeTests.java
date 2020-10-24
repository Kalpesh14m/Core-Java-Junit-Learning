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
//The custom runner Parameterized implements parameterized tests.
//When running a parameterized test class, instances are created for the cross-product of the test methods and the test data elements.
public class ParameterizeTests {
	private int inputNumber;
	private boolean result;
	private PrimeNumberChecker check;

	@Before
	public void initialize() {
		check = new PrimeNumberChecker();
	}

	public ParameterizeTests(int inputNumber, boolean result) {
		this.inputNumber = inputNumber;
		this.result = result;
	}

	@Test
	public void testPrimeNumber() {
		assertEquals(result, check.validatePrime(inputNumber));
	}

	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(
				new Object[][] { { 2, true }, { 3, true }, { 4, false }, { 5, true }, { 6, false }, { 13, true } });
	}
}

//Annotation for a method which provides parameters to be injected into the test class constructor by Parameterized. 
//The method has to be public and static.
