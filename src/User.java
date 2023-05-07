
public class User implements C{

	public static void main(String[] args) {
		
		User u= new User();
		System.out.println(u.a);
		System.out.println(u.b);	
	}
}
interface A{
	int a=20;
}
interface B{
	int b=30;
}
interface C extends A,B{
	
}
