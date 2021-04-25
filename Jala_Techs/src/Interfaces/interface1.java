package Interfaces;

//1. Create an interface with only one method and implement it in a class. Call the method implemented.

interface intClass
{
	void show();
}
public class interface1 implements intClass
{

	@Override
	public void show() 
	{
	    System.out.println("An implemented method of an Interface");	
	}
    
	public static void main(String args[])
	{
		interface1 in = new interface1();
		in.show();
	}
}
