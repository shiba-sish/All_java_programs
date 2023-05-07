package ExcelAutomation;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		//creating an instance of workbook interface
		Workbook wb1 = new XSSFWorkbook();
		//create an excel file at specific location
		OutputStream fo= new FileOutputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\mydata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		//giving sheet name
		XSSFSheet sheet0 =wb.createSheet("firstsheet");
		//selecting first row index is 0
		Row row0 = sheet0.createRow(0);
		//select the first cell column(0)
		Cell cellB=row0.createCell(1);
		
		cellB.setCellValue("Skillmine");
		
		File f= new File("C:\\\\Users\\\\Shibasish China\\\\eclipse-workspace\\\\project_001\\\\excelsheet\\\\mydata.xlsx");
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		fos.close();
		System.out.println("data is written in excel sheet");
	}

}
