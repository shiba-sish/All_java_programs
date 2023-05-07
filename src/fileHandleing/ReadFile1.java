package fileHandleing;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) throws IOException {
		try {
		File newFolder= new File("C:\\Users\\Shibasish China\\eclipse-workspace\\project_001\\data/javanotes/java.txt");
		FileWriter fw=new FileWriter(newFolder, true);
		fw.write("\n this is my second line");
		System.out.println("data is written to the file");
		fw.close();
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("File not written");
		}
	}
}
