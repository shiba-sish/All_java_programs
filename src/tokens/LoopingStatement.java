package tokens;

import java.util.Scanner;

public class LoopingStatement {
	public static void main(String[] args) {
		System.out.println("Enter No");
		Scanner sc= new Scanner(System.in);
		int i= sc.nextInt();
		for(i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
//		do {
//			System.out.print(i+" ");
//		}while(i<=10);
//		while(i<=10) {
//			System.out.print(i+" ");
//		}
		
}
}