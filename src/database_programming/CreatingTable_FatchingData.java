package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//creating, updating, show all tables,describe table
public class CreatingTable_FatchingData {
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
				PreparedStatement ps3=con.prepareStatement("update student set name = 'ram' where id = 3");
				ps.executeUpdate();
				System.out.println("Table updated successfully");
				PreparedStatement ps1=con.prepareStatement("show tables");
				ResultSet result = ps1.executeQuery();
				while(result.next()) {
					System.out.println(result.getString(1));
				}
				PreparedStatement ps2=con.prepareStatement("desc student");
				ResultSet result1 = ps2.executeQuery();
				while(result1.next()) {
					System.out.println(result1.getString(1));
				}
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