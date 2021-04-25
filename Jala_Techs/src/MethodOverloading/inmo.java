package MethodOverloading;

// 1. Write two methods with the same name but different number of parameters of same type 
//and call the methods from main method

public class inmo 
{
   public void show(int i)
   {
	   System.out.println("In show method of integer type one argument "+i);
   }
   public void show(int i,int j)
   {
	   System.out.println("In show method of integer type two arguments "+i+","+j);
   }
   
   public static void main(String args[])
   {
	   inmo in = new inmo();
	   in.show(5);
	   in.show(5, 6);
   }
}
