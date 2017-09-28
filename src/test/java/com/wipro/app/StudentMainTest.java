package com.wipro.app;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class StudentMainTest {

	@Test
	public void test() 
	{
		StudentMain stm=new StudentMain();
		Student s1=new Student(001,"inthu",26);
		Student s2=new Student(002,"raju",25);
		Student s3=new Student(003,"charan",24);
		Student s4=new Student(004,"pravallika",24);
		
		ArrayList<Student> pass=new ArrayList<Student>(); //Array object creation  and adding  values into object
		pass.add(s1);
		pass.add(s2);
		pass.add(s3);
		pass.add(s4);
		
		ArrayList<Student> actual=stm.start(pass);  //passing object to main class object 
		
		ArrayList<Student> expected=new ArrayList<Student>(); //expected data creation
		expected.add(s1);
		expected.add(s2);
		expected.add(s4);
		expected.add(s3);

		assertEquals(expected, actual); // validating values
	}

}
