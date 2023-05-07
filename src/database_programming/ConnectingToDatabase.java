package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectingToDatabase {
public static void main(String[] args) {
	Connection con= null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
		
		if(con==null) {
			System.out.println("unable to connect");
		}
		else {
			System.out.println("connected successfully");
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
