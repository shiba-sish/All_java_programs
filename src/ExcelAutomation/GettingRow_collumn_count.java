package ExcelAutomation;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class GettingRow_collumn_count {

	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\trainee.xlsx");
		       XSSFWorkbook workbook = new XSSFWorkbook(fis);
		       XSSFSheet sheet = workbook.getSheet("data");
		       Row row = sheet.getRow(0);
		       int colNum = row.getLastCellNum();
		       System.out.println("Total Number of Columns in the excel is : "+colNum);
		       int rowNum = sheet.getLastRowNum()+1;
		       System.out.println("Total Number of Rows in the excel is : "+rowNum);
		}
		catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
