
//DataHiding Variable Hiding
//parent class  
class Demo  
{  
public static void method1()  
{  
System.out.println("Method-1 of the Demo class is executed.");  
}  
public void method2()  
{  
System.out.println("Method-2 of the Demo class is executed.");  
}  
}  
//child class  
public class Sample extends Demo  
{  
public static void method1()  
{  
System.out.println("Method-1 of the Sample class is executed.");  
}  
public void method2()  
{  
System.out.println("Method-2 of the Sample class is executed.");  
}  
public static void main(String args[])  
{  
Demo d1 = new Demo();  // object creation of Demo Class
//d2 is reference variable of class Demo that points to object of class Sample  
Demo d2 = new Sample();  //upcasting
Sample d3= new Sample();
//method calling with reference (method hiding)  
d1.method1();  // method 1 Demo
d2.method1();  // method 1 Demo
d3.method1(); // method 1 of Sample
d3.method2(); // method 2 of Sample
//method calling with object (method overriding)  
d1.method2();  // method 2 Demo
d2.method2();  //method 2 Sample
}  
}  