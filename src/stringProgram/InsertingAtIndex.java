package stringProgram;

public class InsertingAtIndex {

	public static void main(String[] args) {
		int a[] = {11,22,33,44,55,66};
		int index=5;
		int input=200;
		int b[]= new int[a.length+1];
		for(int j=0;j<a.length;j++){
			if(j>=index) {
			b[j+1]=a[j];
			}
			else{
				b[j]=a[j];
			}
		}
		b[index]=input;
		for(int x=0;x<b.length;x++) {
			System.out.println(b[x]+" ");
		}
		
		
	}

}
