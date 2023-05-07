package Practice;

public class Pattern16 {
public static void main(String[] args) {
	int row,col;
	int[] a= {1,2,3,4,5,6,7,8,9,10};
	for(row=0;row<a.length;row++) {
		for(col=row+1;col<a.length;col++) {
			int b = a[row]+a[col];
			if(b==19) {
				System.out.println(a[row]+" "+a[col]+" total 19");
			}
			else if (b==15) {
				System.out.println(a[row]+" "+ a[col]+" total 15");
			}
			else {
				
			}
		}
	}
}
}
