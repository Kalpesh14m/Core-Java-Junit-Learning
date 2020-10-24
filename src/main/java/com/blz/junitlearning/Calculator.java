package com.blz.junitlearning;

public class Calculator {

	public int add(int i, int j) {
		return i + j;
	}

	public int sub(int i, int j) {
		return i - j;
	}

	public Object div(int i, int j) throws DivedeByZeroEx {
		if (j == 0) {
			throw new DivedeByZeroEx("Cant't Div By Zero");
		}
		return i / j;
	}

	public boolean validatePrime(int primeNumber) {
		for (int i = 2; i <= primeNumber / 2; i++) {
			if (primeNumber % i == 0)
				return false;
		}
		return true;
	}

}
