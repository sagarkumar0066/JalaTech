package staticPackage;

public class instatic4 // program 5. Call static methods in instance methods 
{
	public void display()  
	   {
          show();
	   }
	   
	   static void show()
	   {
		   System.out.print(" Static method");
		   
	   }
	   
	   public static void main(String args[])
	   {
		   instatic4 in = new instatic4();
		   in.display();
	   }

}
