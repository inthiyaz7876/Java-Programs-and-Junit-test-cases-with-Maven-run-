package com.wipro.app;
/* Create a Printer class with a printArray() single method (No method overloading) 
 * that accept a single argument that can be String or integer array, 
 * and prints the array elements.*/
public class Printer{  
  
    
    public static void main( String args[] ) 
    {  
        Integer[] intArray = { 10, 20, 30, 40, 50 };  // Array decalaraion with elements  
        printArray( intArray  );       // passing integer array to printAray method
    }   
    
    public static < E > void printArray(E[] elements)   //generic method to retrive the array elements
    {  
         for ( E element : elements)
         {          
             System.out.println(element );  
          }  
          System.out.println();  
     } 
}  