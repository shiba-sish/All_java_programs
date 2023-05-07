package collection_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O9_Copy_ArrayToAnother {

	public static void main(String[] args) {
		
		  List<String> List1 = new ArrayList<String>();
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		  System.out.println("List1: " + List1);
		  List<String> List2 = new ArrayList<String>();
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  System.out.println("List2: " + List2);
		  
		  // Copy List2 to List1
		  Collections.copy(List1, List2);
		  System.out.println("Copy List to List2,\nAfter copy:");
		  System.out.println("List1: " + List1);
		  System.out.println("List2: " + List2);
		  
		   // reversing a ArrayLIst	  
		  System.out.println("List before reversing :\n" + List1);  
		  Collections.reverse(List1);
		  System.out.println("List after reversing :\n" + List1); 
		  
		  // slicing the Arraylist 
		  List<String> list_Strings = new ArrayList<String>();
		  list_Strings.add("Red");
		  list_Strings.add("Green");
		  list_Strings.add("Orange");
		  list_Strings.add("White");
		  list_Strings.add("Black");
		  System.out.println("Original list: " + list_Strings);
		  List<String> sub_List = list_Strings.subList(0, 3);
		  String firlst = list_Strings.get(0);
		  String last = list_Strings.get(list_Strings.size()-1);
		  System.out.println("First ->"+firlst+" and Last->"+last);
		  System.out.println("List of first three elements: " + sub_List);
	}
}
