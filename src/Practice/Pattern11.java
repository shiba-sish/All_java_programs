package Practice;

public class Pattern11 {

	public static void main(String[] args) {
		int a=6,b=4;
		int num=64;
		for(int i=1;i<=9;i++) {
		
			if(i<=5) {
				a--;
				b++;
				num++;
			}
			else {
				a++;
				b--;
				num--;
			}
			
			for(int j=1;j<=9;j++) {
			if(j==a||j==b) {
				System.out.print((char)num);
			}
			else {
				System.out.print(" ");
			}
			}
			System.out.println();
		
		}
	}
}
