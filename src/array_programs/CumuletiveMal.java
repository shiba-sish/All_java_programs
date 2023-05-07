package array_programs;

public class CumuletiveMal {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int sum=1,num;
		
		for(int i=0;i<a.length;i++) {
			num=sum;
			sum=sum*a[i];
			System.out.println("cumuletive mal: "+num+"*"+a[i]+" = "+sum);
		}
		System.out.println("total mal: "+sum);
	}

}
