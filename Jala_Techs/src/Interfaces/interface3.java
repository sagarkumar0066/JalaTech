package Interfaces;

// 3. Use Interface instances to call the implemented method in the implemented class
interface intClass2
{
	default void show()
	{
		System.out.println("implemented method in interface");
	}
}
public class interface3 implements intClass2 
{
   public static void main(String args[])
   {
	   intClass2 in = new interface3();
	   in.show();
   }
		   
}
