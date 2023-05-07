package Practice;

import java.util.Scanner;

public class Hangry {

	static void add() {
		System.out.println("enter first num");
		Scanner sc1 =new Scanner(System.in);
		
		int a =sc1.nextInt();
		
		System.out.println("enter second num");
		Scanner sc2 =new Scanner(System.in);
		int b =sc2.nextInt();
		
		System.out.println(a+b);
		
	}
	
	public static void main(String[] args) {
		
		String choice = "yes";
		
		while(choice.equals("yes")) {
			add();
			System.out.println("do you wish to continue");
			Scanner sc3 =new Scanner(System.in);
			choice =sc3.next();
		}
	}
}
