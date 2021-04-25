package operators;

public class A_Operators 
{
   public static void main(String args[])
   {
	  int a=12,b=6;
	  Add(a,b);
	  Sub(a,b);
	  Mul(a,b);
	  Div(a,b);
   }
   
   static void Add(int a, int b)
   {
	   System.out.println(a+b);
   }
   static void Sub(int a, int b)
   {
	   System.out.println(a-b);
   }
   static void Mul(int a, int b)
   {
	   System.out.println(a*b); 
   }
   static void Div(int a, int b)
   {
	   System.out.println(a/b);
   }
}
