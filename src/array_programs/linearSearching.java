package array_programs;

import java.util.Scanner;

public class linearSearching {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int a[]= {1,2,3,4,5,6,7,8,9,9,8,7,5};
		int index=0,count=0;
		System.out.println("Enter the no you want to find: ");
		int item= sc.nextInt();
		for(int i=0;i<a.length;i++) {
			int result=0;
			if(item==a[i]) {
				result=1;
				index=i;
				count++;
				
			}
		}
		System.out.println(index+" is present "+count);
	}

}
