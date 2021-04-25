package Strings;

public class inStrings1 
{
  public static void main(String args[])
  {
	 //splitM(); 
	  //valueOfM();
	 // intToString();
	  ULM();
  }
  static void splitM() // program 11. Splitting strings with split()
  {
	  String s = "Jala Technologies";
	  String[] s1 = s.split(" ");
	  
	  for(String st : s1)
		  System.out.println(st);
  }
  static void valueOfM() // program 12. Converting Numbers to Strings with valueOf()
  {
	  int l = 9999;
	  String s = String.valueOf(l);
	  System.out.println(s+100);
  }
  static void intToString() // program 13.Converting integer objects to Strings
  {
	  Integer in = new Integer(55);
	  String s = Integer.toString(in);
	  
	  System.out.println(s);
  }
  static void ULM() // program 14. Converting to uppercase and lowercas
  {
	  String s = "Converting it into Uppercase";
	  String s1 = "CONVERTING it INTO LowerCase";
	  
	  System.out.println(s.toUpperCase());
	  System.out.println(s1.toLowerCase());
  }
}
