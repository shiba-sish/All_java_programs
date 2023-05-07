package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Swaping {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("blue");
		list_String.add("black");
		list_String.add("green");
		list_String.add("pink");
		//before swapping
		System.out.println(list_String);
		
		Collections.swap(list_String, 0, 2);
		//after swapping
		System.out.println(list_String);
		
	}

}
