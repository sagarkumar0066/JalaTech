package CollectionsPackage;
import java.util.*;
import java.util.stream.Collectors;
public class MapClass 
{
	public static void main(String args[])
	{
      Map<String,String>map = new HashMap<>();
      map.put("548","sharath");
      map.put("549","nishitha");
      map.put("549","vinay");
      map.put("550","deepak");
      map.put("551","preetham");
      map.put("552","aravind");
      map.put("553","sravanthi");
      map.put("554","sagar");
      map.put("555","sainadh");
      map.put("556","sai ram");
      
      //insertKV(map);
      //fetchV(map);
      //copyM(map);
      //checkKey(map);
      //checkValue(map);
      //ismapEmpty(map);
      //sizeOfMap(map);
      //allKeys(map);
      //allValues(map);
      removeSpecifivKV(map);
	}
	
	static void insertKV(Map<String,String>map) // Insert a Key value mapping into the map
	{
		map.put("557","jagadhish");
	}
	
	static void fetchV(Map<String,String>map) // Fetch the value of a Key
	{
		System.out.println(map.get("551")); // here key is 551
	}
	
	static void copyM(Map<String,String>map) // Create a clone/copy of HashMap & Copy all the elements of the Map to another Map
	{
		Map<Object, Object> cloneMap = map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		
		for(String str : map.keySet() )
		{
			System.out.println(str +" : "+ cloneMap.get(str));
		}
	}
	
	static void checkKey(Map<String,String>map) // Check if the given Key is in the Map
	{
		String key = "556";
		System.out.println(map.containsKey(key)); // true
	}
	
	static void checkValue(Map<String,String>map) // Check if the given Value is in the Map
	{
		String value = "sai ram";
		System.out.println(map.containsValue(value)); // true
	}
	
	static void ismapEmpty(Map<String,String>map) // Check if the map is empty
	{
		System.out.println(map.isEmpty()); // false
	}
	
	static void sizeOfMap(Map<String,String>map) // Print the size of the Map to the console
	{
		System.out.println(map.size());
	}
	
	static void allKeys(Map<String,String>map) // Print all the Keys of the map to the console
	{
		for(String str : map.keySet())
		     System.out.println(str);
	}
	
	static void allValues(Map<String,String>map) // Print all the values of the map to the console
	{
		for(String str : map.keySet())
		     System.out.println(map.get(str));
	}
	
	static void removeSpecifivKV(Map<String,String>map) // Remove a specific Key-value pair
	{
		String key = "552";
		
		map.remove(key);
		
		for(String str : map.keySet())
			System.out.println(str +" : "+ map.get(str));
	}
	
}
