package collection;

import java.util.ArrayList;

public class Clone {

	public static void main(String[] args) {
		ArrayList<String> c1=new ArrayList<String>();
		c1.add("red");
		c1.add("blue");
		c1.add("black");
		c1.add("green");
		c1.add("pink");
		System.out.println(c1);
		ArrayList<String> new1=(ArrayList<String>)c1.clone();
		System.out.println(new1);
		new1.removeAll(new1);
		System.out.println(new1);
	}

}
