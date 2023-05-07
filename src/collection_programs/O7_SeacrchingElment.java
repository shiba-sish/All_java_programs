package collection_programs;

import java.util.ArrayList;
import java.util.List;

public class O7_SeacrchingElment {

	public static void main(String[] args) {
		// searching element using the contains() functions 
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  // Search the value Red
		    if (list_Strings.contains("Red")) {
		    System.out.println("Found the element");
		    } 
		    else {
		    System.out.println("There is no such element");
		    }
	}
}