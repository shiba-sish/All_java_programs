package thread_programs;

class Document{
	void printdocuments(int numofcopies, String documentname)
	{
		for ( int i = 1; i<= numofcopies; i++){
			System.out.println(i + " "+ documentname);
		}
	}
}

class John extends Thread{
	// global reference variable of Document class.
	Document d;
	
	// constructor.
	John(Document d){
		this.d = d;
	}
	
	public void run(){
		synchronized  (d){
		d.printdocuments(50, "john pdf");
	}
 }
}

class Smith extends Thread{
	// global reference variable of Document class.
	Document d;
	
	// constructor. 
	Smith(Document d){
		this.d = d;
	}
	
	public void run(){
		synchronized (d){
		d.printdocuments(10, "Smith pdf");
	}
 }
}

public class O4_SynchronezedBlock {
	public static void main(String[] args) throws InterruptedException {
		Document d  = new Document();
		John j = new John(d);
		Smith s = new Smith(d);
		j.start();
		s.start();
	}
}