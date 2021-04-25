package Abstract;

//2. Create a sub class for an abstract class. Create an object in the child class for the 
//abstract class and access the non-abstract methods
class inAb extends inAbs 
{
	public static void main(String args[])
	{
		inAbs ia = new inAb(); // instance of absract class
		
		ia.ab1(); // non-abstract methods
		ia.ab2();
		
	}

	@Override
	void display() 
	{
		System.out.println("This is an abstract display method in absract class");                		
	}

	@Override
	void show()
	{
		System.out.println("This is an abstract show method in absract class");
	}
} // here class ended

//1. Create an abstract class with abstract and non-abstract methods
abstract class inAbs 
{
	  abstract void display();
	  abstract void show();
	  
	    void ab1()
	    {
	    	System.out.println("This is first non-abstract method in absract class");
	    }
	    void ab2()
	    {
	    	System.out.println("This is second non-abstract method in absract class");
	    }
}

