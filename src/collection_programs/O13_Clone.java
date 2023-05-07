package collection_programs;

import java.util.ArrayList;

public class O13_Clone {
	public static void main(String[] args) {
        ArrayList<String> c1= new ArrayList<String>();
        c1.add("Red");
        c1.add("Green");
        c1.add("Black");
        c1.add("White");
        c1.add("Pink");
        System.out.println("Original array list: \n" + c1);
        
        ArrayList<String> newc1 = (ArrayList<String>)c1.clone();
        System.out.println("Cloned array list: \n" + newc1);
        
        
//        ArrayList<String> ar= new ArrayList<String>();
//         Object newar = c1.clone();
//        System.out.println("Cloned array list: \n" + newar);       
  }
}