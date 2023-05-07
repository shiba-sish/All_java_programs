package oops;
//encapsulation
public class User {

	public static void main(String[] args) {
		Gmail g= new Gmail();
		System.out.println(g.getUs());
		System.out.println(g.getPwd());
		System.out.println("Enter new us and pwd: ");
		g.setPwd("abc123");
		g.setUs("abc");
		System.out.println(g.getUs());
		System.out.println(g.getPwd());
	}

}
class Gmail 
//bean class
{
	private String us="shiba";
	private String pwd="shiba@321";
	public String getUs() {
		return us;
	}
	public void setUs(String us) {
		this.us = us;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
