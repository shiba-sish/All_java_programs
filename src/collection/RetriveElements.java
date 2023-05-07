package collection;

import java.util.ArrayList;
import java.util.List;

public class RetriveElements {

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
		
		String element =list_String.get(0);
		System.out.println("First Elements  "+element);
		String element1 =list_String.get(1);
		System.out.println("Second Elements  "+element1);
	}

}
