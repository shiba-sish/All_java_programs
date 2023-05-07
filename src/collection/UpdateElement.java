package collection;

import java.util.ArrayList;
import java.util.List;

public class UpdateElement {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("blue");
		list_String.add("black");
		list_String.add("green");
		list_String.add("pink");
		
		System.out.println(list_String);
		
		list_String.set(2, "Brown");
		list_String.set(4, "sky");
		
		System.out.println(list_String);
	}

}
