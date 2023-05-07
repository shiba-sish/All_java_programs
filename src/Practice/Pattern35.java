package Practice;

public class Pattern35 {

	public static void main(String[] args) {
		int a=6,b=4;
		
		for(int i=1;i<=9;i++) {
			if(i<6) {a--;b++;}
			else {a++;b--;}
			boolean num=true;
			
//			int a=1;
			for(int j=1;j<=9;j++) {
					if(j>=a&&j<=b&&num) {
						System.out.print("* ");
						num=false;					}
						else {
							System.out.print("  ");
							num=true;
						}
					}
			System.out.println();
	}

}
}