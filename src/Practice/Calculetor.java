package Practice;

import java.util.Scanner;

public class Calculetor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first: ");
		double fn= sc.nextDouble();
		System.out.println("enter the second: ");
		double sn= sc.nextDouble();
		int i=0;
		do {
		System.out.println("press 1 to add two number: ");
		System.out.println("press 2 to sub two number: ");
		System.out.println("press 3 to mul two number: ");
		System.out.println("press 4 to dev two number: ");
		int c= sc.nextInt();
		if(c==1) {
			System.out.println("addition of the no: "+ (fn+sn));
		}
		else if (c==2) {
			System.out.println("substraction of the no: "+ (fn-sn));
		}
		else if (c==3) {
			System.out.println("multiplication of the no: "+ (fn*sn));
		}
		else if (c==4) {
			System.out.println("devition of the no: "+ (fn%sn));
		}
		else {
			System.out.println("something wrong heppens!!!!!!");
		}
		System.out.println("want to continue ? press:1 or press any key to exit: ");
		int x= sc.nextInt();
		i=x;
		}while(i==1);
	}

}
