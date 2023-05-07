package Practice;

public class Pattern29 {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=7;i++) {
			if(i<5) {num++;}
			else {num--;}
			
			for(int j=1;j<=4;j++) {
					if(j<=num) {
						System.out.print("* ");
						
					}
						else {
							System.out.print("  ");
						}
					}
			System.out.println();
	}

}
}