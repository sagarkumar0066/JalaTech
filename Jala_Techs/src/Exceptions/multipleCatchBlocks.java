package Exceptions;

// 4. Write a program with multiple catch blocks

public class multipleCatchBlocks 
{
   public static void main(String args[])
   {
	   try{    
              int a[]=new int[5];    
              //a[4]=30/0; // for this first catch block will be executed
              a[5] = 30; // for this second catch block will be executed
          }    
          catch(ArithmeticException e)  
             {  
                 System.out.println("Arithmetic Exception occurs");  
             }    
          catch(ArrayIndexOutOfBoundsException e)  
             {  
                 System.out.println("ArrayIndexOutOfBounds Exception occurs");  
             }    
          catch(Exception e)  
             {  
                 System.out.println("Exception occurs");  
             }     
   }
}
