package collection;

import java.util.ArrayList;
import java.util.List;

public class Remove {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("blue");
		list_String.add("black");
		list_String.add("green");
		list_String.add("pink");
		
		System.out.println(list_String);
		
		list_String.remove(2);
		list_String.remove(4);
		
		System.out.println(list_String);
	}

}
