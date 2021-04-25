package constructors;

//3. Apply private, public, protected and default access modifiers to the constructor

public class inc3 
{
   public inc3()
   {
	  System.out.println("public constructor "); 
   }
   private inc3(int i)
   {
	   System.out.println("private constructor "+i); 
   }
   protected inc3(char c)
   {
	   System.out.println("protected constructor "+c);  
   }
   
   inc3(double d)
   {
	   System.out.println("default constructor "+d);
   }
   
   public static void main(String args[])
   {
	   inc3 pu = new inc3();
	   inc3 pr = new inc3(110);
	   inc3 pro = new inc3('A');
	   inc3 de = new inc3(5.5);
	   
   }
}

//4. Write constructors with return type int and String

// No, constructor does not have any return type in Java.
