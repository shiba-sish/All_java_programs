package array_programs;

import java.util.Scanner;

public class O5_InsertingElementIntoArray {

	public static void main(String[] args) {
        int n, pos, element;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        
        // make the array one size bigger than the number entered
        int a[] = new int[n+1];
        System.out.println("\nEnter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        System.out.print("\nEnter the position where you want to insert element:");
        pos = s.nextInt();
        
        System.out.print("\nEnter the element you want to insert:");
        element = s.nextInt();
        
        
        // shift all the elements from right side till the position using a for loop . 
        for( int i = n-1; i>= pos-1; i--){
        	a[i+1] = a[i];
        }
        // now place the element in that position. 
        a[pos-1] = element;
        
        // print the array after inserting. 
        for(int i = 0; i< a.length; i++){
        	System.out.print(a[i]+" ");
        }
	}
}