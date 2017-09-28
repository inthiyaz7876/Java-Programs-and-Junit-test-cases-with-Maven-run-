package com.wipro.app;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class MapInterfaceExampleTest {

	@Test
	public void test() {
		Map<Integer,String> map=new HashMap<Integer,String>();  //map object creation and adding values into object
		  map.put(1,"java");  
		  map.put(2,"c++");  
		  MapInterfaceExample mp =new MapInterfaceExample();
		  Map<Integer, String> actual=mp.manupulation(map);  // passing object and Getting actual value from main class
		  
		  Map<Integer,String> expected=new HashMap<Integer,String>();  // creating expected output here
		  expected.put(1," ");
		  expected.put(2,"java");
		 
		assertEquals(expected, actual); // input and out put validation
	}

}
