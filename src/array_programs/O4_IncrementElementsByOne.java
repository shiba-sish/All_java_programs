package array_programs;

import java.util.Scanner;

public class O4_IncrementElementsByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        
        System.out.println("THe original arrya is \n");
        for(i = 0; i < n; i++)
        {
        	System.out.print(a[i]+", ");

        }
        
        // incrementing all the numbers by 1. 
        
        for(i = 0; i < n; i++)
        {
        	a[i]++;
        }
        
        
        System.out.print("\nElements of array after increment by 1 is :\n");
        for(i = 0; i < n - 1; i++)
        {
            System.out.print(a[i]+", ");
        }
        System.out.print(a[n-1]);
	}
} 