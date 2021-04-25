package AccessModifiers;

//1. Create a class with PRIVATE fields, private method and a main method. Print the fields 
//in main method. Call the private method in main method.
//Create a sub class and try to access the private fields and methods from sub class.

public class InAM1 
{
   private String name = "private name";
   private int number = 101;

public static void main(String args[])
   {
	   InAM1 in = new InAM1();
	   System.out.println("private string "+in.name);
	   System.out.println("private int "+in.number);
	   
	   in.pMethod1();
	   in.pMethod2();
   }
   
   private void pMethod1()
   {
	  System.out.println("first private method in in class InAm1");
   }
   private void pMethod2()
   {
	   System.out.println("second private method in in class InAm1");
   }
}
class InAM1E extends InAM1
{
	// ww can't access private feilds and method by exntending class
}
