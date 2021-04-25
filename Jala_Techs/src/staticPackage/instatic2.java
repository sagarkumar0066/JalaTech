package staticPackage;

public class instatic2 // program 3.Print static variables in Instance methods
{
   static String name = "static variable";
   
   public void display()  // instance method
   {
	   System.out.print(name);
   }
   
   public static void main(String args[])
   {
	   instatic2 in = new instatic2();
	   in.display();
   }
}
