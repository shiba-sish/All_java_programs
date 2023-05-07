package array_programs;

import java.util.Scanner;

public class O2LArgestElement {

	public static void main(String[] args) {
		int n, max, index = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        
        int a[] = new int[n];
        System.out.println("Enter elements of array:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
                index = i;
            }
        }
        System.out.println("Maximum value is : "+max + " at index "+ index);

	}

}
