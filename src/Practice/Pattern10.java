package Practice;

public class Pattern10 {

	public static void main(String[] args) {
		for(int i=1;i<=4;i++) {
			boolean a=true;
			
			for(int j=1;j<=7;j++) {
			if(j>=i&&j<=8-i&&a) {
				System.out.print("*");
				a=false;
			}
			else {
				System.out.print(" ");
				a=true;
			}
			}
			System.out.println();
		
		}
	}
}
