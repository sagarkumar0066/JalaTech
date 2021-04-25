package constructors;

// 5. Try to call the constructor multiple times with the same object

public class inc4 
{
	static int count = 0;
   inc4()
   {
	  count += 1; 
   }
   public static void main(String args[])
   {
	  inc4 in = null;
	   in = new inc4();
	   in = new inc4();
	   in = new inc4();
	  
	  System.out.println(in.count); // yes we can call the contructor no.of times by same object, here we can see count number
   }
}
