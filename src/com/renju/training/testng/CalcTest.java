package com.renju.training.testng;

import org.testng.annotations.Test;

public class CalcTest {
	@Test
	public void addTest() {
		System.out.println(Calculator.addNumbers(3, 4));
		//AssertJUnit.assertEquals(10, myCalc.addNumbers(5, 5));
	}

	@Test
	public void subtractTest() {
		System.out.println(Calculator.subtractNumbers(3, 4));
		//AssertJUnit.assertEquals(5, myCalc.subtractNumbers(10, 5));
	}
}
