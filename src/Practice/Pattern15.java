package Practice;
public class Pattern15 {
public static void main(String[] args) {
	int k=1;
	for(int row=0;row<5;row++){
		for(int col=0;col<5;col++) {
			if(col==2) {
				System.out.print(k+" ");
				k++;
			}
			else {
			System.out.print("* ");
			}
		}
		System.out.println();
	}
}
}
