package CollectionsPackage;
import java.util.*;

public class SetClass 
{
	public static void main(String args[])
	{
       Set<String> set = new HashSet<>();
       set.add("sagar");
       set.add("sharath");
       set.add("ganesh");
       set.add("akhil");
       set.add("sujith");
       set.add("madhu");
       set.add("prakash");
       set.add("ranjith");
       set.add("tirupathi");
       set.add("sujith");
       
       checkString(set);
       //issetEmpty(set);
       //removeStr(set);
       //sizeofSet(set);
       //clearSet(set);
       
	}
    
    static void checkString(Set<String>set) // check if string exists in set
    {
    	System.out.println(set.contains("ganesh")); // true
    }
    
    static void issetEmpty(Set<String>set) // check if set is empty
    {
    	System.out.println(set.isEmpty()); // false
    }
    
    static void removeStr(Set<String>set) // remove string from set
    {
        set.remove("madhu");
        for(String str : set)
        	System.out.println(str);
    }
    
    static void sizeofSet(Set<String>set) // print Size of set
    {
    	System.out.println(set.size()); 
    }
    
    static void clearSet(Set<String>set) // clear all strings in set
    {
        set.clear();
        for(String str : set)
        	System.out.println(str);
    }
}
