package constructors;

//2.Call the constructors(both default and argument constructors) of super class from a child 
//class

class superinc2
{
	public superinc2()
	{
		System.out.println("Default constructor in super Class");
	}
	public superinc2(int i)
	{
		System.out.println("one argument constructor in super class "+i);
	}
	public superinc2(int i,double j)
	{
		System.out.println("two arguments constructor in super class "+(i+j));
	}
}

public class inc2 extends superinc2 
{
	public inc2()
	{
		super();
		System.out.println("Default constructor in sub Class");
	}
	
	public inc2(int i)
	{
		super(i);
		System.out.println("one argument constructor in sub Class "+i);
	}
	
	public inc2(int i,int j)
	{
		super(i,j);
		System.out.println("two argument constructor in sub Class "+(i+j));
	}
	
	
   public static void main(String args[])
   {
	   //super();
	   inc2 in = new inc2();
	   
	   inc2 in1 = new inc2(15);
	   
	   inc2 in2 = new inc2(15,12);
	   
	   //System.out.println("Default constructor"); 
   }
}
