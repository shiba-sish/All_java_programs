package Practice;

public class Wave_pattern {
public static void main(String[] args) {
	for(int i=1;i<=4;i++) {
		char a='A';
		for(int j=1;j<=19;j++) {
			if((j==5-i || j==3+i)||(j==11-i || j==9+i) || (j==17-i || j==15+i)) {
				
//				System.out.print(a);
//				System.out.print((char)(64+j));
				System.out.print((char)(96+j));
				a++;
			}
			else {
				System.out.print(" ");
				a++;
			}
			
		}
		System.out.println();
		
	}
}
}
