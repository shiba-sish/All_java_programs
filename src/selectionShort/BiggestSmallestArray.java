package selectionShort;

import java.util.Scanner;

public class BiggestSmallestArray {

	public static void main(String[] args) {
	System.out.println("Enter the length of array: ");
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int[] a= new int[n];
	System.out.println("Enter "+n+" elements of array: ");
	for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
	}
	System.out.println("Smallest is: "+smallest(a));
	System.out.println("Biggest is: "+biggest(a));
	sc.close();
	}
		public static int smallest(int a[]) {
		int smallest=a[0];
		
		for(int i=1;i<a.length;i++) {
			if(smallest>a[i]) {
				smallest=a[i];
			}
		}
		return smallest;
	}
		public static int biggest(int a[]) {
			int biggest=a[0];
			for(int i=1;i<a.length;i++) {
				if(biggest<a[i]) {
					biggest=a[i];
				}
			}
			return biggest;
		}

}
