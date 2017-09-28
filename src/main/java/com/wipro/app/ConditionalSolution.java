package com.wipro.app;

/* 1. Write a method that given an integer num, it performs the following conditional actions:
Print Tom if num is odd
Print Jerry, if  num is even and > 2 but < 9
Print Tom, if  num >=  6 but <= 20,
print Jerry, if num is even and  > 25 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConditionalSolution
{
	
        public static void main(String[] args) 
        {
        	
        	String s;
        	ConditionalSolution c=new ConditionalSolution();
        	do{
        		Scanner sc= new Scanner(System.in);           //using scanner to give input
            	System.out.println("Enter a number:");         //taking input from user
            	String i=sc.next();
        		c.call(i);                             //passing number as a string to call method
        		Scanner sc1= new Scanner(System.in);
        		System.out.println("Do you want continuue please type ok"); 
        		s=sc1.nextLine();
        		
        	   }while(s.equals("ok"));   // if user need again same opration need to click "ok",then this while will work
        	     	
		 }
        
        public String call(String  a)
        {
        	try 
        	{
        		int i1=Integer.parseInt(a);
        	
        		if((i1%2!=0) ||(i1>=6 && i1<=20))  // Condition checking
        		{
        			return "Tom";
        		}
        		if((i1%2==0) && (i1>2 && i1<9) || (i1>25)) 
        		{
        			return "Jerry";
        		}
        	}
        	catch(Exception e)                  // Expected exception area
        	{
        		throw new NumberFormatException();
        	}
			return a;
        	
		
        }
        
}
       
    