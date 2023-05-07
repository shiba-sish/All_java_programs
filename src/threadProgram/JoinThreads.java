package threadProgram;

public class JoinThreads {

	public static void main(String[] args) throws InterruptedException {
		NoPrinting n1= new NoPrinting();
		NamePrinting n2= new NamePrinting();
		
		Thread t1= new Thread(n1);
		Thread t2= new Thread(n2);
		
		t1.start();
		t1.join();
		t2.start();
	}
}
	class NamePrinting implements Runnable{
		public void run() {
			for(int i=1;i<=50;i++) {
				System.out.print("java"+" ");
			}
		}
	}
	class NoPrinting extends Thread{
		public void run() {
			for(int i=1;i<=50;i++) {
				System.out.print(i+" ");
			}
		}
	}

