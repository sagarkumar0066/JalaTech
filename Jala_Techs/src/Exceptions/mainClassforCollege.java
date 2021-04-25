package Exceptions;

// 14. Write a program to generate NoSuchMethodException

// we can get java.lang.NoSuchMethodError here by comment students method from college. we can achieve it by command prompt
public class mainClassforCollege 
{
   public static void main(String args[])
   {
	   College c = new College();
	   c.faculty();
	   c.students();
   }
}
