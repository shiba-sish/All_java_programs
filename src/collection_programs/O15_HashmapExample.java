package collection_programs;

import java.util.HashMap;
import java.util.Map;

public class O15_HashmapExample {
	public static void main(String[] args) {
		  HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		  hash_map.put(1, "Red");
		  hash_map.put(2, "Green");
		  hash_map.put(3, "Black");
		  hash_map.put(4, "White");
		  hash_map.put(5, "Blue");
		  
		  for(Map.Entry x:hash_map.entrySet()){  
		   System.out.println(x.getKey()+" "+x.getValue());  
		  }
		  
		  //printing the size of the hashmap
		  System.out.println("\nSize of the hash map: "+hash_map.size());
		  
		  // copy one hashmap to another. 
		  HashMap <Integer,String> hash_map2 = new HashMap <Integer,String> ();
		  hash_map2.put(4, "White");
		  hash_map2.put(5, "Blue");
		  hash_map2.put(6, "Orange");
		  System.out.println("\nValues in second map: " + hash_map2);
		  
		  // putAll() function puts all the value into hashmap2
		  hash_map2.putAll(hash_map);
		  System.out.println("\nNow values in second map: " + hash_map2);
		  
		  
		  // to clear all the values we will use the clear() function and to check if its empty we will use the isEmpyt() function. 
		  
		  
		  // check if map is empty
		  boolean result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result);
		  // Removing all the elements from the linked map
		  hash_map.clear();
		  // check if map is empty
		  result = hash_map.isEmpty();
		  // check the result
		  System.out.println("Is hash map empty: " + result); 
	}
}