package array_programs;

import java.util.Scanner;

public class O1_printing_arrays {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many digits you want to enter into the array.");
		int number = sc.nextInt();
		
		int []a = new int[number];
		
		System.out.println("enter " + number + " numbers into the array");
		
		for(int i = 0; i<number; i++){
			a[i] = sc.nextInt();
		}

		System.out.println("entered array is ");
		for(int i =0; i< a.length; i++){
			System.out.print(a[i] + " ");
		}
		
		System.out.println("\nprinting the array in reverse.");
		for(int i = a.length-1; i>=0; i--){
			System.out.print(a[i]+" ");
		}
	}
}