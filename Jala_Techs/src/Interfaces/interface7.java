package Interfaces;

public class interface7 implements intClass5
{

	@Override
	public void show() 
	{
	  System.out.println("Implemented method of an interface in class");
	}
	
	public static void main(String args[])
	{
		interface7 in = new interface7();
		System.out.println(in.number);
		System.out.println(in.name);
		in.show();
	}
	
}
