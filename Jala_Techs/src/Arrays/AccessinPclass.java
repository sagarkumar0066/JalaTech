
package Arrays;

import AccessModifiers.publicClass;

public class AccessinPclass 
{
	// Accessing public class fields and methods from different package;
  public static void main(String args[])
   {
	publicClass p = new publicClass();
	  
	  System.out.println(p.i);
	  System.out.println(p.s);
	  
	  p.pm1();
	  p.pm2();
   }
}
