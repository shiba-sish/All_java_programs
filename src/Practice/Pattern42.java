package Practice;

public class Pattern42 {

	public static void main(String[] args) {
		int a=0,b=10;
		int num1=-1;
		int num2=1;
		
		for(int i=1;i<=9;i++) {
			if(i<6) {a++;b--;}
			else {a--;b++;}
			boolean num=true;
			int sum=num1+num2;
			for(int j=1;j<=9;j++) {
					if(j>=a&&j<=b&&num) {
						System.out.print(sum+"  ");
						num=false;	
						}
						else {
							System.out.print("   ");
							num=true;
						}
					}
			System.out.println();
			num1=num2;
			num2=sum;
	}

}
}