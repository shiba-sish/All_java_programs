package array_programs;

import java.util.Scanner;

public class O6_DeletingElements {

	public static void main(String[] args) {
        int n, pos = 0, element;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        
        // make the array one size bigger than the number entered
        int a[] = new int[n];
        System.out.println("\nEnter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        
        
        System.out.print("\nEnter the element you want to delete");
        element = s.nextInt();
        
        
        // shift all the elements from right side till the position using a for loop . 
        for( int i = 0; i< a.length; i++){
        	if(a[i] == element){
        		pos = i;
        	}
        }
        
       // element you are trying to delete is at position 
        System.out.println("element you are trying to delete is at position " + pos);
        
        // 
        for(int i = pos; i<a.length-1; i++){
        	a[i] = a[i+1];
        }
        
        int a2[] = new int[n];
        
        for(int i = 0; i<a.length-1; i++){
        	a2[i] = a[i];
           System.out.println(a2[i]);
        }
	}
}
