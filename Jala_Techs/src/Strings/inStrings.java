package Strings;

public class inStrings 
{
   public static void main(String args[])
   {
	  //createString(); 
	  //concat();
	  // findL();
	  // subString();
	  // searching();
	  // methods();
	  // trimMethod();
	   replaceChars();
   }
   static void createString() // program 1. Different ways creating a string
   {
	   String s = "First way";
	   String s1 = new String("Second way");
	   
	   char[] ch = {'T','h','i','r','d'};
	   String s2 = new String(ch);
	   
	   System.out.println(s);
	   System.out.println(s1);
	   System.out.println(s2);
   }
   static void concat() // program 2.Concatenating two strings using + operator
   {
	   String s1 = "First ";
	   String s2 = "Second ";
	   System.out.print(s1+s2);
   }
   static void findL() // program 3. Finding the length of the string
   {
	   String s = "Lenght of STring";
	   System.out.println(s.length());
   }
   static void subString() // program 4. Extract a string using Substring
   {
	   String s = "ItIsSubString";
	   System.out.println(s.substring(4));
   }
   static void searching() // program 5. Searching in strings using indexOf()
   {
	   String s = "Searching for good ?";
	   System.out.println(s.indexOf("for"));
   }
   static void methods() // program 7&8. Comparing strings using the methods equals(),equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
   {
	   String s = "Matching";
	   String s1 = "Matching";
	   String s2 = "matching";
	   
	   if(s.equals(s1)) System.out.println("Matched String");
	   
	   System.out.println(s1.equalsIgnoreCase(s2)); // true
	   
	   System.out.println(s1.startsWith("oo")); //false
	   
	   System.out.println(s2.endsWith("ing")); // true
	   
	   System.out.println(s1.compareTo(s)); // return 0
	   
   }
   static void trimMethod() // program 9. Trimming strings with trim()
   {
	   String s ="TRim This ";
	   
	   System.out.println(s+"String"); // without trim()
	   System.out.println(s.trim()+"String"); // withTrim()
	   
   }
   static void replaceChars() // program 10. Replacing characters in strings with replace()
   {
	   String s ="TRim This ";
	   
	   System.out.println(s.replace('R', 'r')); //Trim This
   }
}
