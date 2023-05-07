package Practice;

public class Pattern37 {

	public static void main(String[] args) {
		int a=0,b=10;
		int c=1;
		for(int i=1;i<=9;i++) {
			if(i<6) {a++;b--;}
			else {a--;b++;}
			boolean num=true;
			
			for(int j=1;j<=9;j++) {
					if(j>=a&&j<=b&&num) {
						System.out.print(c+" ");
						
						num=false;					}
						else {
							System.out.print("  ");
							num=true;
						}
					}
			System.out.println();
			c++;
	}

}
}