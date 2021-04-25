package MethodOverloading;

// 2. Write two methods with the same name but different number of parameters of different 
// data type and call the methods from main method

public class inmo1 
{
	public void show(int i,double d)
	   {
		   System.out.println("In show method of different type two argument "+i+","+d);
	   }
	 public void show(int i,double d,String name)
	   {
		   System.out.println("In show method of different type three arguments "+i+","+d+","+name);
	   }
	   
	 public static void main(String args[])
	   {
		   inmo1 in = new inmo1();
		   in.show(5,5.5);
		   in.show(5, 6, "String type");
	   }
}
