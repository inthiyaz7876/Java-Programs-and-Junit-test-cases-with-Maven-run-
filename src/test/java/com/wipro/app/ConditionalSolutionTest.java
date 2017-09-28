package com.wipro.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConditionalSolutionTest {

	@Test
	public void Oddtest() {
		
		ConditionalSolution c1=new ConditionalSolution();
		
		String actual=c1.call("1");            // passing string value to main class method named call.
		String expected="Tom";                // expected result from main.
		assertEquals(expected, actual);
		
	}
	@Test
	public void Eventest() {
		
		ConditionalSolution c2=new ConditionalSolution();
		
		String actual=c2.call("26");               // passing string value to main class method named call.
		String expected="Jerry";                    // expected result from main.
		assertEquals(expected, actual);
		
	}
	@Test(expected =NumberFormatException.class)  // test for exception
	public void ErrorTest() {	
		ConditionalSolution c2=new ConditionalSolution();
		c2.call("sa");
		//String expected="Please Enter numbers only";
		//assertEquals(expected, actual);
		
	}



}
