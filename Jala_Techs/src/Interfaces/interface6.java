package Interfaces;

//7. Create an interface and inherit it from the other interface.

interface intClass3 
{
   default void show()
   {
	 System.out.println("Super interface method");  
   }
}
interface intClass4 extends intClass3
{
	default void display()
	   {
		 System.out.println("Sub interface method");  
	   }
}

public class interface6 implements intClass4
{
	public static void main(String args[])
	{
       interface6 in = new interface6();
       in.show();
       in.display();
	}
}
