package tokens;

public class LoopingStatement2 {
	public static void main(String[] args) {
		int i= 1;
		for(i=1;i<=10;i++) {
//			if(i>=3&&i<=7) {
//				continue;
//			}
			if(i==3 ||i==5 ||i==8) {
				continue;
			}
			System.out.print(i+" ");
			if(i==9) {
				break;
			}
		}

		
}
}