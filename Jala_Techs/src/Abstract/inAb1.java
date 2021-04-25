package Abstract;

// 3. Create an instance for the child class in child class and call abstract methods

public class inAb1  extends abClass
{
	public static void main(String args[])
	{
		inAb1 ia = new inAb1();  // child class instance -->ia
		
		ia.show(); // calling abstract methods
		ia.display();;
		
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
abstract class abClass
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
