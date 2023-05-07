package ExcelAutomation;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreatingExcelSheet {
public static void main(String[] args) throws FileNotFoundException {
	//creating an instance of workbook interface
	Workbook wb = new XSSFWorkbook();
	//create an excel file at specific location
	OutputStream fo= new FileOutputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\skillmine.xlsx");
	System.out.println("excel file created successfilly");
}
}

