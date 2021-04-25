package JavaBasics;

public class createClass 
{
	public static void main(String args[])
	{
      //creating object
       Temp t = new Temp();
       //calling method using class instance
       t.display();
	}
}
class Temp
{
	//creating method
	public void display()
	{
		System.out.print("Jala Technologies");
	}
}