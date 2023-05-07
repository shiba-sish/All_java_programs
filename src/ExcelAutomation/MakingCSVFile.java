package ExcelAutomation;

import java.io.File;
import java.io.IOException;
//wrong program
public class MakingCSVFile {
public static void main(String[] args) throws IOException {
	File f= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\excelsheet\\skillminedata.csv");
	f.createNewFile();
	System.out.println("csv file created successfully");
}
}

