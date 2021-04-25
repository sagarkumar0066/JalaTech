package operators;

public class Increment_decrement 
{
	public static void main(String args[])
	   {
		   int a=10;
		   Increment(a);
		   Decrement(a);
	   }
	
	static void Increment(int a)
	{
		a++;
		System.out.println("Post Increment : "+a);
		
		System.out.println("Pre Increment : "+ ++a);
	}
	static void Decrement(int a)
	{
		a--;
		System.out.println("Post Decrement : "+a);
		
		System.out.println("Pre Decrement : "+ --a);
	}
}
