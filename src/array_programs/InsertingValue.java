package array_programs;
//wrong
public class InsertingValue {

	public static void main(String[] args) {
		int pos=3,val=100,ind=0;
		int []a= {1,2,3,4,5,6,7};
		int []b= new int[a.length+1];
		for(int i=0;i<a.length;i++) {
		if(i==(pos-1)) {
		b[pos-1]=val;
		}
		if(b[pos-1]!=val) {
				b[i]=a[i];
				ind++;
		}
	}
		for(int i=0;i<b.length;i++) {
			System.out.println("b array: "+b[i]);
		}
		
	}
}
