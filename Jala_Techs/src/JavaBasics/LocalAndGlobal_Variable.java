package JavaBasics;

public class LocalAndGlobal_Variable 
{
   public  String name = "sagar kumar";//Global variable we can access from other package also 
   public static void main(String args[])
   {
	   String name ="sagar kumar";//local variable
	   LocalAndGlobal_Variable lg = new LocalAndGlobal_Variable();
	   
	   System.out.print("Local variable : "+name+" and Global Variable : "+lg.name);
   }
}
