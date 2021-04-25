package MethodOverloading;

// 4. Write two methods with the same name and same number of parameters of different 
//    type and call from main method

public class inmo3 
{
	public void show(int i,double d)
	   {
		   System.out.println("In show method of different type two argument "+i+","+d);
	   }
	 public void show(int i,int d)
	   {
		   System.out.println("In show method of different type two arguments "+i+","+d);
	   }
	   
	 public static void main(String args[])
	   {
		   inmo3 in = new inmo3();
		   in.show(5,5.5);
		   in.show(5,6);
	   }
}
