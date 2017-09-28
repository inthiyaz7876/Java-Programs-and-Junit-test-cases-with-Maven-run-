package com.wipro.app;
/* Write a generic method to get the sum value of odd elements in a collection.*/

public class PrinterOdd{  
  
    
    public static void main( String args[] ) 
    {  
        Integer[] intArray = { 10, 20, 30, 43, 55 };  // Array decalaraion with elements
        
        PrinterOdd prt=new PrinterOdd();
        prt.printArray( intArray  );       // passing integer array to printAray method
    }   
    
    public< S > int printArray(S[] elements)   //generic method to retrive the array elements
    {  
    	int count=0;
         for ( S element : elements)
         {     
        	 if(Integer.parseInt(element.toString())%2!=0)
        	 {
        		 count=count+Integer.parseInt(element.toString());
        	 }
          }  
        return count;    
     } 
}  