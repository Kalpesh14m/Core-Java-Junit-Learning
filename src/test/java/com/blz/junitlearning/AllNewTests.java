package com.blz.junitlearning;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AdditionMethodTesting.class, AddMethodTesting.class, DivMethodTest.class, SubMethodTesting.class })
public class AllNewTests {
	@BeforeClass
	public static void beforeAllNewTests() {
		System.out.println("inside Before: AllNewTests");
	}

	@AfterClass
	public static void afterAllNewTests() {
		System.out.println("inside After: AllNewTests");
	}
}
