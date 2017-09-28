package com.wipro.app;
/* Create a Student class that represents the following information of a student: id, name, and age. 
Create a StudentSorter class with a sortStudent() method that accepts Student object. 
Sort the list based on their age in decreasing order. 
For student having same age, sort based on their name.
 For students having same name and age, sort them according to their iD. */
import java.util.*;
import java.io.*;  
public class StudentMain
{  
	public static void main(String args[])
	{  
  
		ArrayList<Student> al=new ArrayList<Student>();  // Object for ArrayList and adding values into object
		
		al.add(new Student(001,"inthu",26));
		al.add(new Student(002,"raju",25));
		al.add(new Student(003,"charan",24));
		al.add(new Student(004,"pravallika",24));
			System.out.println("sorting by age...");  
			StudentMain s=new StudentMain();
			s.start(al);
			for(Student st: al)           //Loop to  retraive arraylist values
			{  
					System.out.println(st.id+" "+st.name+" "+st.age);  
			}  
  
	  }  
	public ArrayList<Student> start(ArrayList<Student> srt)  //To sort the array elements
	{
		 Collections.sort(srt,new AgeComparator()); // here call to ageComparator class and inside method.
		 return srt;
	}
}  