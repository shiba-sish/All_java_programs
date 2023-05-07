package collection_programs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class O2_IterateArrayList 
{
  public static void main(String[] args) {
	  List<String> list_Strings = new ArrayList<String>();
	  //ArrayList<String> list_Strings = new ArrayList<String>();
	  list_Strings.add("Red");
	  list_Strings.add("Green");
	  list_Strings.add("Orange");
	  list_Strings.add("White");
	  list_Strings.add("Black");
//	  System.out.println(list_Strings);
	  
      // printing using for each loop . 
	  for(String eachelement  : list_Strings){
		  System.out.println(eachelement);
	  }
	  
	  // using the Iterator interfaces  iterator() method, and , hasNext() and next() method. 
	  Iterator itr=list_Strings.iterator();
	  while(itr.hasNext()){
	  System.out.println(itr.next());
	  }
  }
}
