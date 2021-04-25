package AccessModifiers;

//2. Create a class with DEFAULT fields and methods. Access these fields and methods 
//from any other class in the same package

class inAM2 
{
	public static void main(String args[])
	{
		AccessDefaults in = new AccessDefaults();
		
		System.out.println(in.name);
		System.out.println(in.number);
		
		in.dm1();
		in.dm2();
		
	}
   
} // class closed here

class AccessDefaults
{
	String name = "Default String";
	   int number = 2;
	   
	   void dm1()
	   {
		   System.out.println("Defalut method one");
	   }
	   void dm2()
	   {
		   System.out.println("Defalut method two");
	   }
	
}
