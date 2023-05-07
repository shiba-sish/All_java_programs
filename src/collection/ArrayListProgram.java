package collection;

import java.util.ArrayList;

public class ArrayListProgram {
public static void main(String[] args) {
	ArrayList<Object> al= new ArrayList<>();
	al.add(10);
	al.add(30);
	al.add(40.44);
	al.add('c');
	al.add("hi");
	al.add(null);
	al.add(11);
	System.out.println(al);
	ArrayList<Integer> al1= new ArrayList<Integer>();
	al1.add(10);
	al1.add(30);
	al1.add(null);
	al1.add(11);
	System.out.println(al1);
}
}
