//package thread_programs;
//
//class NumberPrinting extends Thread{
//	public void run(){
//		for(int i = 1; i<=50; i++){
//			System.out.print(i+" ");
//		}
//	}
//}
//
//class NamePrinting implements Runnable{
//	public void run(){
//		for(int i = 1; i<=50; i++){
//			System.out.print("java" + " ");
//		}
//	}
//}
//
//public class O1_MakingThread {
//	public static void main(String[] args) 	{
//		NumberPrinting n1 = new NumberPrinting();	
//		NamePrinting n2 = new NamePrinting();
//		
//		Thread t1 = new Thread(n1);
//		Thread t2 = new Thread(n2);
//		
//		t1.start();
//		t2.start();
//	}
//}