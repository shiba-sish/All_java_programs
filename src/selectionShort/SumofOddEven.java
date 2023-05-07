package selectionShort;

import java.util.Scanner;

public class SumofOddEven {
	public static void main(String[] args) {
		System.out.println("Enter the length of array: ");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int[] a= new int[n];
		System.out.println("Enter "+n+" elements of array: ");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int sumeven=0,sumodd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) {
				sumeven=sumeven+a[i];
				System.out.println("even "+sumeven);
			}
			else {
				sumodd=sumodd+a[i];
				System.out.println("odd "+sumodd);
			}
		}
		int totalsum=sumeven+sumodd;
		System.out.println("total sum of odd and even :"+totalsum);
	}
}
