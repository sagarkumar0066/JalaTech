package ThisAndSuper;

//1. Print the fields/instance members of the current class using this and without using object

public class ints1 
{
    int number;String name;
    public  ints1(int number, String name)
    {
    	this.name = name;
    	this.number = number;
    	
    	System.out.println(number+" : "+name);
    }
    public static void main(String args[])
    {
    	int number = 101;
        String name = "instance variable";
    	new ints1(number,name);
    }
}
