 package collection;
import java.util.HashMap;

public class LinkedHashsetExample {
public static void main(String[] args) {
	HashMap<String,Integer> al= new HashMap<String,Integer>();
	al.put("sam",10);
	al.put("ram",null);
	al.put("jam",11);
	al.put("gam",11);
	al.put(null,15);
	System.out.println(al);
}
}
