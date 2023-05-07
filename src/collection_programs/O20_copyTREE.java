package collection_programs;

import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;



class Sort_key implements Comparator<String>{
    @Override
   public int compare(String str1, String str2) {
       return str1.compareTo(str2);
   }
}
public class O20_copyTREE {

	public static void main(String[] args) {
		// Create a tree map
		   TreeMap<String,String> tree_map1=new TreeMap<String,String>();      
		  
		  // Put elements to the map 
		  tree_map1.put("C1", "Red");
		  tree_map1.put("C2", "Green");
		  tree_map1.put("C3", "Black");
		  tree_map1.put("C4", "White");
		  tree_map1.put("C5", "Blue");
		   System.out.println("Tree Map 1: "+tree_map1);
		   
		   TreeMap<String,String> tree_map2 = new TreeMap<String,String>();
		   tree_map2.put("A1", "Orange");
		   tree_map2.put("A2", "Pink");
		   System.out.println("Tree Map 2: "+tree_map2);
		   
		   // use the putAll() function to copy one tree_map to another
		   tree_map1.putAll(tree_map2);
		   System.out.println("After coping map2 to map1: "+tree_map1); 
		   
		   
		   // check if the tree_map contains any specific value. 
		   
		   if(tree_map1.containsValue("Green")){
	            System.out.println("The TreeMap contains value Green");
	        } else {
	            System.out.println("The TreeMap does not contain value Green");
	        }
	        if(tree_map1.containsValue("Pink")){
	            System.out.println("The TreeMap contains value Pink");
	        } else {
	            System.out.println("The TreeMap does not contain value Pink");
	        }
	        
	        
	        System.out.println("\nGetting all the keys from the tree_map\n");
	        Set<String> keys = tree_map1.keySet();
	        for(String key: keys){
	            System.out.println(key);
	        }
	        
	        System.out.println("\nReversing order view of the keys. \n");
	        System.out.println("Reverse order view of the keys: " + tree_map1.descendingKeySet());
	        
	        
	        TreeMap < Integer, String > tree_map4 = new TreeMap < Integer, String > ();
	        // Put elements to the map 
	        tree_map4.put(10, "Red");
	        tree_map4.put(20, "Green");
	        tree_map4.put(40, "Black");
	        tree_map4.put(50, "White");
	        tree_map4.put(60, "Pink");
	        
	         // program to display higest key one smaller than the key entered. 
	        System.out.println("Orginal TreeMap content: " + tree_map1);
	        System.out.println("Checking the entry for 10: ");
	        System.out.println("Key is: " + tree_map4.floorKey(10));
	        System.out.println("Checking the entry for 30: ");
	        System.out.println("Key is: " + tree_map4.floorKey(30));
	        System.out.println("Checking the entry for 70: ");
	        System.out.println("Key is: " + tree_map4.floorKey(70));
	        
	}
}