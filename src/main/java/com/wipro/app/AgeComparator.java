package com.wipro.app;
import java.util.*;

//import Student;  
class AgeComparator implements Comparator<Student>
{  
	public int compare(Student s2,Student s1) //retraiving two values from user.
	{  
		  
		if(s1.age>s2.age)  // age comparision
			return 1; 
		else if(s1.age<s2.age) 
			return -1; 
		else  
		{
			
			if((s1.name).equals(s2.name)) // name compatrision 
			{
				return s1.id-s2.id;         // id comparision
			}
			else
			{
				return (s1.name).compareTo(s2.name);
			}
		}
			 
			
		
	}  
}  