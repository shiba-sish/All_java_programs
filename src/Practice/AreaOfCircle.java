package Practice;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double r= sc.nextDouble();
		int area= (int) (3.142* (r*r));
		System.out.println(area);
		
	}

}
