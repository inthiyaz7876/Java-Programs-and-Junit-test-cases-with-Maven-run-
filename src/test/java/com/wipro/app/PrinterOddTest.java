package com.wipro.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterOddTest {

	@Test
	public void test() {
		PrinterOdd pr=new PrinterOdd();
		Integer[] intArray = { 10, 20, 30, 43, 55 };
		
		int actual= 98;
		int expected=pr.printArray(intArray);
		
		assertEquals(expected,actual);
	}

}
