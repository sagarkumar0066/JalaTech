package Interfaces;

// 2. Create an interface with two methods, but implement only one in a class. Call the method implemented.

interface intClass1
{
	    void show();
default void display()
	{
		System.out.println("we can implemet method in inteface using default keyword");
	}
}
public class interface2 implements intClass1
{

	@Override
	public void show() 
	{
	   System.out.println("Implemented method of inteface");
	}
  
	public static void main(String args[])
	{
		interface2 in = new interface2();
		in.show();
	}
}
