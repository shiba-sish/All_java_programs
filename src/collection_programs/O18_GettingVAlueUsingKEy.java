package collection_programs;

import java.util.HashMap;

public class O18_GettingVAlueUsingKEy {

	public static void main(String[] args) {
		// get() function takes the key as the parameter to fetch the value. based on that key. 
		
		   HashMap<Integer,String> hash_map= new HashMap<Integer,String>();  
		   hash_map.put(1,"Red");
		  hash_map.put(2,"Green");
		  hash_map.put(3,"Black");
		  hash_map.put(4,"White");
		  hash_map.put(5,"Blue");
		     // get value of key 3
		   String val= hash_map.get(3); 
		   // check the value
		   System.out.println("Value for key 3 is: " + val);
		   
		   
		   // printing all the keys using keySet() function. 
		   System.out.println(hash_map.keySet());
		   
		   
		   // printing all the values of the hashmap() using values() function. 
		   
		   System.out.println(hash_map.values());
	}
}