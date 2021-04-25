package Exceptions;

// 7. Write a program with finally block

public class finallyBlock 
{
  public static void main(String args[])
  {
	  try
	  {
	     int number = 25/0;
	  }
	  catch(ArithmeticException  e)
	  {
		  System.out.println(e);
	  }
	  
	  finally
	  {
		  System.out.println("finally block will execute always whether exception occurs or not");
	  }
	  
  }
}
