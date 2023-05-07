package collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
public static void main(String[] args) {
	HashMap<String,Integer> hm1= new HashMap<String,Integer>();
	hm1.put("sam",10);
	hm1.put("ram",12);
	hm1.put("jam",11);
	hm1.put("gam",11);
	hm1.put("sea",15);
	System.out.println(hm1);
	
	for(Map.Entry x:hm1.entrySet()) {
		System.out.println(x.getKey()+" = "+x.getValue());
	}
	System.out.println("size of map : "+hm1.size());
	
	HashMap<String,Integer> hm2= new HashMap<String,Integer>();
	hm2.put("black",10);
	hm2.put("blue",12);
	hm2.put("green",11);
	hm2.put("red",11);
	System.out.println(hm2);
	//finding key
	System.out.println("\ngreen is there? "+hm2.containsKey("green"));
	//finding value
	System.out.println("\n12 value is there? "+hm2.containsValue(12));
	//get the value through key
	int val=(int)hm2.get("green");
	System.out.println(val);
	//print all key
	System.out.println(hm2.keySet());
	//print all value
	System.out.println(hm2.values());
	
	
	hm2.putAll(hm1);
	System.out.println(hm2);
	System.out.println("size of hm2: "+hm2.size());
	
	System.out.println("empty ? "+hm2.isEmpty());
	
	hm2.clear();//clear all the value and key
	
	System.out.println("empty ? "+hm2.isEmpty());
}
}
