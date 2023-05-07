package Practice;

public class Pattern32 {

	public static void main(String[] args) {
		int num=0;
		
		for(int i=1;i<=7;i++) {
			if(i<5) {num++;}
			else {num--;}
			int a=1;
			for(int j=1;j<=4;j++) {
					if(j<=num) {
						System.out.print(a+" ");
						a++;
					}
						else {
							System.out.print("  ");
						}
					}
			System.out.println();
	}

}
}