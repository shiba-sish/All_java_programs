package collection;

import java.util.TreeMap;

public class TreeMapEx2 {
public static void main(String[] args) {
	TreeMap<String,Integer> al= new TreeMap<String,Integer>();
	al.put("sam",10);
	al.put("ram",12);
	al.put("jam",11);
	al.put("gam",11);
	al.put("sea",15);
	System.out.println(al);
	//get the first key
	System.out.println(al.firstKey());
	//get the last key
	System.out.println(al.lastKey());
//	//Fetch first element from the tree
//	System.out.println(al.pollFirstEntry());
//	//Fetch last element from the tree
//	System.out.println(al.pollLastEntry());
	//get the first entry
	System.out.println(al.firstEntry());
	//get the last entry
	System.out.println(al.lastEntry());
}
}
