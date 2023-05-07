package collection;

import java.util.Vector;

public class VectorEx {
public static void main(String[] args) {
	Vector al= new Vector<>();
	al.add(10);
	al.add(30);
	al.add(40.44);
	al.add('c');
	al.add("hi");
	al.add(null);
	al.add(11);
	System.out.println(al);
}
}
