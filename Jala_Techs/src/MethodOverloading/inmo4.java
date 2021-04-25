package MethodOverloading;

// 5. Write two methods with the same name, number of parameters and data type but 
//    different return Type

public class inmo4 
{
	public double show(int i,int j)
	   {
		   return i+j;
	   }
	 public int show(double i,double j)
	   {
		   return (int) (i*j);
	   }
	   
	 public static void main(String args[])
	   {
		   inmo4 in = new inmo4();
		   System.out.println(in.show(5,5));
		   System.out.println(in.show(5.5,6));
	   }
}
