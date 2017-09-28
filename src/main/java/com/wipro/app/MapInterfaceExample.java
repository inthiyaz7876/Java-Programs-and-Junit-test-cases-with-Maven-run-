package com.wipro.app;
/* Write a method that accepts a Map object having two key-value pairs with the keys val1 and val2.  Modify and return the given map as follows:

If the key "val1" has a value, set the key "val2" to have that value, and
Set the key "val1" to have the value "" (empty string). */
import java.util.*;  
class MapInterfaceExample
{  
	public static void main(String args[])//main method
	{ 
		Map<Integer,String> map=new HashMap<Integer,String>(); //creating object for map 
		map.put(1,"java");  
		map.put(2,"c++");    //adding key and value into map
  
 
		MapInterfaceExample mp =new MapInterfaceExample();      //object creation  for class to call method
		mp.manupulation(map);                                   // method calling with parameter passing
	}  
	public Map<Integer, String> manupulation(Map<Integer,String> a) //  swaping from one to another 
	{
		String v=a.get(1);
		a.put(1," ");
		a.put(2,v);
		System.out.println(a);
		return a;
		
	}
}  