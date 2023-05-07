package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Showing_Database {
public static void main(String[] args) {
	Connection con= null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","root");
		
		if(con==null) {
			System.out.println("unable to connect");
		}
		else {
			System.out.println("connected");
			PreparedStatement ps=con.prepareStatement("show databases");
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				System.out.println(result.getString(1));
			}
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
