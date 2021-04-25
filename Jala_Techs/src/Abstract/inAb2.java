package Abstract;

// 4. Create an instance for the child class in child class and call non-abstract method
public class inAb2 extends absClass
{
	public static void main(String args[])
	{
		inAb2 ia = new inAb2();  // child class instance -->ia
		
		ia.ab1(); // calling non - abstract methods
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
}
abstract class absClass
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
