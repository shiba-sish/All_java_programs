package Practice;

public class Pattern19 {

	public static void main(String[] args) {
		int a=0,b=6;
		for(int i=1;i<=5;i++) {
			if(i<=3) {
				a++;
				b--;
			}
			else {
				a--;
				b++;
			}			
		for(int j=1;j<=5;j++) {
			if(j>a&&j<b) {
				System.out.print("*");
			}
			
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
	}

}
