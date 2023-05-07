package collection;

import java.util.HashMap;

public class LinkedHashMapEx {
public static void main(String[] args) {
	HashMap<String,Integer> al= new HashMap<String,Integer>();
	al.put("sam",10);
	al.put("ram",12);
	al.put("jam",11);
	al.put("gam",11);
	al.put("sea",15);
	al.put(null,15);
	al.put(null,19);
	al.put("wow",null);
	System.out.println(al);
}
}
