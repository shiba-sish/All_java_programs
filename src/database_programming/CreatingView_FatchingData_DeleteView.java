package database_programming;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreatingView_FatchingData_DeleteView {
	public static void main(String[] args) throws SQLException {
		Connection con= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine","root","root");
			
			if(con==null) {
				System.out.println("unable to connect");
			}
			else {
				System.out.println("connected successfuly");
				PreparedStatement ps=con.prepareStatement("create view salary_bon(sal_bon,sal) as select sal+100,sal from emp");
				ps.executeUpdate();
				System.out.println("View created successfully");
				PreparedStatement ps1=con.prepareStatement("select * from salary_bon");
				ResultSet result = ps1.executeQuery();
				while(result.next()) {
					System.out.println(result.getInt(1)+"  "+result.getInt(2));
				}
				PreparedStatement ps2=con.prepareStatement("drop view salary_bon");
				ps2.executeUpdate();
				System.out.println("view Deleted");
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