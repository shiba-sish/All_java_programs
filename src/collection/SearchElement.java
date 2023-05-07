package collection;

import java.util.ArrayList;
import java.util.List;

public class SearchElement {

	public static void main(String[] args) {
		List<String> list_String=new ArrayList<String>();
		list_String.add("red");
		list_String.add("blue");
		list_String.add("black");
		list_String.add("green");
		list_String.add("pink");
		
		if(list_String.contains("red")) {
			System.out.println("founded");
		}
		else {
			System.out.println("Not founded");
		}
	}

}
