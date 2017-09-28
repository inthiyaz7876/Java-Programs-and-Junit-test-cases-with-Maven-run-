package com.wipro.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrinterTest {

	@Test
	public void test()
	{
		Printer p=new Printer();
		Integer[] intArray = { 10, 20, 30, 40, 50 };
		assertEquals(intArray,intArray);
	}

}
