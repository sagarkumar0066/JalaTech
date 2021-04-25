package loops;

public class inloops4 
{
   public static void main(String args[])
   {
	   int number = 153; // program 8. Write a program to find Armstrong number or not;
	   int r=0,fn=0,sum=0;
	   fn=number;
	   while(fn>0)
	   {
		   r = fn%10;
		   fn = fn/10;
		   sum = sum+(r*r*r);
	   }
	   if(sum == number)
	      System.out.println(number +" is ArmStrong number");
	   else
		   System.out.println(number +" is not ArmStrong number");
	   
	   
	   System.out.println("\n");
	   // program 9.Write a program to find the prime or not.
	   
	   int pnumber = 17;
	   for(int i=2;i<pnumber;i++)
	   {
		   if(pnumber%i == 0)
		   {
			   System.out.println(pnumber +" is not prime number");
		         break;
		   }
		   else
		   {
			   System.out.println(pnumber +" is prime number");
			   break;
		   }
	   }
	   
	   System.out.println("\n");
	   // program 10.Write a program to palindrome or not.
	   
	   int pndnumber=121;
	   int re=0,su=0,fnn=0;
	   fnn = pndnumber;
	   
	   while(fnn>0)
	   {
		   re = fnn%10;
		   fnn = fnn/10;
		   su = su*10+re;
	   }
	   if(su == pndnumber)
	   {
		  System.out.println(pndnumber+" is palindrome number"); 
	   }
	   else
	   {
		   System.out.println(pndnumber+" is not palindrome number");
	   }
	   
   }
}
