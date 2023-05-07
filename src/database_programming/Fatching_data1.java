package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Fatching_data1 {
public static void main(String[] args) {
	Connection con= null;//global variable
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");//most of time 'cj' is not needed in new version.
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
		//jdbc connection , username ,password
		
		if(con==null) {
			System.out.println("unable to connect");
		}
		else {
			System.out.println("connected");
			PreparedStatement ps=con.prepareStatement("select * from dept");
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+result.getString(2)+"  "+result.getString(3));
			}
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
