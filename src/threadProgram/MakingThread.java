package threadProgram;

public class MakingThread {

	public static void main(String[] args) {
		NoPrint n1= new NoPrint();
		NamePrint n2= new NamePrint();
		
		Thread t1= new Thread(n1);
		Thread t2= new Thread(n2);
		
		t1.start();
		t2.start();
	}
}
	class NamePrint implements Runnable{
		public void run() {
			for(int i=1;i<=50;i++) {
				System.out.print("java"+" ");
			}
		}
	}
	class NoPrint extends Thread{
		public void run() {
			for(int i=1;i<=50;i++) {
				System.out.print(i+" ");
			}
		}
	}

