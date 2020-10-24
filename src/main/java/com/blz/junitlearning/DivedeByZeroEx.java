package com.blz.junitlearning;

public class DivedeByZeroEx extends Exception {
	public DivedeByZeroEx(String msg) {
		super(msg);
	}

	public DivedeByZeroEx() {
		super(". by zero");
	}

}
