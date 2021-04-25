package staticPackage;

public class instatic5 // program 6. Print all the static, instance variables in main method
{
	static String var = "static variable";
	String name = "Instance Variable";
	
	public static void main(String args[])
	{
		instatic5 in = new instatic5();
	   System.out.println(var+" : "+in.name);
	}
	
}
