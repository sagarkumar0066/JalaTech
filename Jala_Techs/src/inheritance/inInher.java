package inheritance;

public class inInher 
{
   public static void main(String args[])
   {
	   A a = new A();
	   B b = new B();
	   C c = new C();
	  
	   //callin all methods in each class
	   a.a1();
	   a.a2();
	   a.calc();
	   
	   b.b1();
	   b.b2();
	   b.calc();
	   
	   c.c1();
	   c.c2();
	   c.calc();
	   
	 // calling override method by super class reference  
	   a = b;
	   b.calc();
	   
	   a=c;
	   c.calc();
	   
   }
}
class A
{
	int a =10, b =12;
	int c = a+b;
	public void a1()
	{
		System.out.println("In Class A first method");
	}
	public void a2()
	{
		System.out.println("In Class A second method");
	}
	public void calc()
	{
		System.out.println("In Class A override method");
		System.out.println("Addition : "+c);
		
	}
}
class B extends A
{
	int a =10, b =12;
	int c = a-b;
	public void b1()
	{
		System.out.println("In Class B first method");
	}
	public void b2()
	{
		System.out.println("In Class B second method");
	}
	public void calc()
	{
		System.out.println("In Class B override method");
		System.out.println("substraction : "+c);
	}
}
class C extends B
{
	int a =10, b =12;
	int c = a*b;
	public void c1()
	{
		System.out.println("In Class C first method");
	}
	public void c2()
	{
		System.out.println("In Class C second method");
	}
	public void calc()
	{
		System.out.println("In Class C override method");
		System.out.println("Multiplication : "+c);
	}
}
