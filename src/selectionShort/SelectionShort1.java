package selectionShort;

public class SelectionShort1 {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,44,5,4,88};
		int minindex=0;
		for(int i=0;i<a.length;i++) {
			minindex=min(a, i);
			int t=a[i];
			a[i]=a[minindex];
			a[minindex]=t;
		}
		//print sorting value
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
		public static int min(int a[],int i) {
			int minvalue=a[i];
			int miniindex=i;
			for(int j=i+1;j<a.length;j++) {
				if(minvalue>a[j]) {
					minvalue=a[j];
					miniindex=j;
				}
			}
			return miniindex;
		}
		
}
