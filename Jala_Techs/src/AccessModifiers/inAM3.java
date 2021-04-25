package AccessModifiers;

//3. Create a class with PROTECTED fields and methods. Access these fields and methods 
//from any other class in the same package. 
//Also, Access the PROTECTED fields and methods from child class located in a different 
//package
//Access the PROTECTED fields and methods from any class in different package

public class inAM3 
{
	public static void main(String args[])
	{
		// Accessing the protected fields and method from pclass i same package
	   pclass p = new pclass();
	   
	   System.out.println(p.name);
	   System.out.println(p.number);
	   
	   p.pm1();
	   p.pm2();
	}
   
} // class ended here


