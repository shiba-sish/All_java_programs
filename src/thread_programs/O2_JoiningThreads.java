//package thread_programs;
//
//class John extends Thread{
//	public void run(){
//		for(int i = 1; i<=50; i++){
//			System.out.println(i+ " johns profile.");
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class Smith extends Thread{
//	public void run(){
//		for(int i = 1; i<=50; i++){
//			System.out.println(i+ " Smith profile.");
//		}
//	}
//}
//
//public class O2_JoiningThreads {
//	public static void main(String[] args) throws InterruptedException {
//		John j = new John();
//		Smith s = new Smith();
//		Thread t1 = new Thread(j);
//		Thread t2 = new Thread(s);
//		t1.start();
//		t1.join();
//		t2.start();
//	}
//}