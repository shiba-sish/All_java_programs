package array_programs;

public class CumuletiveSum {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int sum=0,num;
		
		for(int i=0;i<a.length;i++) {
			num=sum;
			sum=sum+a[i];
			System.out.println("cumuletive sum: "+num+"+"+a[i]+" = "+sum);
		}
		System.out.println("total sum: "+sum);
	}

}
