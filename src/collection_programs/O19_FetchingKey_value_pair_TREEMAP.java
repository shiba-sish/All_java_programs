package collection_programs;

import java.util.Map;
import java.util.TreeMap;

public class O19_FetchingKey_value_pair_TREEMAP {

	public static void main(String[] args) {
		 // Create a tree map
		   TreeMap<Integer,String> tree_map=new TreeMap<Integer,String>();      
		  // Put elements to the map 
		  tree_map.put(1, "Red");
		  tree_map.put(2, "Green");
		  tree_map.put(3, "Black");
		  tree_map.put(4, "White");
		  tree_map.put(5, "Blue");
		    
		   for (Map.Entry<Integer,String> entry : tree_map.entrySet())
		   {
		    System.out.println(entry.getKey() + "=>" + entry.getValue());
		   }
		   
		   
//		   System.out.println(tree_map.firstKey());
//		   System.out.println(tree_map.lastKey());
		   
		   System.out.println(tree_map.pollFirstEntry()); // will fetch you the first element from the tree_map
		   System.out.println(tree_map.pollLastEntry()); // will fetch you the last element from the tree_map
		   
//		   System.out.println(tree_map.firstEntry());
//		   System.out.println(tree_map.lastEntry());
	}
}