package staticPackage;

public class instatic6 // program 7. Call static methods and instance methods in main method 
{
	  public void display()  
	   {
		  System.out.print(" Instance method"); 
	   }
	   
	   static void show()
	   {
		   System.out.print(" Static method");
		   
	   }
	   
	   public static void main(String args[])
	   {
		   instatic6 in = new instatic6();
		   in.display();
		   show();
	   }

}
