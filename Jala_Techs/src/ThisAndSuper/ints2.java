package ThisAndSuper;

// 2. Print the fields/instance members of the parent class using super

class ints2e
{
	int i = 101;
	String name = "instance variable";
}

public class ints2 extends ints2e
{
   ints2()
   {
	  System.out.println(super.i);
	  System.out.println(super.name);
   }
   public static void main(String args[])
   {
	   new ints2();
   }
}
