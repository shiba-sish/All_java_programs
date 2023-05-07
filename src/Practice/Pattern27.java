package Practice;

public class Pattern27 {

	public static void main(String[] args) {
		int num=0;
		for(int i=1;i<=5;i++) {
			
			for(int j=1;j<=9;j++) {
					if(j>=6-i&&j<=4+i) {
						if(j<6) {num++;}
						else {num--;}
						System.out.print(num+" ");
						
					}
						else {
							System.out.print("  ");
						}
					}
			System.out.println();
	}

}
}