package Arrays;

import java.util.*;

public class InArrays1 
{
   public static void main(String args[])
   {
	   int a[] = {2,14,16,9,5,24,3,33,57,5,16};
	   //add(a);
	   //avgValue(a);
	   //findIndex(a);
	   //specificValue(a);
	   //removeSpecificValue(a);
	   //copyArray(a);
	   //insertElement(a);
	   //minMaxValue(a);
	   //reverseArray(a);
	   duplicateValues(a);
	   
   }
   static void add(int[] a) // program 1. Write a function to add integer values of an array.
   {
	 int sum=0;
	 for(int i=0;i<a.length;i++)
		 sum += a[i];
	 
	 System.out.println(sum);
   }
   static void avgValue(int[] a) // program 2. Write a function to calculate the average value of an array of integers.
   {
	   int sum=0; double avg=0;
	   for(int i=0;i<a.length;i++)
		   sum += a[i];
	   
	   avg = sum/a.length;
	   
	   System.out.println(avg);
   }
   static void findIndex(int[] a) // program 3. Write a program to find the index of an array element.
   {
	   int number = 33; //find index of 33.
	   
	   for(int i=0;i<a.length;i++)
	   {
		   if(a[i] == number)
			   System.out.println("Index : "+i);
	   }
   }
   static void specificValue(int[] a) // program 4. Write a function to test if array contains a specific value.
   {
	   int value=24;
	   boolean b = false;
	   for(int i=0;i<a.length;i++)
	   {
		  if(a[i]==value)
		    b = true;
	   }
	   
	   if(b==true)
		   System.out.println("Array contains element "+value);
	   else
		   System.out.println("Array doesn't contain element "+value);
   }
   static void removeSpecificValue(int[] a) // program 5. Write a function to remove a specific element from an array.
   {
	  int number = 14;
	  for(int i=0;i<a.length;i++)
	  {
		 if(a[i] == number)
			 a[i] = 0; // here i am making that postion equal to 0 because we can't shrink and expand array;
	  }
	  
	  for(int p : a)
	  {
		  if(p != 0)
			  System.out.print(p+" ");
	  }
   }
   static void copyArray(int[] a) // program 6. Write a function to copy an array to another array
   {
	   int[] copy = new int[a.length];
	   for(int p=0;p<a.length;p++)
	   {
		   copy[p] = a[p];
	   }
	   
	   for(int k : copy) System.out.print(k+" ");
	  
   }
   static void insertElement(int[] a) // program 7. Write a function to insert an element at a specific position in the array
   {
	   int insertValue = 55;
	   int position = 5;
	   
	   a[position] = insertValue; // it replaces 24 value by 55
	   
	   for(int p : a) System.out.print(p+" ");
		   
   }
   static void minMaxValue(int[] a) // program 8. Write a function to find the minimum and maximum value of an array
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
	   
	   System.out.println("min value : "+min+" and max value : "+max);
   }
   static void reverseArray(int[] a) // program 9. Write a function to reverse an array of integer values
   {
	   for(int i=a.length-1;i>=0;i--)
		   System.out.print(a[i]+" ");
   }
   static void duplicateValues(int[] a) // program 10.Write a function to find the duplicate values of an array.
   {
	   for(int i=0;i<a.length;i++)
	   {
		   for(int j=i+1;j<a.length;j++)
		   {
			   if(a[j] == a[i])
			   {
				  System.out.print(a[i]+" ");   
			   }
		   }
	   }
   }
}
