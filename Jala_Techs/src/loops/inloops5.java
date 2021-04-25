package loops;

public class inloops5 
{
   public static void main(String args[])
   {
	   EoO();  
	   MoF();
	   ifElseStatement();
   }
   static void EoO() // program 11. Program to check whether a number is EVEN or ODD using switch.
   {
	   String result="";
	  int number = 11;
	  
	  if(number%2==0)
		  result = "EVEN";
	  else
		  result = "ODD";
	  
	  switch(result)
	  {
	    case "EVEN" : System.out.println("Even number");
	                   break;
	    case "ODD" : System.out.println("Odd number");
	                   break;
	      default : 
	    	        System.out.println("Unable to find answer");
	  }
   }
   static void MoF() // program 12. Print gender (Male/Female) program according to given M/F using switch
   {
	  char c = 'F';
	  switch(c)
	  {
	  case 'M' : System.out.println("MALE");
                       break;
      case 'F' : System.out.println("FEMALE");
                       break;
      default : 
                System.out.println("Unable to find answer");  
	  }
   }
   static void ifElseStatement() //program 13.Program for multiple if else statement(Largest number in 10,20 and 30
   {
	   int a=30,b=20,c=10;
	   
	   if(a>b && a>c)
	      System.out.println(a+" is largest number");
	   else if(b>c)
		   System.out.println(b+" is largest number");
	   else
		   System.out.println(c+" is largest number");
   }
}
