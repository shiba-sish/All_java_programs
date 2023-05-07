package collection;

import java.util.LinkedHashSet;

public class LinkedHashSetExm {
public static void main(String[] args) {
	LinkedHashSet<Integer> al= new LinkedHashSet<Integer>();
	al.add(10);
	al.add(30);
	al.add(11);
	al.add(11);
	al.add(15);
	System.out.println(al);
}
}
