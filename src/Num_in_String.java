
public class Num_in_String {
public static void main(String[] args) {
	String s= "hellow Skill-mine";
	int i=9;
	String s1="";
	for(int j=0;j<s.length();j++) {
		if(j<i) {
			s1=s1+s.charAt(j);
		}
		else if(j==i) {
			s1=s1+i;
		}
		else {
			s1=s1+s.charAt(j);
		}
	}
	String ss = s.replaceFirst("i", "9");
	System.out.println(ss);
	System.out.println(s1);
}
}
