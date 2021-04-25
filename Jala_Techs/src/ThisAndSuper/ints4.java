package ThisAndSuper;

// 4. Call argument constructor of current class using this()

public class ints4 
{
	ints4()
    {
		this(3);
    }
    ints4(int i)
    {
       System.out.println("parameterized constructor :"+i);
    }
    
    public static void main(String args[])
    {
    	new ints4();
    }
}
