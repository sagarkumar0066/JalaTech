package Interfaces;

//4. Create two interfaces with one method each. Implement these two interfaces in one class. 
interface firstInterface
{
	void show();
}
interface secondInterface
{
	void display();
}
public class interface4 implements firstInterface,secondInterface
{

	@Override
	public void show() 
	{
		System.out.println("firstinterface method implemented by implemeted class");
	}

	@Override
	public void display() 
	{
		System.out.println("secondinterface method implemented by implemeted class");
	}
	
	public static void main(String args[])
	{
		interface4 in = new interface4();
			
		   in.show();
		   in.display();
	}

}
