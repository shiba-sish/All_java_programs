package oops;

public class AbstractionEx {
public static void main(String[] args) {
	Sample s=new Sample();
	Calculetor c= new Sample();
	s.add();
	s.subtract();
	
  }
}
abstract class Calculetor{
	//this is concrete method
	void add() {
		int a=10,b=20;
		System.out.println(a+b);
	}
	abstract void subtract();
}
class Sample extends Calculetor{
	void subtract() {
		int m=33,n=57;
		System.out.println(m+n);
	}
}

