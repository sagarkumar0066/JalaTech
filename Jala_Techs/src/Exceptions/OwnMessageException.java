package Exceptions;

// 5. Write a program to throw exception with your own message

public class OwnMessageException 
{
   public static void main(String args[])
   {
	   int ar[] = new int[5]; 
	   int size = ar.length;
	   int actualLength = 6;
	   
	   if(size<actualLength)
		   throw new ArrayIndexOutOfBoundsException("Array size les than actual length");
	   else
		   System.out.println("array length is good");
   }
}
