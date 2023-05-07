package ExcelAutomation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Getting_Text_Excel {
public static void main(String[] args) throws IOException {
	FileInputStream fis= new FileInputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\trainee.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(fis);
	XSSFSheet sheet= wb.getSheet("data");
	int rowNum = sheet.getLastRowNum()+1;
	Row row =sheet.getRow(0);
	int col=row.getLastCellNum();
	for(int i=0; i<rowNum;i++) {
		for(int j=0;j<col;j++) {
	XSSFCell text = wb.getSheet("data").getRow(i).getCell(j);
	System.out.print(text+"----->>");
	}
		System.out.println();
	}
//    System.out.println("Total Number of Columns in the excel is : "+col);
//    System.out.println("Total Number of Rows in the excel is : "+rowNum); 
//	
}
}
