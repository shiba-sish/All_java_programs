package ExcelAutomation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingExcelSheet {

	public static void main(String[] args) throws IOException, EncryptedDocumentException, InvalidFormatException {
		//creating an instance of workbook interface
		Workbook wb1 = new XSSFWorkbook();
		//create an excel file at specific location
		FileOutputStream fo= new FileOutputStream("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\skillminedata.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fo);
		//giving sheet name
		XSSFSheet sheet0 =wb.createSheet("firstsheet");
		//selecting first row index is 0
		Row row0 = sheet0.createRow(0);
		//select the first cell column(0)
		Cell cellB=row0.createCell(0);
		
		cellB.setCellValue("Skillmine");
		
		File f= new File("C:\\\\Users\\\\Shibasish China\\\\eclipse-workspace\\\\project_001\\\\excelsheet\\\\skillminedata.xlsx");
		FileOutputStream fos =new FileOutputStream(f);
		wb.write(fos);
		System.out.println("data is written in excel sheet");
		File f1 = new File("C:\\\\Users\\\\Shibasish China\\\\eclipse-workspace\\\\project_001\\\\excelsheet\\\\skillminedata.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb2 = WorkbookFactory.create(fis);
		 Sheet sh = wb2.getSheetAt(0);
		 Row rw =sh.getRow(0);
		 Cell c =rw.getCell(0);
		 System.out.println(c);
		fis.close();
		fos.close();
		
	}

}
