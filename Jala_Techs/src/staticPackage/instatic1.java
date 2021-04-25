package staticPackage;

public class instatic1 // program 2. Print instance variables in static methods
{
	String name = "Instance Variable";
	public static void main(String args[])
	{  
	   display();
	}
	public static void display()          // static method
	 {
		instatic1 in = new instatic1();
		   System.out.println(in.name);
     }
}
