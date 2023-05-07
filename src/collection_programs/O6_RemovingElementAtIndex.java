package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class O6_RemovingElementAtIndex {
	  public static void main(String[] args) {
 // removing element from the list using remove() function.
		  
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Print the list
		  System.out.println(list_Strings);
		  // Remove the third element from the list.
		  list_Strings.remove(3);
		  // Print the list again
		  System.out.println("After removing third element from the list:\n"+list_Strings);
   }
 }