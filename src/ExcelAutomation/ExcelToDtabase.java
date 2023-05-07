package ExcelAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelToDtabase {

	public static void main(String[] args) throws Exception {
		//connect to database
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/skillmine", "root", "root");
		PreparedStatement ps= conn.prepareStatement("create table if not exists student_details(id int(3) not null unique , name varchar(100), address varchar(200))");
		ps.executeUpdate();
		
		//reading from excel sheet
		FileInputStream fis= new FileInputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\student_details.xlsx");
		
		//create the workbook
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sh = wb.getSheetAt(0);
		int rownum = sh.getLastRowNum();
		
		//to get only the data not the header, we will start the loop from 1 index
		for(int i=1; i<=rownum;i++) {
			Row r=  sh.getRow(i);
			//get the data from excel cell wise
			double id = r.getCell(0).getNumericCellValue();
			String name = r.getCell(1).getStringCellValue();
			String address = r.getCell(2).getStringCellValue();
			
			//now insert the data in database
			PreparedStatement ps1 = conn.prepareStatement("insert into student_details(id, name, address) values('"+id+"','"+name+"','"+address+"')");
			ps1.executeUpdate();
			ps1.execute("commit");
			
		}
		//close the workbook
		wb.close();
		//close file input stream
		fis.close();
		//close the connection
		conn.close();
		System.out.println("data successfully inserted");
			
	}

}
