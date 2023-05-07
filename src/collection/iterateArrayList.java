package collection;

import java.util.ArrayList;
import java.util.List;

public class iterateArrayList {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("blue");
		list_String.add("black");
		list_String.add("green");
		list_String.add("pink");
		
		System.out.println(list_String);
		
		list_String.add(2, "Brown");
		list_String.add(4, "sky");
		for(String s:list_String) {
			System.out.println(s);
		}
//		Iterator it=list_String.iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}
	}

}
