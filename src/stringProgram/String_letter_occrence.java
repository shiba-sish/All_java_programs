package stringProgram;

public class String_letter_occrence {

	public static void main(String[] args) {
		String s="shibasish";
		int[] count= new int[128];
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			count[ch]++;
		}
		for(int i=0;i<count.length;i++) {
			if(count[i]!=0) {
				System.out.println((char)i+" is "+count[i]);
		}
	}

	}}
