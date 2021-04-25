package staticPackage;

public class instatic3 //program 4. Call instance methods in static methods 
{
	
	   public void display()  
	   {
		   System.out.print(" Instance method");
	   }
	   
	   static void show()
	   {
		   instatic3 in = new instatic3();
		   in.display();
	   }
	   
	   public static void main(String args[])
	   {
		   show();
	   }
}
