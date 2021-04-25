package Interfaces;

// 9. Create a PRIVATE or PROTECTED interface and print the values as above scenario
   
   // private or protected modifiers are not for an interface

// 10. Create an interface with private, public and protected fields
 // interface allows only public,static and final doesn't allows private and protected modifiers

// 11. Create an interface with static final variable

interface intClass6
{
	static final String name = "static final variable";
	
}

public class interface8 implements intClass6
{
    public static void main(String args[])
    {
    	intClass6 in = new interface8();
    	System.out.println(in.name);
    }
}
