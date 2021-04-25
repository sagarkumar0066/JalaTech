package Interfaces;

// 5. Create two interfaces with the same method (same signature) in both the interfaces. 
//    Implement these two interfaces in one class. Call the method.

interface firstInterfacee
{
	void show();
}
interface secondInterfacee
{
	void show();
}

public class interface5 implements firstInterfacee,secondInterfacee
{
	@Override
	public void show() 
	{
		System.out.println("Both first and second interface methods implemented by implemeted class");
	}
	
	public static void main(String args[])
	{
		interface5 in = new interface5();
			
		   in.show();
	}
     
}
