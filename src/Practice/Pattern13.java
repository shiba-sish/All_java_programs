package Practice;

public class Pattern13 {

	public static void main(String[] args) {
//		int num=1;
		for(int i=0;i<5;i++) {
//			int k=num;
			for(int j=1;j<=5;j++) {
			if(j<=i) {
				System.out.print("0 ");
//				k++;
			}
			else {
				System.out.print(i+j+" ");
//				k++;
			}
			}
			System.out.println();
		
		}
	}
}
