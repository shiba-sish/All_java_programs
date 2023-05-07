package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Executing_Quary {
public static void main(String[] args) {
	Connection con= null;
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
		
		if(con==null) {
			System.out.println("unable to connect");
		}
		else {
			System.out.println("connected");
			PreparedStatement ps=con.prepareStatement("select * from emp where sal>1000");
			ResultSet result = ps.executeQuery();
			while(result.next()) {
				System.out.println(result.getInt(1)+" "+result.getString(2)+"  "+result.getString(3)+result.getInt(4)+" "+result.getInt(5)+" "+result.getInt(6)+" "+result.getInt(7));
			}
		}
	}
	catch(Exception e){
		e.printStackTrace();
	}
}
}
