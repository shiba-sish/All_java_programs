package array_programs;

public class Duplicate {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,9,8,7,6};
		int count=0;
		boolean s=false;
		int[] b= new int[5];
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					s=true;
			}
			}
			if(s==false) {
			b[count]=a[i];
			count++;
			}
	}
			for(int y=0;y<b.length;y++) {
				
		System.out.println(b[y]);
		
			}
}
}
