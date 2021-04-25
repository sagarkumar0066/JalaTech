package constructors;

//1. Write a class with a default constructor, one argument constructor and two argument 
//constructors. Instantiate the class to call all the constructors of that class from a main 
//class

public class inc1 
{
    public static void main(String args[])
    {
    	ConClass c = new ConClass();
    	
    	ConClass c1 = new ConClass(10);
    	
    	ConClass c2 = new ConClass(10,12);
    	
    }
}
class ConClass
{
	public ConClass()
	{
		System.out.println("Default constructor");
	}
	public ConClass(int i)
	{
		System.out.println("one argument constructor "+i);
	}
	public ConClass(int i,double j)
	{
		System.out.println("two arguments constructor "+(i+j));
	}
}
