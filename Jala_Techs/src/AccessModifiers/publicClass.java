package AccessModifiers;

//4. Create a class with PUBLIC fields and methods. 
//Access the public methods and fields from any class in the same package or different 
//package

public class publicClass 
{
   public String s = "public string";
   public int i = 100;
   
   public void pm1()
   {
	   System.out.println("From public method one");
   }
   public void pm2()
   {
	   System.out.println("From public method Two");
   }
}
