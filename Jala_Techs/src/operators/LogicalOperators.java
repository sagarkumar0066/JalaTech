package operators;

public class LogicalOperators 
{
	public static void main(String args[])
	   {
		  int a=10,b=15;
		  
		  if(a>b && a!=b)
		  {
			  System.out.println("Logical And operator");
		  }
		  else if(a>b || a==b)
		  {
			  System.out.println("Logical OR operator");
		  }
		  else if(!(a>b))
		  {
			  System.out.println("Logical NOT operator");
		  }
		  
	   }
}
