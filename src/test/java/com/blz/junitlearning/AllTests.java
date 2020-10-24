package com.blz.junitlearning;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ AddMethodTesting.class, SubMethodTesting.class })
public class AllTests {
	@BeforeClass
	public static void testBeforeMe() {
		System.out.println("Inside Suite Class: Before");
	}

	@AfterClass
	public static void testAfterMe() {
		System.out.println("Inside Suite Class: After");
	}
}
