package MethodOverloading;

// 3. Write two methods with the same name and same number of parameters of same type 
// and call from main method
 
// in method overloading we can't create same method name with same parameters of same type

class superClass
{
	public void show(int i,int d)
	   {
		   System.out.println("In super class show method of different type two argument "+i+","+d);
	   }
}
class subClass extends superClass
{
	public void show(int i,int d)
	   {
		   System.out.println("In sub class show method of different type two argument "+i+","+d);
	   }
}
public class inmo2 
{
	 public static void main(String args[])
	   {
		   superClass in = new subClass();
		   in.show(5,5);
	   }
}
