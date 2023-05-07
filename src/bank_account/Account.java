package bank_account;

class Person {
private String name;
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address + ", balance=" + balance + "]";
}
private String address;
private int balance;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getBalance() {
	return balance;
}
public void setBalance(int balance) {
	this.balance = balance;
}
public void deposit(int amount) {
	if(amount>0) {
	this.balance=this.balance+amount;
	}
	else {
		System.out.println("ammount should gretter then 0");
	}
}
public void withdraw(int amount) {
	if(amount<this.balance) {
		this.balance=this.balance-amount;
	}
	else {
		System.out.println("insufficient balance!!!");
	}
}
Person(String name,String address,int balance){
	this.name=name;
	this.address=address;
	this.balance=balance;
}
public void showdetails() {
	System.out.println("name is "+this.name+" address is "+this.address+" balance is "+this.balance);
}
}

public class Account{
	public static void main(String[] args) {
		Person a1= new Person("Raj","west bengal", 1000);
		Person a2= new Person("shiba","bengaluru", 5000);
		a1.showdetails();
		a2.showdetails();
		
		a1.setName("Rajesh");
		a2.setName("Ram");
		a1.showdetails();
		a2.showdetails();
	
		a1.deposit(5000);
		a2.deposit(5000);
		a1.showdetails();
		a2.showdetails();
		
		a1.withdraw(2000);
		a1.withdraw(6000);
		a1.showdetails();
		a2.showdetails();
		
		Person[] ar= {a1,a2};
		for(int i=0;i<ar.length;i++) {
			ar[i].showdetails();
		}		
	}
}
