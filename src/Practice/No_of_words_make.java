package Practice;

public class No_of_words_make {

	public static void main(String[] args) {
		String s="abc";
		char[] c= s.toCharArray();
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length;j++) {
				for(int k=0;k<c.length;k++) {
					System.out.println(c[i]+""+c[j]+""+c[k]);
				}
			}
			
		}
	}

}
