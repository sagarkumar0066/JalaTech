package loops;

public class inloops3 
{
	public static void main(String args[])
	 {
		int[] ar = {2,7,6,4,9,11,14,17,12,19}; // program 4. Write a program to print the odd and even numbers.
		
		System.out.print("Even numbers : ");
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2 ==0)
			{
				System.out.print(ar[i]+" ");
			}
		 }
			System.out.println("");
			
	    System.out.print("Odd numbers : ");
			for(int i=0;i<ar.length;i++)
			{
				if(ar[i]%2 !=0)
				{
					System.out.print(ar[i]+" ");
				}
			 }
		
		System.out.println("\n\n from here next program ");
		
		int a=12,b=10,c=15;   // program 5. Write a program to print largest number among three numbers.
		
		if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>c)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}	
		
		System.out.println("\n from here next program ");
		
		int i=9;
		while(i++ <= 100) // program 6. Write a program to print even number between 10 and 100 using while
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		
	 }
}
