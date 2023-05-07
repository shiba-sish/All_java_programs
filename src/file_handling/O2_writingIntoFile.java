package file_handling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class O2_writingIntoFile{
 public static void main(String[] args) throws IOException {
	 try{
		 File f = new File("C:/Users/Administrator/Desktop/java_selenium_programs/core_java_programs/notes/filehandlingnotes.txt");
		 	FileWriter fw =new FileWriter(f, true);
		 	fw.write("\nThis is the Third line");
		 	System.out.println("Data is written to the file.");	 	
		 	fw.close();
	 }
	 catch(Exception ex){
		 ex.printStackTrace();
		 System.out.println("File not written");
	 }
  }
}