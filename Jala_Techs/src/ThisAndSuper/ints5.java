package ThisAndSuper;

// 5. Call constructor of the parent class using super();

class superOfints5
{
	superOfints5()
	{
		System.out.println("Constructor of super class");
	}
}

public class ints5 extends superOfints5
{
	ints5()
	{
		super();
	}
	public static void main(String args[])
	{
		new ints5();
	}
}

