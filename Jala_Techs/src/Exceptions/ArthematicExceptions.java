package Exceptions;

import java.io.FileReader;
import java.io.FileWriter;

public class ArthematicExceptions 
{
   public static void main(String args[]) throws Exception
   {
	   //arException();
	   //arExceptionHandling();
	   aryException();
   }
   
   static void arException() // 1. Write a program to generate Arithmetic Exception without exception handling
   {
	   int a=0,b=5,c=0;
	   c = b/a;
	   System.out.println(c);
   }
   
   static void arExceptionHandling() // 2. Handle the Arithmetic exception using try-catch block
   {
	   int a=0,b=5,c=0;
	   try
	   {
	     c = b/a;
	     System.out.println(c);
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("Can't divide by zero");
	   }
   }
   
   static void aryException() throws Exception // 3. Write a method which throws exception, Call that method in main class without try block
   {
	   FileReader fr = new FileReader("demo.text");    
	      int i;
		   while((i=fr.read())!=-1)    
		          System.out.print((char)i);    
		           

	     fr.close();
   }
}
