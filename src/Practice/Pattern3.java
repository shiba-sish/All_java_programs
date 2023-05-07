package Practice;

public class Pattern3 {  
	public static void main(String args[])   
	{           
	for (int i=0; i<=5; i++)   
	{  
	for (int j=2*(5-i); j>=0; j--)         
	{  
	System.out.print(" ");   
	}   
	for (int j=1; j<=i; j++ )   
	{   
	System.out.print(i+" ");   
	}   
	System.out.println();   
	}   
	}   
	}
