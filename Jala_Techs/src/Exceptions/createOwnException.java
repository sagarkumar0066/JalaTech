package Exceptions;

// 6. Write a program to create your own exception

public class createOwnException 
{
  public static void main(String args[]) throws CovidVaccination
  {
	 int age = 45;
	 
	 if(age<45)
	   throw new CovidVaccination("Invalid age for vaccination");
	 else
		 System.out.println("Eligible age for vaccination");
  }
}
class CovidVaccination extends Exception
{
	CovidVaccination(String s)
	{
		System.out.println(s);
	}
}