package com.Miit.java;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void add() {
		Functions f1 = new Functions();
		int arr[] = { 4, 6, 7 };
		int expectedresult = 17;
		int result = (int) f1.add();
		assertEquals(17, result);

	}

	@Test
	public void substract() {
		Functions f1 = new Functions();
		int arr[] = { 7, 4, 2 };
		int expectedresult = 1;
		int result = (int) f1.substract();
		assertEquals(1, result);
	}

	@Test
	public void multiply() {
		Functions f1 = new Functions();
		int arr[] = { 4, 6, 7 };
		int expectedresult = 168;
		int result = (int) f1.multiply();
		assertEquals(168, result);
	}

	@Test
	public void division() {
		Functions f1 = new Functions();
		int arr[] = { 24, 4 , 3 };
		int expectedresult = 2;
		int result = (int) f1.division();
		assertEquals(2, result);

	}

}
