package tokens;

import java.util.Scanner;

public class ScannerInputs {

	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner sc= new Scanner(System.in);
		String un=sc.nextLine();
		if(un.equals("shiba")) {
			System.out.println("access granted");
		}
		else if(un.equals("ram")) {
			System.out.println("access granted");
		}
		else {
			System.out.println("access denied");
		}
	
	}

}
