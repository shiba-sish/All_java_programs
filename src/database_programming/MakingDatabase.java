package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MakingDatabase {

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
				PreparedStatement ps=con.prepareStatement("create database college");
				int result = ps.executeUpdate();
				if(result>0) {
					System.out.println("Database create successfully");
				}
				else {
					System.out.println("Database not create");
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
