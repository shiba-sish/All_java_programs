package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O8_sorting {

	public static void main(String[] args) {
		// sorting elements of the ArrayList using the sort() function.
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("List before sort: "+list_Strings);
		  //  Collections class from the util package has the function sort() which we can use. 
		  Collections.sort(list_Strings);
		  System.out.println("List after sort: "+list_Strings); 
	}
}