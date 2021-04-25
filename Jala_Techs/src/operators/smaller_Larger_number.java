package operators;
import java.util.*;
public class smaller_Larger_number 
{
	public static void main(String args[])
	 {
		int smallest =Integer.MAX_VALUE,largest =0;
		Scanner sc = new Scanner(System.in);
		  int numbers = sc.nextInt();
		  
		  for(int i=0;i<numbers;i++)
		  {
			  int num = sc.nextInt();
			  
			  if(num>largest)
			  {
				  largest = num;
			  }
			  if(num<smallest)
			  {
				  smallest =num;
			  }
		  }
		  
		  System.out.println("Largest number : "+largest+" and Smallest number : "+smallest);
		  
     }
}
