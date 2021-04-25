package CollectionsPackage;

import java.util.*;

public class ArrayListClass 
{
   public static void main(String args[])
   {
      List<String> list = new ArrayList<>();
      list.add("sagar");
      list.add("ashok");
      list.add("shiva");
      list.add("sai");
      list.add("eshwer");
      list.add("raviteja");
      list.add("ramu");
      list.add("ganesh");
      list.add("akhil");
      list.add("sujith");
      
      // addEle(list);
      //iterating(list);
      //addEleIn(list);
      //removeEleIn(list);
     // updateEleIn(list);
      //checkEleIn(list);
     // getEleIn(list);
      //listSize(list);
      checkEleList(list);
     // removeAllEle(list);
   }
   
   static void addEle(List<String> list) // Add an element to the ArrayList
   {
	   list.add("madhu");
   }
   
   static void iterating(List<String> list) // Iterate through the ArrayList by using Iterator object
   {
	  Iterator<String> it = list.iterator(); 
	  
	  while(it.hasNext())
	  {
		  System.out.print(" "+it.next());
	  }
   }
   
   static void addEleIn(List<String> list) // Add an element at a specific index
   {
	   list.add(4, "Prasad");
	   
	   for(String p : list) System.out.print(" "+p);
   }
   
   static void removeEleIn(List<String> list) // Remove an element from the ArrayList, Remove at an index
   {
	   list.remove(9);
	   for(String p : list) System.out.print(" "+p);
   }
   
   static void updateEleIn(List<String> list) // Update the element at a specific index
   {
	   list.set(1, "FakeAshok");
	   for(String p : list) System.out.print(" "+p);
   }
   
   static void checkEleIn(List<String> list) // Check the element is present at a particular index
   {
	   // here i want to check akhil name at index 8;
	   
	   if(list.get(8)=="akhil")
		   System.out.println("Yes akhil name is present at that index");
	   else
		   System.out.println("Yes akhil name is not present at that index");
   }
   
   static void getEleIn(List<String> list) // Get an element at a particular index
   {
	   System.out.println(list.get(5));
   }
   
   static void listSize(List<String> list) // Find out the size of the ArrayList
   {
	   System.out.println(list.size());
   }
   
   static void checkEleList(List<String> list) // Check the given element is present in the ArrayList
   {
	   if(list.contains("sujithh"))
		   System.out.println("list contain the element");
	   else
		   System.out.println("list doesn't contain the element");
   }
   
   static void removeAllEle(List<String> list) // Remove all elements of the ArrayList
   {
	   list.clear();
	   for(String p : list) System.out.print(" "+p);
   }
}
