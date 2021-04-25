package ThisAndSuper;

// 3. Call constructor of the current class using this()

public class ints3 
{
    ints3()
    {
    	System.out.println("Current class contructor");
    }
    ints3(int i)
    {
       this();
       //System.out.println(i);
    }
    
    public static void main(String args[])
    {
    	new ints3(5);
    }
}
