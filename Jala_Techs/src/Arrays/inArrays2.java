package Arrays;

import java.util.ArrayList;
import java.util.List;

public class inArrays2 
{
   public static void main(String args[])
   {
	   int[] a = {12,4,3,8,33,1,4};
	   int[] b = {55,16,21,5,3,20,12};
	   
	   //commonValues(a,b);
	   //removeDuplicates(a);
	   //secondLargeNumber(a);
	   //EvenOddNumbers(a);
	   //LmS(a);
       //specifiedElements(b);
	   removeDElements(a);
	   
   }
   static void commonValues(int[] a,int[] b) //program 11. Write a program to find the common values between two array
   {
	   for(int p : a)
	   {
		   for(int q : b)
		   {
			   if(p == q)
				   System.out.print(p+" ");
		   }
	   }
   }
   static void removeDuplicates(int[] a) // program 12. Write a method to remove duplicate elements from an array
   {
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]==a[j])
				   a[i] = 0; // here i am replacing with zero because we can't shrink array or change array size
		   }
	   }
	   
	   for(int p : a)
	   {
		   if(p!=0) System.out.print(p+" "); // here i am not printing 0 values
	   }
   }
   static void secondLargeNumber(int[] a) // program 13 & 14 Write a method to find the second largest number in an array
   {
	   for(int i=0;i<a.length;i++)
       {
     	  for(int j=i+1;j<a.length;j++)
     	  {
     		  if(a[i]<a[j])
     		  {
     			  a[i] = a[i]+a[j]-(a[j]=a[i]);
     					  
     		  }
     	  }
       }
	   
	   for(int p : a) System.out.print(p+" ");
	   
	   System.out.print("second largest number : "+a[1]);
   }
   static void EvenOddNumbers(int[] a) // program 15. Write a method to find number of even number and odd numbers in an array
   {
	  System.out.print("Even numbers : ");
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2==0)
			  System.out.print(a[i]+" ");
	  }
	  System.out.print("Odd numbers : ");
	  for(int i=0;i<a.length;i++)
	  {
		  if(a[i]%2!=0)
			  System.out.print(a[i]+" ");
	  }
   }
   static void LmS(int[] a) // program 16. Write a function to get the difference of largest and smallest value
	{
	   int min = Integer.MAX_VALUE;
	   int max =0;
	  
	   for(int p : a)
	   {
		   if(p>max)
			   max = p;
		   if(min>p)
			   min = p;
	   }
	   
	   System.out.println(max-min);  
    }
   static void specifiedElements(int b[]) // program 17. Write a method to verify if the array contains two specified elements(12,23)
   {
	   int a[] = {12,23};
	   
	   List<Integer> list = new ArrayList<Integer>();
	  
	   for(int p : a)
	   {
		   for(int q : b)
		   {
			   if(p==q)
			   {
				   list.add(p);
			   }
		   }
	   }
	   if(a.length == list.size())
		   System.out.print("array contains both elements");
	   else
		   System.out.print("array doesn't contain both elements");
   }
   static void removeDElements(int a[]) // program 18. Write a program to remove the duplicate elements and return the new array
   {
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[i]==a[j])
				   a[i] = 0; // here i am replacing with zero because we can't shrink array or change array size
		   }
	   }
	   
	   for(int p : a)
	   {
		   if(p!=0) System.out.print(p+" "); // here i am not printing 0 values
	   } 
   }
   
}
