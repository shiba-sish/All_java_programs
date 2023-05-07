package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DeletingData {
	public static void main(String[] args) throws SQLException {
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","root");
			
			if(con==null) {
				System.out.println("unable to connect");
			}
			else {
				System.out.println("connected successfuly");
				PreparedStatement ps=con.prepareStatement("create table if not exists student(id int(5) primary key auto_increment, name varchar(100), address varchar(200))");
				ps.executeUpdate();
				System.out.println("Table created successfully");
				PreparedStatement ps1=con.prepareStatement("insert into student (name, address) values ('Yelena Bulfield', 'PO Box 26806')");
				ps1.executeUpdate();
				System.out.println("Inserting data in Table successfully");
				PreparedStatement ps2=con.prepareStatement("drop table student");
				ps2.executeUpdate();
				System.out.println("table droped");
				
		}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Table not created");
		}
		finally {
			con.close();
		}
}
}