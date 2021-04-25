package staticPackage;

public class staticExample //Program 1. Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance 
                                            //methods and a main method.
{
	static String name = "Static variable";
	public static void main(String args[])   //main method
	{
	   InStatic is = new InStatic();
	   is.display();
	   display();
	}
	static void display()              //static method
	{
		System.out.println(name);
	}
}
class InStatic
{
	String name = "Instance Variable";
	   
	   public void display()          // Instance method
	   {
		   System.out.println(name);
	   }
}
