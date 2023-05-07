package tokens;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println("Enter Name");
		Scanner sc= new Scanner(System.in);
		String un=sc.nextLine();
		switch(un) {
		case "shiba":{
			System.out.println("access granted");
			break;
		}
		case "ram singh":{
			System.out.println("access granted");
			break;
		}
		default :{
			System.out.println("access decline");
			
		}
		}
	
	}

}
