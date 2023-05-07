import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Reverse_String {

	public static void main(String[] args) {
		String s="skillmine technology";
		char[] s1 = s.toCharArray();
		List l= new ArrayList();
		
		for(int i=0;i<s1.length;i++) {
			l.add(s1[i]);
		}
//		for(int i=l.size()-1;i>=0;i--) {
//			System.out.print(l.get(i));
//		}
		Collections.reverse(l);
		for(int i=0;i<s1.length;i++) {
			System.out.print(l.get(i));
		}
	}

}
