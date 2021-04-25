package Exceptions;

import java.io.FileReader;

public class AllExceptions 
{
  public static void main(String args[]) throws Exception
  {
	  //arException();
	  //aryOutOfBound();
	  //clsNotFound();
	  //filenotfound();
	  //StringException();
	  //numberformate();
	  nullpointerexception();
  }
  
  static void arException() // 8. Write a program to generate Arithmetic Exception
  {
	  int a=0,b=5,c=0;
	   c = b/a;
	   System.out.println(c);
  }
  
  static void aryOutOfBound() // 9. Write a program to generate ArrayIndexOutOfBoundException
  {
	  int[] a = {5,8,7,6,4,2,9};
	  
	  for(int i=0;i<=a.length;i++)
		  System.out.println(a[i]);
  }
  
  static void clsNotFound() throws Exception // 10. Write a program to generate ClassNotFoundException
  {
	  Class.forName("Exceptions.AllException");
  }
  
  static void filenotfound() throws Exception // 11. Write a program to generate FileNotFoundException
  {
	  FileReader fr = new FileReader("demo.text");    
      int i;
	   while((i=fr.read())!=-1)    
	          System.out.print((char)i);    
	           

     fr.close();
  }
  
  static void StringException() // 17. Write a program to generate StringIndexOutOfBoundsException
  {
	  String str = "sagar";
	  
	  System.out.println(str.charAt(15));
  }
  
  static void numberformate() // 16. Write a program to generate NumberFormatException
  {
	  String str = "sagar";
	  
	  int i = Integer.parseInt(str);
	  
	  System.out.println(i);
  }
  
  static void nullpointerexception() // 15. Write a program to generate NullPointerException
  {
	  String str = null;
	  
	  if(str.contains("hi"))
		  System.out.println(str);
  }
}
